Feature: soda machine operations

  Scenario Outline: Order a drink
    Given we have a soda machine with <amount> of <soda>
    When we serve a <soda> to a client
    Then the machine contains <liters> of <soda>

    Examples:
      | soda        | amount | liters |
      | "Coca-Cola" | 1.0    | 0.5    |

  Scenario Outline: fill the inventory of the machine
    Given we have a soda machine with <amount> of <soda>
    When we add <amount> of <soda> to the machine
    Then the machine contains <liters> of <soda>
    Examples:
      | amount | soda   | liters |
      | 0.5    | "7-UP" | 1.0    |

  Scenario Outline: add and order soda from empty machine
    Given we have an empty soda machine
    When we add <amount> of <soda> to the machine
    And we serve a <soda> to a client
    Then the machine contains <liters> of <soda>
    Examples:
      | amount | soda      | liters |
      | 0.5    | "Ice Tea" | 0      |