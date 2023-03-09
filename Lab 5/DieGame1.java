public class DieGame1 {
  public static void main(String[] args) {

    Die die1 = new Die(6);

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
        gameOver = true;
        System.out.println("\nYou've thrown a six! You win with a score of " +
                           score + "!\n");
      } else if (score < 1) {
        gameOver = true;
        System.out.println("\nYou lose!\n");
      }
      score--;
    }
  }
}