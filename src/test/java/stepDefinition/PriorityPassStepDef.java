package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.PriorityPassPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PriorityPassStepDef {

    PriorityPassPage priorityPassPage = new PriorityPassPage();

    @Then("I click on credit cards")
    public void i_click_on_credit_cards() {
        priorityPassPage.creditCards.click();
    }


    @Then("I click on CONTACT US")
    public void i_click_on_contact_us() {
        priorityPassPage.contactUs.click();
//third commit

    }

    @Given("I click on  the link below Pathfinder-Priority Pass")
    public void iClickOnTheLinkBelowPathfinderPriorityPass() {

        priorityPassPage.priorityPass.click();
    }

    @Then("I should land on new priority pass website")
    public void iShouldLandOnNewPriorityPassWebsite() {
        priorityPassPage.continueButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "PRIORITY PASS");
    }
    //it was supposed to be pushed a few hours ago. Second attempt

}