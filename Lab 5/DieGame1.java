public class DieGame1 {
  public static void main(String[] args) {

    // Create a die with 6 sides
    Die die1 = new Die(6);

    // Set initial score to 5 and initialize flag that game is not over
    int score = 5;
    boolean gameOver = false;

    System.out.println("\nStarting Six or Lose ...\n");
    System.out.println("Die Face\tScore");
    System.out.println("--------\t-----");

    // Loop to throw the die until a 6 is rolled
    while (!gameOver) {
      die1.throwDie();
      System.out.println(die1.getFaceValue() + "\t\t" + score);
      if (die1.getFaceValue() == 6) {
        // If 6 is rolled, end the game and display a win message with the final
        // score
        gameOver = true;
        System.out.println("\nYou've thrown a six! You win with a score of " +
                           score + "!\n");
      } else if (score < 1) {
        // If 6 isn't rolled before the score reaches 0, end the game and
        // display a lose message
        gameOver = true;
        System.out.println("\nYou lose!\n");
      }
      // Decrement the score on each turn
      score--;
    }
  }
}
