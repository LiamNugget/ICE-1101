// import java.util.Scanner;
import java.util.Scanner;

public class DiePig {
  public static void main(String[] args) {

    // Initialize variables
    boolean gameOver = false;
    boolean notOne = true;
    int turnCounter = 0;
    int pointHolder = 0;

    // Create a Player object
    Player player1 = new Player(0, "player1");
    Player player2 = new Player(0, "player2");
    // Create a Die object
    Die die1 = new Die(6);

    // create a Scanner object to read input
    Scanner input = new Scanner(System.in);
    System.out.print("\nWhat is the first players name :> ");
    String name1 = input.next();
    // Set the name of the player
    player1.setName(name1);

    System.out.print("What is the second players name :> ");
    String name2 = input.next();
    // Set the name of the player
    player2.setName(name2);

    System.out.println("\nStarting DiePig ...\n");

    // Loop to throw the die until gameOver is true
    while (!gameOver) {

      // Check if the turn counter is even or odd to determine which player's
      // turn it is
      if (turnCounter % 2 == 0) {
        // Reset the point holder to 0
        pointHolder = 0;
        System.out.println(player1.getName() + "'s turn\n");
        System.out.println("Die Face\tCurrent Score\tTotal Score");
        System.out.println("--------\t------------\t----------");
        // Loop to throw the die until a 1 is rolled
        while (notOne) {
          die1.throwDie();
          pointHolder += die1.getFaceValue();
          System.out.println(die1.getFaceValue() + "\t\t" + pointHolder +
                             "\t\t" + player1.getScore());
          // Check if the die face value is 1
          if (die1.getFaceValue() == 1) {
            // If 1 is rolled, end the game and display a lose message with the
            // final
            notOne = false;
            System.out.println(
                "\nYou've thrown a one! You lose your score of " + pointHolder +
                "!\n");
            pointHolder = 0;
            // Reset the point holder to 0
          } else {
            System.out.println("\nWould you like to roll again? (y/n) :> ");
            String answer = input.next();
            // Check if the user wants to roll again
            if (answer.equals("n")) {
              player1.setScore(pointHolder);
              notOne = false;
            }
          }
        }
        notOne = true;
      } else {
        // Reset the point holder to 0
        pointHolder = 0;
        System.out.println(player2.getName() + "'s turn\n");
        System.out.println("Die Face\tCurrent Score\tTotal Score");
        System.out.println("--------\t------------\t----------");
        // Loop to throw the die until a 1 is rolled
        while (notOne) {
          die1.throwDie();
          pointHolder += die1.getFaceValue();
          System.out.println(die1.getFaceValue() + "\t\t" + pointHolder +
                             "\t\t" + player2.getScore());
          // Check if the die face value is 1
          if (die1.getFaceValue() == 1) {
            // If 1 is rolled, end the game and display a lose message with the
            notOne = false;
            System.out.println(
                "\nYou've thrown a one! You lose your score of " + pointHolder +
                "!\n");
            pointHolder = 0;
            // Reset the point holder to 0
          } else {
            System.out.println("\nWould you like to roll again? (y/n) :> ");
            String answer = input.next();
            if (answer.equals("n")) {
              player2.setScore(pointHolder);
              // If the user does not want to roll again, set the score of the
              // player to the point holder
              notOne = false;
            }
          }
        }
        notOne = true;
      }
      // Increment the turn counter
      turnCounter++;
      // Check if either player has a score of 100 or more
      if (player1.getScore() >= 100) {
        gameOver = true;
        // If the player has a score of 100 or more, end the game and display a
        // win message
        System.out.println(player1.getName() + " wins with a score of " +
                           player1.getScore() + "!");
      } else if (player2.getScore() >= 100) {
        gameOver = true;
        System.out.println(player2.getName() + " wins with a"
                           + " score of " + player2.getScore() + "!");
      }
    }
  }
}