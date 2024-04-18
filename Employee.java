public class Employee {
    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    // Getter methods
    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getName() {
        return firstName + " " + lastName;
    }
    
    public int getSalary() {
        return salary;
    }
    
    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    // Additional methods
    public int getAnnualSalary() {
        return salary * 12;
    }
    
    public int raiseSalary(int percent) {
        salary += (salary * percent) / 100;
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "John", "Doe", 50000);
        
        // Display employee information
        System.out.println("Employee details:");
        System.out.println(employee);
        
        // Raise employee salary by 10%
        System.out.println("Raising employee salary by 10%...");
        employee.raiseSalary(10);
        
        // Display updated employee information
        System.out.println("Updated employee details:");
        System.out.println(employee);
    }
}
