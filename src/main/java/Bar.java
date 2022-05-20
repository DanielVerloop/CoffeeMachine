public class Bar {
    private CoffeeMachine machine;


    public Bar(CoffeeMachine machine) {
        this.machine = machine;
    }


    public CoffeeMachine getMachine() {
        return machine;
    }

    public void setMachine(CoffeeMachine machine) {
        this.machine = machine;
    }

    public boolean askForCoffee() {
        return machine.getCoffeeBeans() > 0;
    }

    public void orderCoffee() {
        this.machine.makeCoffee();
    }

}
