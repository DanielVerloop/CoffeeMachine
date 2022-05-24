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
        bar.setCoffeeMachine(new CoffeeMachine(arg0, arg1));
    }

    @When("the client orders a coffee")
    public void theClientOrdersACoffee() {
        bar.orderCoffee();
    }

    @And("the machine at the bar contains {int} beans")
    public void thereAreBeansLeftInTheMachine(int arg0) {
        assert bar.getCoffeeMachine().getCoffeeBeans() == arg0;
    }

    @Then("the machine at the bar contains {int} milk")
    public void thereIsMilkLeftInTheMachine(int arg0) {
        assert bar.getCoffeeMachine().getMilk() == arg0;
    }

    @Then("the client can still order another coffee")
    public void theClientCanStillOrderAnotherCoffee() {
        assert bar.askForCoffee();
    }

    @And("the bar has a soda machine with {double} of {string}")
    public void theBarHasASodaMachineThatContainsLitersOfSoda(double liters, String name) {
        bar.setSodaMachine(new SodaMachine(name, liters));
    }

    @When("the client orders a {string}")
    public void theClientOrdersASoda(String soda) {
        bar.orderSoda(soda);
    }

    @Then("the machine contains {double} liters of {string}")
    public void thereIsAmountLitersOfSodaRemaining(double amount, String soda) {
        assert bar.getSodaMachine().getInventory(soda) == amount;
    }

    @And("the bar has an empty soda machine")
    public void theBarHasAnEmptySodaMachine() {
        bar.setSodaMachine(new SodaMachine());
    }

    @And("the bar has an empty coffee machine")
    public void theBarHasAnEmptyCoffeeMachine() {
        bar.setCoffeeMachine(new CoffeeMachine());
    }

    @When("we add {double} of {string} to the soda machine")
    public void weAddAmountOfSodaToTheSodaMachine(double amount, String soda) {
        bar.getSodaMachine().inputSoda(soda, amount);
    }

    @And("we add a {int} of coffee beans to the coffee machine")
    public void weAddAVolumeOfCoffeeBeansToTheCoffeeMachine(int volume) {
        bar.getCoffeeMachine().setCoffeeBeans(volume);
    }

    @Then("the coffee machine contains {int} beans")
    public void theCoffeeMachineContainsVolumeBeans(int volume) {
        assert bar.getCoffeeMachine().getCoffeeBeans() == volume;
    }

    @And("the soda machine contains {double} of {string}")
    public void theSodaMachineContainsAmountOfSoda(double amount, String soda) {
        assert bar.getSodaMachine().getInventory(soda) == amount;
    }

//    @Given("there is a bar with a coffee machine with {int} beans and {int} milk")
//    public void thereIsABarWithACoffeeMachineWithBeansAndMilk(int arg0, int arg1) {
//        bar = new Bar(new CoffeeMachine(arg0, arg1));
//    }


    @When("the client purchases a cappuccino")
    public void theClientOrdersACappuccino() {
        bar.orderCappuccino();
    }

    @Then("the client can not order another coffee")
    public void theClientCanNotOrderAnotherCoffee() {
        assert !bar.askForCoffee();
    }

    @When("the client purchases a {string}")
    public void theClientPurchasesASoda(String soda) {
        bar.orderSoda(soda);
    }

    @And("a coffee machine with {int} beans and {int} milk")
    public void aCoffeeMachineWithBeansAndMilk(int arg0, int arg1) {
        bar.setCoffeeMachine(new CoffeeMachine(arg0, arg1));
    }
}
