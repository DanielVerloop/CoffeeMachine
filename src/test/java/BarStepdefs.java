import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarStepdefs {
    Bar bar;

    @Given("there is a bar with a coffee machine")
    public void thereIsABarWithACoffeeMachine() {
        bar = new Bar(new CoffeeMachine());
    }

    @And("the coffee machine contains {int} beans and {int} milk")
    public void theCoffeeMachineContainsBeansAndMilk(int arg0, int arg1) {
        bar.setMachine(new CoffeeMachine(arg0, arg1));
    }

    @When("the client orders a coffee")
    public void theClientOrdersACoffee() {
        bar.orderCoffee();
    }

    @And("there are {int} beans left in the machine at the bar")
    public void thereAreBeansLeftInTheMachine(int arg0) {
        assert bar.getMachine().getCoffeeBeans() == arg0;
    }

    @Then("there is {int} milk left in the machine at the bar")
    public void thereIsMilkLeftInTheMachine(int arg0) {
        assert bar.getMachine().getMilk() == arg0;
    }

    @Then("the client can still order another coffee")
    public void theClientCanStillOrderAnotherCoffee() {
        assert bar.askForCoffee();
    }
}
