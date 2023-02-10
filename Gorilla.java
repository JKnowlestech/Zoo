public class Gorilla extends Mammal {
//member variables here are defined with line 10 Super

//Constructor
public Gorilla(){
    //takes all member variables from mammal
        super();
    }

//in general, all methods are public
//void is for when the function is not going to return anything
    public void throwSomething(){
    System.out.println("Gorilla threw something");
    energyLevel =  energyLevel - 5;
    super.displayEnergy();
    }
    public void eatBanana(){
    System.out.println("Gorilla ate a Banana");
    energyLevel =  energyLevel + 10;
    super.displayEnergy();
    }
    public void climb(){
    System.out.println("Gorilla climbed");
    energyLevel =  energyLevel - 10;
    super.displayEnergy();
    }

    






    }