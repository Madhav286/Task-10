

public class Tea2 {
    public static void main(String[] args) {
        // Create an array of Tea objects
        Tea[] teas = new Tea[3];
        
        // Populate the array with instances of Tea and its subclasses
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        
        // Iterate over the array and invoke the prepareTea() method for each object
        for (Tea tea : teas) {
            tea.prepareTea();
            System.out.println(); // Add a newline for better readability
        }
    }
}

class Main {
    public static void main(String[] args) {
        Tea2.main(args);
    }
}
