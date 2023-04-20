// importing java.util package
import java.util.*;

public class Registry {

  // declare a LinkedList of Student objects
  LinkedList<Student> studentList = new LinkedList<Student>();

  // add a Student object to the list
  public void addStudent(Student aStudent) { studentList.add(aStudent); }

  // print out each Student object in the list
  public void printStudents() {
    for (Student student : studentList) {
      System.out.println(student.toString());
    }
  }

  // delete a Student object from the list by ID number
  public boolean deleteStudent(String studentID) {
    Iterator<Student> itr = studentList.iterator();
    while (itr.hasNext()) {
      Student student = itr.next();
      if (student.getStudentID().equals(studentID)) {
        itr.remove();
        return true;
      }
    }
    return false;
  }

  // create a String representation of all Student objects in the list
  public String toString() {
    String output = "";
    for (Student student : studentList) {
      output += student.toString() + "\n";
    }
    return output;
  }

  // create a formatted String of all Student objects in the list
  public String format() {
    String output = "";
    for (Student student : studentList) {
      output += student.getForeName() + " " + student.getSurName() + " " +
                student.getStudentID() + " " + student.getDegreeScheme() + "\n";
    }
    return output;
  }
}
