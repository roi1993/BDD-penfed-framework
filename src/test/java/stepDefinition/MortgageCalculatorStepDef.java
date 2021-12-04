package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MortgageCalculatorsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

public class MortgageCalculatorStepDef {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

//    @Given("I’m in a role of non-registered user")
//    public void iMInARoleOfNonRegisteredUser() {
//}
    @When("I hover over MORTGAGE & HOME EQUITY Tab")
    public void iHoverOverMORTGAGEHOMEEQUITYTab() {
        MortgageCalculatorsPage mortgageCalculators = new MortgageCalculatorsPage();
        SeleniumUtils utils = new SeleniumUtils();
        utils.hover(mortgageCalculators.MortgageAndHomeEquity);
    }

    @When("I choose Mortgage Calculators under TOOLS & RESOURCES")
    public void iChooseMortgageCalculatorsUnderTOOLSRESOURCES() {
        MortgageCalculatorsPage mortgageCalculators = new MortgageCalculatorsPage();
        mortgageCalculators.MortgageCalculators.click();

    }
    @Then("I should land on the Mortgage Calculators Page")
    public void iShouldLandOnTheMortgageCalculatorsPage() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"Calculate a Mortgage Payment | PenFed Mortgage and Refinance Calculators");


    }
}
