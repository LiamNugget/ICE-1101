public class DieGame2 {
  public static void main(String[] args) {
    // Initialize score to 0
    int score = 0;

    // Create two dice with 6 sides
    Die die1 = new Die(6);
    // Throw the die
    die1.throwDie();

    Die die2 = new Die(6);
    die2.throwDie();

    // Display the header for the game
    System.out.println("\nStarting Doubles ...\n");
    System.out.println("Die 1\tDie 2");
    System.out.println("-----\t-----");

    // Loop to throw the dice 3 times
    for (int i = 0; i < 3; i++) {
      if (die1.getFaceValue() == die2.getFaceValue()) {
        // If the dice are equal, increment the score
        score += 1;
      }

      // Display the face values of the dice
      System.out.println(die1.getFaceValue() + "\t" + die2.getFaceValue());
      die1.throwDie();
      die2.throwDie();
    }

    // Display the final score
    System.out.println("\nYour score = " + score + "\n");
  }
}