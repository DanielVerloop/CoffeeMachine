@BarTests
Feature: tests if bar operates correctly

  Scenario: ask for a coffee
    Given there is a bar
    And the coffee machine contains 5 beans and 3 milk
    When the client orders a coffee
    Then the machine at the bar contains 3 milk
    And the machine at the bar contains 4 beans

  Scenario: Compound bar step (try taking given + and in 1 step)
    Given there is a bar
    And a coffee machine with 1 beans and 1 milk
    When the client purchases a cappuccino
    Then the client can not order another coffee

  Scenario: test if we can set a second cup
    Given there is a bar
    And the coffee machine contains 7 beans and 4 milk
    When the client orders a coffee
    Then the client can still order another coffee

  Scenario Outline: test if we can order Soda
    Given there is a bar
    And the bar has a soda machine with <liters> of <soda>
    When the client purchases a <soda>
    Then the machine contains <amount> liters of <soda>

    Examples:
      | liters | soda    | amount |
      | 2.0    | "Pepsi" | 1.5    |
      | 1.0    | "Fanta" | 0.5    |

  Scenario Outline: start with empty machines and fill them
    Given there is a bar
    And the bar has an empty soda machine
    And the bar has an empty coffee machine
    When we add <amount> of <soda> to the soda machine
    And we add a <volume> of coffee beans to the coffee machine
    Then the coffee machine contains <volume> beans
    And the soda machine contains <amount> of <soda>

    Examples:
      | amount | soda        | volume |
      | 2.0    | "Coca Cola" | 6      |