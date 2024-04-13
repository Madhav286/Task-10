public class Tea1 {
    // BlackTea subclass
public class BlackTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Black Tea...");
        boilWater();
        addTeaLeaves();
        steep();
        System.out.println("Black Tea is ready.");
    }
    
    private void addTeaLeaves() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTeaLeaves'");
    }

    private void boilWater() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'boilWater'");
    }

    // Method to steep black tea
    private void steep() {
        System.out.println("Steeping black tea for 3 minutes.");
    }
}

// GreenTea subclass
public class GreenTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Green Tea...");
        boilWater();
        addTeaLeaves();
        steep();
        System.out.println("Green Tea is ready.");
    }
    
    private void addTeaLeaves() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTeaLeaves'");
    }

    private void boilWater() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'boilWater'");
    }

    // Method to steep green tea
    private void steep() {
        System.out.println("Steeping green tea for 2 minutes.");
    }
}

// HerbalTea subclass
public class HerbalTea extends Tea {
    @Override
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea...");
        boilWater();
        addHerbs();
        steep();
        System.out.println("Herbal Tea is ready.");
    }
    
    private void boilWater() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'boilWater'");
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
}
