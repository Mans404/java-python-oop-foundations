package Ecosystem_Simulation_project;

import java.util.ArrayList;
import java.util.List;

public class Environment {

    private List<Animal> animals = new ArrayList<>();
    private List<Food> foods = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public void removeDeadAnimals() {
        animals.removeIf(animal -> !animal.isAlive());
    }

    public void removeFood() {
        foods.removeIf(food -> food.getAmount() == 0);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Food> getFoods() {
        return foods;
    }
}