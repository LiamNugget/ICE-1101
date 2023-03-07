public class Person {
  // Private instance variables to store information about each person
  private String foreName; 
  private String surName;
  private int age;
  private double height;
  private String gender;
  
  // Private static variable to keep track of the number of Person objects created
  private static int personCount;

  // Constructor for the Person class
  public Person(String foreName, String surName, int age, double height, String gender) {
    // Assign the values passed as arguments to the instance variables
    this.foreName = foreName;
    this.surName = surName;
    this.age = age;
    this.height = height;
    this.gender = gender;
    // Increment the personCount static variable each time a new Person object is created
    personCount++;
  }

  // Get method for foreName
  public String getforeName() {
    return foreName;
  }

  // Set method for foreName
  public void setforeName(String foreName) {
    this.foreName = foreName;
  }

  // Get method for surName
  public String getsurName() {
    return surName;
  }

  // Set method for surName
  public void setsurName(String surName) {
    this.surName = surName;
  }

  // Get method for age
  public int getAge() {
    return age;
  }

  // Set method for age
  public void setAge(int age) {
    this.age = age;
  }

  // Get method for height
  public double getHeight() {
    return height;
  }

  // Set method for height
  public void setHeight(double height) {
    this.height = height;
  }

  // Get method for gender
  public String getGender() {
    return gender;
  }

  // Set method for gender
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  // Get method for personCount
  public static int getPersonCount() {
    return personCount;
  }

  // toString method that returns a string representation of the object
  public String toString() {
    return getClass().getName() + "[Forename=" + foreName + "; " + "Surname=" + surName + "; " + "Age=" + age + "; " + "Height=" + height + "; " + "Gender=" + gender + "; " + "PersonID=" + personCount + "]";
  }
  
  // format method that returns a formatted string of the object's information
  public String format() {
    return String.format("%-4d %-12s %-12s %-4d %-6.1f %-6s", personCount, foreName, surName, age, height, gender);
  }
}
