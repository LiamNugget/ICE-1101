import java.util.Random;

public class Die {

  // Initialize variable for the current value of the die
  private int faceValue;

  // Initialize variable for the number of sides the die has, can be set to 2
  // for a coin.
  private int sides;

  // Initialize variable for the random number generator
  private Random generator;

  // Define constructor for the die class
  public Die(int s) {
    sides = s;
    generator = new Random();
    roll();
  }

  public void roll() { faceValue = generator.nextInt(sides) + 1; }

  public int getFaceValue() { return faceValue; }

  public String toString() {
    return "Die with " + sides + " sides and a face
