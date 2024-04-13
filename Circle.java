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
    }
    
}
