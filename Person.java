package javabasics.OOPS;

public class Person {
    
    // Attributes
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30);
        
        // Display person information
        System.out.println("Person details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
