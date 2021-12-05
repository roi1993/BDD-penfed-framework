Feature: As a user, I want to be able to use search box, So that I can see all options

Scenario: Use search box with different search conditions
  Given I`m on home page
  Then I click on search box
  Then I enter "Loan"
  Then I should be able to see all my options