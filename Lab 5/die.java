// Import the Random class
import java.util.Random;

public class Die {
  // Current face value of die
  private int faceValue;

  // Number of sides on die
  private int sides;

  // Random number generator for die
  private Random generator;

  // Default constructor that takes in number of sides as parameter
  public Die(int s) {
    sides = s;
    // initialize Random object
    generator = new Random();
    // generate random face value between 1 and number of sides
    faceValue = generator.nextInt(sides) + 1;
  }

  // Method to generate and set a new random face value of the die
  public void throwDie() {
    // create new Random object
    generator = new Random();
    // generate random face value between 1 and number of sides
    faceValue = generator.nextInt(sides) + 1;
  }

  // Get method for the current face value of the die
  public int getFaceValue() { return faceValue; }

  // String representation of the Die object
  public String toString() {
    return getClass().getName() + "[faceValue=" + getFaceValue() +
        ", sides=" + sides + "]";
  }
}