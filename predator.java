package Ecosystem_Simulation_project;

public class predator extends Animal {
    public predator(int numberOfLegs, boolean hasWings, int energyLevel){
        super(energyLevel);
    }

 
   
    public void eat(Meat meat) {
    if (meat.isAvailable()) {
        meat.consume();
        setEnergyLevel(getEnergyLevel() + 1);
    }
}
}
