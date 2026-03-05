package Ecosystem_Simulation_project;

public class Main {
  public static void main(String[] args) {
  

    predator lion = new predator(4, false, 5);
    Meat meat = new Meat(30);
    lion.eat(meat);

    System.out.println("Lion's energy level: " + lion.getEnergyLevel());
  }
}
