import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SodaMachineStepdefs {
    SodaMachine machine;

    @Given("we have a soda machine with {double} of {string}")
    public void weHaveASodaMachineWithAmountOfSoda(double amount, String name) {
        machine = new SodaMachine(name, amount);
    }

    @When("we serve a {string} to a client")
    public void weServeASodaToAClient(String name) {
        machine.serveDrink(name);
    }

    @Then("the machine contains {double} of {string}")
    public void theMachineHasLitersOfSodaLeft(double liters, String name) {
        assert machine.getInventory(name) == liters;
    }

    @When("we add {double} of {string} to the machine")
    public void weAddAmountOfSodaToTheMachine(double amount, String name) {
        machine.inputSoda(name, amount);
    }

    @Given("we have an empty soda machine")
    public void weHaveAnEmptySodaMachine() {
        machine = new SodaMachine();
    }
}
