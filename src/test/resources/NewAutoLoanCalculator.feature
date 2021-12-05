@3
Feature:As a user, I want to use a calculator for new auto loan, So that I can see estimated monthly payments

  Scenario:Fill out all information in New Auto Loan calculator,so that I can see estimated monthly payments

    Given I`m on home page
    Then I choose Auto
    And I choose Auto Loan Application
    Then I should be able to fill out all information

    |purchase price       |20000 |3000
    |down payment         |2000  |3000
    |trade-in value       |200   |300
    |amount owed on trade |200   |300

    Then I click on calculate button
    Then I should be able to see estimated monthly payments