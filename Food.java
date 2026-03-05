package Ecosystem_Simulation_project;

public class Food {

    private int amount;

    public Food(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.amount = amount;
    }

    public boolean isAvailable() {
        return amount > 0;
    }

    public void consume() {
        if (amount > 0) {
            amount--;
        }
    }

    public int getAmount() {
        return amount;
    }
}