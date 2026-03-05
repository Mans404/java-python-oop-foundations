package Ecosystem_Simulation_project;

public class herbivore extends Animal {
    public herbivore(int numberOfLegs, boolean hasWings, int energyLevel){
        super(energyLevel);
    }

    public void eat(Herbs herbs) {
    if (herbs.isAvailable()) {
        herbs.consume();
        setEnergyLevel(getEnergyLevel() + 1);
    }
    
}
}
