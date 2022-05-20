Feature: tests if bar operates correctly

  Scenario: ask for a coffee
    Given there is a bar with a coffee machine
    And the coffee machine contains 5 beans and 3 milk
    When the client orders a coffee
    Then there is 3 milk left in the machine at the bar
    And there are 4 beans left in the machine at the bar

  Scenario: test if we can set a second cup
    Given there is a bar with a coffee machine
    And the coffee machine contains 7 beans and 4 milk
    When the client orders a coffee
    Then the client can still order another coffee