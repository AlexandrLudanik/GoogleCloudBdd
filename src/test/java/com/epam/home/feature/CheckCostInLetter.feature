Feature: Test sum in letter

  Scenario: Test positive login page
    Given I am on main application page
    When I click on button see products
    When I click on button see pricing
    When I click on link calculators
    When I fill up form with
    Then I see price in letter

#  Scenario Outline: Test negative login page
#    Given I am on main application page
#    When I login as user with "<name>" and "<password>"
#    Then I see error message
#    Examples:
#      | name   | password    |
#      | X XX XX| 123345768   |
#      | -----  |  hfgyt124jfk|
