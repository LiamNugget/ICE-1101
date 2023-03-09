public class DieTester {
  public static void main(String[] args) {
    // Create a die with 6 sides
    Die die1 = new Die(6);

    // System.out.print/println is used to display output to the console
    System.out.println("DieTester Running...\n");

    System.out.println("Test 1: Test Constructor using toString");

    System.out.println(die1 + "\n");

    System.out.println("Test 2: Test getFaceValue\n");

    System.out.println("Inspecting die face ...");
    System.out.println("Face value = " + die1.getFaceValue() + "\n");

    System.out.println("Test 3: Test throwDie");
    System.out.println("Die is being thrown ... ");

    // System.out.print is used to display output to the console without a new
    // line so a loop can be used to display all the values generated
    System.out.print("Face values generated: ");
    for (int i = 0; i < 36; i++) {
      //  if else statement used to display a comma after each value except the
      //  last one
      if (i < 35) {
        die1.throwDie();
        System.out.print(die1.getFaceValue() + ", ");
      } else {
        die1.throwDie();
        System.out.println(die1.getFaceValue());
      }
    }
    System.out.println("Test Finished");
  }
}
