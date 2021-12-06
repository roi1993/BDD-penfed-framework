@regression
Feature: As a user, I should be able to arrive on the Money Market Savings Calculator page,
  so that i can use a calculator to see my savings.

    Scenario: Go to Money Market Savings Calculator page
    Given that im on the Home Page
    When I open the "PenFed" Web page
    Then I choose hover over “Learn”
    Then I can click on “Calculators”
    Then I can click on “Money Market Savings Calculator”
    Then I am able to fill out the calculator and submit to see my earnings.