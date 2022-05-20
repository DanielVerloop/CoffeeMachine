import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoffeeMachineStepdefs {
    CoffeeMachine machine;

    @Given("we have a coffee machine with {int} beans and {int} milk")
    public void weHaveACoffeeMachineWithBeansAndMilk(int arg0, int arg1) {
        machine = new CoffeeMachine(arg0, arg1);
    }

    @When("we brew a cup of coffee")
    public void weBrewACupOfCoffee() {
        machine.makeCoffee();
    }


    @Given("we have a coffee machine without milk or beans")
    public void weHaveACoffeeMachineWithoutMilkOrBeans() {
        machine = new CoffeeMachine();
    }

    @And("we put {int} beans into the machine")
    public void wePutBeansIntoTheMachine(int arg0) {
        machine.setCoffeeBeans(arg0);
    }

    @And("we put {int} milk into the machine")
    public void wePutMilkIntoTheMachine(int arg0) {
        machine.setMilk(arg0);
    }


    @When("we make a cup of coffee")
    public void weMakeACupOfCoffee() {
        machine.makeCoffee();
    }

    @When("we make a cappuccino")
    public void weMakeACappuccino() {
        machine.makeCappuccino();
    }

    @Then("the machine contains {int} beans")
    public void theMachineContainsBeans(int arg0) {
        assert machine.getCoffeeBeans() == arg0;
    }

    @And("the machine contains {int} milk")
    public void theMachineContainsMilk(int arg0) {
        assert machine.getMilk() == arg0;
    }
}
