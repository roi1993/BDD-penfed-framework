package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PriorityPassPage {

    public PriorityPassPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@data-id='Cards']")
    public WebElement creditCards;

    @FindBy(xpath = "//a[@data-id='Cards: Help: Contact Us']")
    public WebElement contactUs;

    @FindBy(xpath = "//a[contains(@href,'www.Prioritypass.com/PenFed')]")
    public WebElement priorityPass;

    @FindBy(id = "continue")
    public WebElement continueButton;
}
