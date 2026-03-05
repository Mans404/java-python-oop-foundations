package Ecosystem_Simulation_project;

public class Animal {



    private int energyLevel;

    public Animal(int energyLevel) {
        if (energyLevel < 0) {
            throw new IllegalArgumentException("Energy cannot be negative");
        }
        this.energyLevel = energyLevel;
    }

    public void eat(Food food) {
        if (food.isAvailable()) {
            food.consume();
            energyLevel++;
        }
    }

    public void move() {
        if (energyLevel > 0) {
            energyLevel--;
        }
    }

    public boolean isAlive() {
        return energyLevel > 0;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
    }
}