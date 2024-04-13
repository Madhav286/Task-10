 public class Tea {
    // Data members
    private boolean hasHotWater;
    private boolean hasTeaLeaves;
    private boolean hasMilk;
    private boolean hasSugar;
    
    // Constructor
    public Tea() {
        // Default constructor initializes tea without any ingredients
        this.hasHotWater = false;
        this.hasTeaLeaves = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }
    
    // Method to prepare basic tea with hot water and tea leaves
    public void prepareTea() {
        if (!hasHotWater) {
            System.out.println("Boiling water...");
            hasHotWater = true;
        }
        if (!hasTeaLeaves) {
            System.out.println("Adding tea leaves...");
            hasTeaLeaves = true;
        }
        System.out.println("Basic tea is ready.");
    }
    
    // Method to add milk to the basic tea
    public void addMilk() {
        if (hasHotWater && hasTeaLeaves && !hasMilk) {
            System.out.println("Adding milk...");
            hasMilk = true;
            System.out.println("Tea with milk is ready.");
        } else {
            System.out.println("Cannot add milk. Prepare basic tea first.");
        }
    }
    
    // Method to add sugar to the basic tea
    public void addSugar() {
        if (hasHotWater && hasTeaLeaves && !hasSugar) {
            System.out.println("Adding sugar...");
            hasSugar = true;
            System.out.println("Tea with sugar is ready.");
        } else {
            System.out.println("Cannot add sugar. Prepare basic tea first.");
        }
    }
} 