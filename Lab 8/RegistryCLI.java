// Importing the java.util.Scanner package
import java.util.Scanner;

// Creating the Registry CLI class
public class RegistryCLI {
  private Registry theRegistry;

  // Constructor to initialize theRegistry object
  public RegistryCLI(Registry theRegistry) { this.theRegistry = theRegistry; }

  // Displays the main menu and gets a valid option from the user
  public void doMenu() {
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    while (option != 4) {
      System.out.println("Registry Main Menu");
      System.out.println("******************");
      System.out.println("1. Add a Student");
      System.out.println("2. Delete a Student");
      System.out.println("3. Print Registry");
      System.out.println("4. Quit");

      // Get user input and validate
      boolean validInput = false;
      while (!validInput) {
        System.out.print("Select option [1, 2, 3, 4] :> ");
        if (scanner.hasNextInt()) {
          option = scanner.nextInt();
          if (option >= 1 && option <= 4) {
            validInput = true;
          } else {
            System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
          }
        } else {
          scanner.next(); // Clear out invalid input
          System.out.println("Invalid input. Please enter a number.");
        }
      }

      // Perform selected action based on user input
      switch (option) {
      case 1:
        doAddStudent(); // Call method to add a new student
        break;
      case 2:
        doDeleteStudent(); // Call method to delete a student
        break;
      case 3:
        doPrintRegistry(); // Call method to print the entire registry
        break;
      case 4:
        System.out.println("Goodbye!"); // Print message to exit program
        return;                         // Exit the menu loop
      }
    }
  }

  // Method to add a new student with user input
  private void doAddStudent() {
    Scanner scanner = new Scanner(System.in);
    boolean enterAnother = true;
    while (enterAnother) {
      System.out.println("Add New Student");
      System.out.println("***************");
      System.out.print("Enter forename :> ");
      String forename = scanner.nextLine();
      System.out.print("Enter surname :> ");
      String surname = scanner.nextLine();
      System.out.print("Enter student ID :> ");
      String studentID = scanner.nextLine();
      System.out.print("Enter degree scheme :> ");
      String degreeScheme = scanner.nextLine();
      Student newStudent =
          new Student(forename, surname, studentID, degreeScheme);
      theRegistry.addStudent(newStudent); // Add the new student to the registry
      System.out.println("Student added to registry.");
      System.out.print("Enter another (Y/N) :> ");
      String answer = scanner.nextLine();
      enterAnother = (answer.equalsIgnoreCase("Y"));
    }
  }

  // Method to delete a student from the registry with user input
  private void doDeleteStudent() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter student ID to delete :> ");
    String studentID = scanner.nextLine();
    boolean success = theRegistry.deleteStudent(
        studentID); // Check whether ID is valid and delete the student from
                    // registry
    if (success) {
      System.out.println("Student deleted.");
    } else {
      System.out.println("Student not found.");
    }
  }

  // Method to print the entire registry
  private void doPrintRegistry() { theRegistry.printStudents(); }
}