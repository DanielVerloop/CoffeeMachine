import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BarStepdefs {
    Bar bar;

    @Given("there is a bar")
    public void thereIsABarWithACoffeeMachine() {
        bar = new Bar();
    }

    @And("the coffee machine contains {int} beans and {int} milk")
    public void theCoffeeMachineContainsBeansAndMilk(int arg0, int arg1) {
        bar.setMachine(new CoffeeMachine(arg0, arg1));
    }

    @When("the client orders a coffee")
    public void theClientOrdersACoffee() {
        bar.orderCoffee();
    }

    @And("the machine at the bar contains {int} beans")
    public void thereAreBeansLeftInTheMachine(int arg0) {
        assert bar.getMachine().getCoffeeBeans() == arg0;
    }

    @Then("the machine at the bar contains {int} milk")
    public void thereIsMilkLeftInTheMachine(int arg0) {
        assert bar.getMachine().getMilk() == arg0;
    }

    @Then("the client can still order another coffee")
    public void theClientCanStillOrderAnotherCoffee() {
        assert bar.askForCoffee();
    }

}
