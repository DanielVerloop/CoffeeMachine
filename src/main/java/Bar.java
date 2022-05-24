//IDEAS:
// add payments
// add different machines/drinks

public class Bar {
    private CoffeeMachine coffeeMachine;
    private SodaMachine sodaMachine;

    public Bar() {}

    public Bar(CoffeeMachine machine) {
        this.coffeeMachine = machine;
    }

    public Bar(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    public Bar(SodaMachine sodaMachine, CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
        this.sodaMachine = sodaMachine;
    }

    public CoffeeMachine getCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public SodaMachine getSodaMachine() {
        return sodaMachine;
    }

    public void setSodaMachine(SodaMachine sodaMachine) {
        this.sodaMachine = sodaMachine;
    }

    public boolean askForCoffee() {
        return coffeeMachine.getCoffeeBeans() > 0;
    }

    public void orderCoffee() {
        this.coffeeMachine.makeCoffee();
    }

    public void orderCappuccino() {
        this.coffeeMachine.makeCappuccino();
    }

    public boolean askForSoda(String name) {
        return sodaMachine.checkInventory(name);
    }

    public void orderSoda(String name) {
        this.sodaMachine.serveDrink(name);
    }

    public void fillSodaMachine(String drink, double amount) {
        this.sodaMachine.inputSoda(drink, amount);
    }
}
