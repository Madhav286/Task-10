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
    
    // Main method to execute the program
    public static void main(String[] args) {
        // Create instances of tea subclasses
        Tea blackTea = new BlackTea();
        Tea greenTea = new GreenTea();
        Tea herbalTea = new HerbalTea();
        
        // Prepare different types of tea
        System.out.println("Preparing black tea...");
        blackTea.prepareTea();
        System.out.println();
        
        System.out.println("Preparing green tea...");
        greenTea.prepareTea();
        System.out.println();
        
        System.out.println("Preparing herbal tea...");
        herbalTea.prepareTea();
    }
}

class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea...");
        boilWater();
        addTeaLeaves();
        steep();
        System.out.println("Black Tea is ready.");
    }
    
    private void addTeaLeaves() {
        System.out.println("Adding black tea leaves...");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Method to steep black tea
    private void steep() {
        System.out.println("Steeping black tea for 3 minutes.");
    }
}

class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea...");
        boilWater();
        addTeaLeaves();
        steep();
        System.out.println("Green Tea is ready.");
    }
    
    private void addTeaLeaves() {
        System.out.println("Adding green tea leaves...");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Method to steep green tea
    private void steep() {
        System.out.println("Steeping green tea for 2 minutes.");
    }
}

class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea...");
        boilWater();
        addHerbs();
        steep();
        System.out.println("Herbal Tea is ready.");
    }
    
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Method to add herbs to herbal tea
    private void addHerbs() {
        System.out.println("Adding herbal ingredients...");
    }
    
    // Method to steep herbal tea
    private void steep() {
        System.out.println("Steeping herbal tea for 5 minutes.");
    }
}
