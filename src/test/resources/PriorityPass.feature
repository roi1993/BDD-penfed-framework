@K
Feature: I want to verify PRIORITY PASS page on Credit Cards.

  Scenario: : I am hovering on Credit Cards, selecting CONTACT US
     Given I`m on home page
     Then I click on credit cards
     Then I click on CONTACT US

    Scenario: I click on the link and click on CONTINUE button on pop up window and land on new webpage https://www.prioritypass.com/PenFed
      Given I click on  the link below Pathfinder-Priority Pass
      Then I should land on new priority pass website
