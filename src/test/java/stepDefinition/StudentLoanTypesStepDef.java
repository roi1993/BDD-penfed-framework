package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CookiesHandlingPage;
import pages.HomePage;
import pages.PopUpHandlingForStudentLoan;
import pages.StudentLoanTypesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

public class StudentLoanTypesStepDef {


    HomePage homePage = new HomePage();
    StudentLoanTypesPage studentLoanTypesPage = new StudentLoanTypesPage();
    CookiesHandlingPage cookiesHandlingPage=new CookiesHandlingPage();
    PopUpHandlingForStudentLoan popUpHandlingForStudentLoan=new PopUpHandlingForStudentLoan();

    @Given("I`m on home page")
    public void i_m_on_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Then("I choose Loans")
    public void i_choose_loans() {
        homePage.Loans.click();
    }

    @Then("I pick an option In-school student loans")
    public void i_pick_an_option_in_school_student_loans() {
        homePage.InSchoolStudentLoans.click();
    }

    @Then("I`m able to choose undergraduate student loans")
    public void i_m_able_to_choose_undergraduate_student_loans() {
        cookiesHandlingPage.click();
        studentLoanTypesPage.UndergraduateLoan.click();
        popUpHandlingForStudentLoan.accept();

    }

    @Then("I`m able to choose graduate student loans")
    public void i_m_able_to_choose_graduate_student_loans() {
        cookiesHandlingPage.click();
        studentLoanTypesPage.GraduateLoan.click();
         popUpHandlingForStudentLoan.accept();

    }@Then("I`m able to choose no-essay scholarship student loans")
    public void i_m_able_to_choose_no_essay_scholarship_student_loans() {
        cookiesHandlingPage.click();
       studentLoanTypesPage.NoEssayScholarships.click();
        popUpHandlingForStudentLoan.accept();
    }


    @Then("I should be able to land on Ascent web page")
    public void i_should_be_able_to_land_on_ascent_web_page() {
//        String newWindowTitle = Driver.getDriver().getTitle();
//        SeleniumUtils.switchToWindow(newWindowTitle);

        String expected ="Student Loans | PenFed";
        String actual = Driver.getDriver().getTitle();;
        Assert.assertEquals(expected,actual);

    }


}