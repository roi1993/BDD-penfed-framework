package stepDefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.PurchaseAlertsPage;
import utilities.Driver;

public class PurchaseAlertsStepDef {

    PurchaseAlertsPage purchaseAlertsPage = new PurchaseAlertsPage();


    @Given("I click on  the link below Purchase Alerts")
    public void i_click_on_the_link_below_purchase_alerts() {
        purchaseAlertsPage.purchaseAlerts.click();
        Assert.assertEquals(Driver.getDriver().getTitle(),"VISA");
    }
    //commit
}
