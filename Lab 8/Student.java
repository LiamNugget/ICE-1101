// importing the java.util package
import java.util.*;

// declaring a class called Student with four private fields
public class Student {
  private String foreName;
  private String surName;
  private String studentID;
  private String degreeScheme;

  // constructor with four arguments to initialize the fields
  public Student(String foreName, String surName, String studentID,
                 String degreeScheme) {
    this.foreName = foreName;
    this.surName = surName;
    this.studentID = studentID;
    this.degreeScheme = degreeScheme;
  }

  // getter and setter methods for the private fields
  public String getForeName() { return foreName; }

  public void setForeName(String foreName) { this.foreName = foreName; }

  public String getSurName() { return surName; }

  public void setSurName(String surName) { this.surName = surName; }

  public String getStudentID() { return studentID; }

  public void setStudentID(String studentID) { this.studentID = studentID; }

  public String getDegreeScheme() { return degreeScheme; }

  public void setDegreeScheme(String degreeScheme) {
    this.degreeScheme = degreeScheme;
  }

  // override the toString method to display the object properties
  @Override
  public String toString() {
    return "Student{"
        + "foreName='" + foreName + '\'' + ", surName='" + surName + '\'' +
        ", studentID='" + studentID + '\'' + ", degreeScheme='" + degreeScheme +
        '\'' + '}';
  }
}
