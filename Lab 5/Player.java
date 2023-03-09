public class Player {

  public String name;
  // Player constructor
  public Player(int initialScore, String name) {
    name = name;
    score = initialScore;
  }

  // Increases score
  public void setScore(int points) { score += points; }

  // Returns value of players score
  public int getScore() { return score; }

  // Get players name
  public String getName() { return name; }

  // Set players name
  public void setName(String name) { this.name = name; }

  // Instance variable to store Player’s score
  private int score;
}