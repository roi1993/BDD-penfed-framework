package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.CookiesHandlingPage;
import pages.MortgageCalculatorsPage;
import pages.MortgagePaymentCalculatorPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class MortgagePaymentCalculatorStepDef {

    // SCENARIO #1
//    @Given("I am on the homepage")
//    public void iAmOnTheHomepage() {
//
//    }

//    @When("I hover over MORTGAGE & HOME EQUITY Tab")
//    public void iHoverOverMORTGAGEHOMEEQUITYTab() {
//        MortgageCalculatorsPage mortgageCalculators = new MortgageCalculatorsPage();
//        SeleniumUtils utils = new SeleniumUtils();
//        utils.hover(mortgageCalculators.MortgageAndHomeEquity);

//    }
    @Then("I choose Mortgage Calculators under TOOLS & RESOURCES Tab")
    public void iChooseMortgageCalculatorsUnderTOOLSRESOURCESTab() {
        MortgageCalculatorsPage mortgageCalculators = new MortgageCalculatorsPage();
        mortgageCalculators.MortgageCalculators.click();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();

    }
    @Then("I should land on Mortgage Payment Calculator")
    public void iShouldLandOnMortgagePaymentCalculator() {
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
//        Assert.assertTrue(Driver.getDriver().getPageSource().contains(mortgagePaymentCalculatorPage.titleMortgagePaymentCalculator.getText()));
        String expected = "MORTGAGE PAYMENT CALCULATOR";
        String actual = mortgagePaymentCalculatorPage.titleMortgagePaymentCalculator.getText();
        Assert.assertEquals(expected,actual);
    }


    // SCENARIO #2
//    @Given("I am on the homepage")
//    public void iAmOnTheHomepage() {
//
//    }
    @When("I go to Mortgage Payment Calculator")
    public void iGoToMortgagePaymentCalculator() {
        MortgageCalculatorsPage mortgageCalculatorsPage = new MortgageCalculatorsPage();
        mortgageCalculatorsPage.navigateToMortgageCalculators();
        CookiesHandlingPage cookiesHandlingPage = new CookiesHandlingPage();
        cookiesHandlingPage.click();

    }
    @Then("I fill out all the required field")
    public void iFillOutAllTheRequiredField() {
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.sendKeys("450000");
        mortgagePaymentCalculatorPage.downPaymentOfMortPayCal.sendKeys("15000");
        Select loanTerm = new Select(mortgagePaymentCalculatorPage.loanTermOfMortPayCal);
        loanTerm.selectByValue("180");
        mortgagePaymentCalculatorPage.interestRateOfMortPayCal.sendKeys("3.5");

    }
    @Then("I click on Calculate")
    public void iClickOnCalculate() {
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
        mortgagePaymentCalculatorPage.calculateButtonOfMortPayCal.click();
    }
    @Then("I should be able to calculate estimated monthly mortgage principal and interest payment")
    public void iShouldBeAbleToCalculateEstimatedMonthlyMortgagePrincipalAndInterestPayment() {
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(mortgagePaymentCalculatorPage.result.getText()));

    }


//    @Given("I am on the homepage")
//    public void iAmOnTheHomepage() {
//
//    }
//    @When("I go to Mortgage Payment Calculator")
//    public void iGoToMortgagePaymentCalculator() {
//
//    }
    @Then("I fill out all the required field but leave PRICE OF THE HOME field with default amount of ${double}")
    public void iFillOutAllTheRequiredFieldButLeavePRICEOFTHEHOMEFieldWithDefaultAmount$(Double double1) {
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.clear();
        mortgagePaymentCalculatorPage.priceOfTheHomeOfMortPayCal.sendKeys(Keys.TAB);
        mortgagePaymentCalculatorPage.downPaymentOfMortPayCal.sendKeys("15000",Keys.TAB,Keys.TAB);
        Select loanTerm = new Select(mortgagePaymentCalculatorPage.loanTermOfMortPayCal);
        loanTerm.selectByValue("180");
        mortgagePaymentCalculatorPage.interestRateOfMortPayCal.sendKeys("3.5");

    }
//    @Then("I click on Calculate")
//    public void iClickOnCalculate() {
//
//    }
    @Then("I should not be able to calculate estimated monthly mortgage principal and interest payment")
    public void iShouldNotBeAbleToCalculateEstimatedMonthlyMortgagePrincipalAndInterestPayment() {
        MortgagePaymentCalculatorPage mortgagePaymentCalculatorPage = new MortgagePaymentCalculatorPage();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(mortgagePaymentCalculatorPage.noResultElement.getText()));

    }



}
