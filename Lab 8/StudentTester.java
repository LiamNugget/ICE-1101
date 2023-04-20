// This code defines the public class named "StudentTester"
public class StudentTester {
  public static void main(String[] args) {
    // create three student objects using the Student class constructor
    // with their own name, surname, student ID, and specialization.
    Student student1 = new Student("Test", "one", "1", "Computer Art");
    Student student2 = new Student("Test", "two", "2", "Mathematics");
    Student student3 = new Student("Test", "three", "3", "Drama");

    // Prints out the string representations of created student objects.
    System.out.println(student1.toString());
    System.out.println(student2.toString());
    System.out.println(student3.toString());
  }
}