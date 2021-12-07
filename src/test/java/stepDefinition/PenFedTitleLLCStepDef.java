package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PenFedTitlePage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PenFedTitleLLCStepDef {
    PenFedTitlePage penFedTitlePage = new PenFedTitlePage();

    @When("I choose PenFed Title LLC under TOOLS & RESOURCES")
    public void i_choose_pen_fed_title_llc_under_tools_resources() {

        penFedTitlePage.PenFedTittleLLC.click();
        penFedTitlePage.continueButton.click();
        String expected = "PenFed Title - Home";
        SeleniumUtils seleniumUtils = new SeleniumUtils();
        seleniumUtils.switchToWindow(expected);
    }

    @Then("I should land on PenFed Title Website on different browser tab")
    public void i_should_land_on_pen_fed_title_website_on_different_browser_tab() {
       // String expected = "PenFed Title - Home";
        Assert.assertEquals(Driver.getDriver().getTitle(),"PenFed Title - Home");

    }
}
