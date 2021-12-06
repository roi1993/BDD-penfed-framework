package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CalculatorsPage;
import pages.HomePageZilola;
import pages.MoneyMarketSavingsCalculatorPage;

public class MoneyMarketSavingsCalculatorStepDef {
    @Given("that im on the Home Page")
    public void that_im_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
         HomePageZilola homePageZilola = new HomePageZilola();
        CalculatorsPage calculatorsPage = new CalculatorsPage();
       // MoneyMarketSavingsCalculatorPage moneyMarketSavingsCalculatorPage = new MoneyMarketSavingsCalculatorPage();

       // throw new io.cucumber.java.PendingException();
    }
    @When("I open the {string} Web page")
    public void i_open_the_web_page(String string) {
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I choose hover over “Learn”")
    public void i_choose_hover_over_learn() {
        HomePageZilola homePageZilola = new HomePageZilola();
        homePageZilola.learnTab.click();
       // throw new io.cucumber.java.PendingException();
    }
    @Then("I can click on “Calculators”")
    public void i_can_click_on_calculators() {
        // Write code here that turns the phrase above into concrete actions
        HomePageZilola homePageZilola = new HomePageZilola();
        homePageZilola.calculatorTab.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I can click on “Money Market Savings Calculator”")
    public void i_can_click_on_money_market_savings_calculator() {
        // Write code here that turns the phrase above into concrete actions
        MoneyMarketSavingsCalculatorPage moneyMarketSavingsCalculatorPage = new MoneyMarketSavingsCalculatorPage();
        moneyMarketSavingsCalculatorPage.moneyMarketSavingsCalculatorTab.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I am able to fill out the calculator and submit to see my earnings.")
    public void i_am_able_to_fill_out_the_calculator_and_submit_to_see_my_earnings() {
        // Write code here that turns the phrase above into concrete actions
        MoneyMarketSavingsCalculatorPage moneyMarketSavingsCalculatorPage = new MoneyMarketSavingsCalculatorPage();
        moneyMarketSavingsCalculatorPage.initialAmount.sendKeys("asdfasfkb");
        moneyMarketSavingsCalculatorPage.monthlyAdditions.click();
        moneyMarketSavingsCalculatorPage.monthlyAdditions.sendKeys("10000");
        moneyMarketSavingsCalculatorPage.numberOfYears.click();
        moneyMarketSavingsCalculatorPage.numberOfYears.sendKeys("3");
        moneyMarketSavingsCalculatorPage.calculateButton.click();

       // throw new io.cucumber.java.PendingException();
    }
}
