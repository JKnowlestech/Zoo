public class Bat extends Mammal {

//Constructor
public Bat(){
        this.energyLevel = 300;
    }

//in general, all methods are public
//void is for when the function is not going to return anything
    public void fly(){
    System.out.println("Bat flew away....Zzzz");
    energyLevel =  energyLevel - 50;
    super.displayEnergy();
    }
    public void eatHuman(){
    System.out.println("So- well never mind...Nomnomnom");
    energyLevel =  energyLevel + 25;
    super.displayEnergy();
    }
    public void attackTown(){
    System.out.println("Town on fire");
    energyLevel =  energyLevel - 100;
    super.displayEnergy();
    }
    }