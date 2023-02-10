public class Mammal {
//member variables
//never do public for member variables
//because they are private they can only be accessed by getters and setters
//protected allows it to be accessed from other files
protected int energyLevel;

//Constructor
public Mammal(){
        this.energyLevel = 100;
    }

// Getter Mammal energyLevel
    public int energyLevel() {
        return energyLevel;
    }

//void is for when the function is not going to return anything
    public void displayEnergy(){
    System.out.println("Energy remaining" + energyLevel());
    }
    






    }