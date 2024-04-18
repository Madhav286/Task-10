public class Circle {
    // Data member
    private double radius;
    
    // Constructors
    public Circle() {
        // Default constructor with no arguments
        this.radius = 0.0;
    }
    
    public Circle(double radius) {
        // Constructor with one argument
        this.radius = radius;
    }
    
    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    public static void main(String[] args) {
        // Create a Circle object using the default constructor
        Circle circle1 = new Circle();
        
        // Create a Circle object with a radius of 5 using the parameterized constructor
        Circle circle2 = new Circle(5.0);
        
        // Calculate circumference for circle1
        double circumference1 = circle1.calculateCircumference();
        System.out.println("Circumference of circle1: " + circumference1);
        
        // Calculate circumference for circle2
        double circumference2 = circle2.calculateCircumference();
        System.out.println("Circumference of circle2: " + circumference2);
    }
}
