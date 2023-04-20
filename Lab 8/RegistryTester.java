// importing the java.util package
import java.util.*;

public class RegistryTester {
  public static void main(String[] args) {
    System.out.println("Registry Tester");
    System.out.println("***************\n");

    // Make new registry and check student list is empty
    System.out.println("Test 1. Check student list is empty.");
    Registry registry = new Registry();
    System.out.println("Expected: \nActual: " + registry.format());

    // Add a student to the list
    System.out.println("\nTest 2. Add a student to the list.");
    Student student1 = new Student("John", "Doe", "123", "Computer Science");
    registry.addStudent(student1);
    System.out.println("Expected: John Doe 123 Computer Science Actual: " +
                       registry.toString());

    // Add more students to the list
    System.out.println("\nTest 3. Add more students to the list.");
    Student student2 = new Student("Mary", "Smith", "234", "Mathematics");
    Student student3 = new Student("Bob", "Johnson", "345", "Engineering");
    registry.addStudent(student2);
    registry.addStudent(student3);
    System.out.println(
        "Expected: John Doe 123 Computer Science Mary Smith 234 Mathematics Bob Johnson 345 Engineering Actual: " +
        registry.format());

    // Delete a student from the list
    System.out.println("\nTest 4. Delete a student from the list.");
    registry.deleteStudent("234");
    System.out.println(
        "Expected: John Doe 123 Computer Science Bob Johnson 345 Engineering Actual: " +
        registry.format());
  }
}