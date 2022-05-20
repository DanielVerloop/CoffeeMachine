Feature: tests if bar operates correctly

  Scenario: ask for a coffee
    Given there is a bar
    And the coffee machine contains 5 beans and 3 milk
    When the client orders a coffee
    Then the machine at the bar contains 3 milk
    And the machine at the bar contains 4 beans

  Scenario: test if we can set a second cup
    Given there is a bar
    And the coffee machine contains 7 beans and 4 milk
    When the client orders a coffee
    Then the client can still order another coffee