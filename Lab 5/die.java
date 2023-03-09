import java.util.Random;

public class Die {
  // Current face value of die
  private int faceValue;

  // Number of sides on die
  private int sides;

  // Random number generator for die
  private Random generator;

  // Default constructor
  public Die(int s) {
    sides = s;
    generator = new Random();
    faceValue = generator.nextInt(sides) + 1;
  }

  public void throwDie() {
    generator = new Random();
    faceValue = generator.nextInt(sides) + 1;
  }

  public int getFaceValue() { return faceValue; }

  public String toString() {
    return getClass().getName() + "[faceValue=" + getFaceValue() +
        ", sides=" + sides + "]";
  }
}