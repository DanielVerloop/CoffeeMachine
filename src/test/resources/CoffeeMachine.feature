Feature: test if we can brew cups of coffee

  Scenario: set a basic cup of coffee
    Given we have a coffee machine with 10 beans and 1 milk
    When we brew a cup of coffee
    Then There are 9 beans left in the machine

  Scenario: set cup of coffee with empty machine
    Given we have a coffee machine without milk or beans
    And we put 5 beans into the machine
    And we put 2 milk into the machine
    When we make a cup of coffee
    Then there are 4 beans left in the machine

  Scenario: brew a cappuccino
    Given we have a coffee machine with 7 beans and 1 milk
    When we make a cappuccino
    Then there are 6 beans left in the machine
    And there is 0 milk left in the machine
