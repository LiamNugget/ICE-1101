//This class is a test driver for the Person class
public class PersonTester{
    public static void main(String[] args){
        //Create a new instance of the Person class, with the specified parameters
        Person person1 = new Person("Liam", "Nugent", 22, 6.1, "Male");
        //Print the formatted string representation of person1
        System.out.println(person1.format());

        //Create another instance of the Person class
        Person person2 = new Person("Charlotte", "Beard", 28, 5.4, "Female");
        //Print the formatted string representation of person2
        System.out.println(person2.format());

        //Create another instance of the Person class
        Person person3 = new Person("Bradley", "Narracot", 19, 5.11, "Male");
        //Print the formatted string representation of person3
        System.out.println(person3.format());

        //Create another instance of the Person class
        Person person4 = new Person("Jack", "McGuire", 25, 0.1, "Male");
        //Print the formatted string representation of person4
        System.out.println(person4.format());

        //Create another instance of the Person class
        Person person5 = new Person("Tanto", "Gorf", 1, 0.001, "?");
        //Print the formatted string representation of person5
        System.out.println(person5.format());
    }
}
