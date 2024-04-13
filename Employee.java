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
}
    

