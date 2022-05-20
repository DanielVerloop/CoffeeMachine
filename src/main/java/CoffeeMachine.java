public class CoffeeMachine {
    private int coffeeBeans;
    private int milk;

    public CoffeeMachine() {

    }

    public CoffeeMachine(int coffeeBeans, int milk) {
        this.coffeeBeans = coffeeBeans;
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void makeCoffee() {
        if (getCoffeeBeans() > 0) {
            this.coffeeBeans--;
        } else {
            throw new IllegalStateException("No coffee beans left!");
        }
    }

    public void makeCappuccino() {
        if (getCoffeeBeans() > 0 && getMilk() > 0) {
            this.milk--;
            this.coffeeBeans--;
        }
    }
}
