package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class PriorityPassStepDef {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("I choose CONTACT US")
    public void iChooseContactUs() {
        PriorityPassStepDef priorityPassStepDef = new PriorityPassStepDef();
//        priorityPassStepDef.creditCards.click();





    }

    @Then("I click on CONTACT US")
    public void iClickOnContactUs() {

    }


    @Given("I click on  the link below Pathfinder-Priority Pass")
    public void iClickOnTheLinkBelowPathfinderPriorityPass() {

    }
    @Then("I should land on new priority pass website")
    public void iShouldLandOnNewPriorityPassWebsite() {

    }
}
