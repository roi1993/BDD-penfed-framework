Feature: I want to I want to verify PURCHASE ALERTS on Credit cards

  Scenario: : I am hovering on Credit Cards, selecting CONTACT US
    Given I am on the homepage
    Then I click on credit cards
    Then I click on CONTACT US

  Scenario: I click on the link below Purchase Alerts and click on CONTINUE button on pop up window and land on new webpage "https://usa.visa.com/pay-with-visa/featured-technologies/purchase-alerts.html"
    Given I click on  the link below Purchase Alerts
    Then I should land on new priority pass website


# should work