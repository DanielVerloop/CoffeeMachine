import java.util.HashMap;

public class SodaMachine {
    private HashMap<String, Double> inventory = new HashMap<>();

    public SodaMachine(){}

    public SodaMachine(String drink, double amount) {
        inventory.put(drink, amount);
    }

    public void inputSoda(String name, double amount) {
        inventory.merge(name, amount, Double::sum);
    }

    public boolean checkInventory(String drink) {
        double liters;
        try {
            liters = inventory.get(drink);
        } catch (Exception e) {
            return false;
        }

        return !(liters < 0.5);
    }

    public void serveDrink(String name) {
        if (checkInventory(name)) {
            double oldValue = inventory.get(name);
            inventory.put(name, oldValue - 0.5);
        }
    }


    public double getInventory(String soda) {
        return inventory.get(soda);
    }
}
