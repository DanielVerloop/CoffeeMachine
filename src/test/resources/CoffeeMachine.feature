@CoffeeMachineTests
Feature: test if we can brew cups of coffee

  Scenario: set a basic cup of coffee
    Given we have a coffee machine with 10 beans and 1 milk
    When we brew a cup of coffee
    Then the machine contains 9 beans

  Scenario: set cup of coffee with empty machine
    Given we have a coffee machine without milk or beans
    And we put 5 beans into the machine
    And we put 2 milk into the machine
    When we make a cup of coffee
    Then the machine contains 4 beans

  Scenario: brew a cappuccino
    Given we have a coffee machine with 7 beans and 1 milk
    When we make a cappuccino
    Then the machine contains 6 beans
    And the machine contains 0 milk