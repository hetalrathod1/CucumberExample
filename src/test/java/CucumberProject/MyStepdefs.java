package CucumberProject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyStepdefs {

    HomePage homePage= new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage=new RegistrationSuccessPage();
    EuroCurrancy euroCurrancy=new EuroCurrancy();
    LoginPage loginPage=new LoginPage();

    @Given("^user is on register page$")
    public void userIsOnRegisterPage()
    {
        homePage.clickOnRegister();
    }

    @When("^user enters all registration details$")
    public void userEntersAllRegistrationDetails() throws InterruptedException {
        registrationPage.userEnterRegistrationDetail();
    }

    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully()
    {
        registrationSuccessPage.verifyUserSeeRegistrationSuccessMessage();
    }


    @Given("^user is on hompage$")
    public void userIsOnHompage()
    {
        homePage.userIsOnHomepage();
    }

    @When("^user select euro currancy$")
    public void userSelectEuroCurrancy()
    {
        homePage.selectEuroCurrancy();
        //euroCurrancy.selectEuroCurrancy();
    }

    @Then("^user is able to see product in euro currancy$")
    public void userIsAbleToSeeProductInEuroCurrancy()
    {
        euroCurrancy.userSeeEuroCurrencyProduct();
    }


    @When("^user click on \"([^\"]*)\" link$")
    public void userClickOnLink(String link) throws Throwable
    {
        homePage.clcikOnCatogaryLink(link);
     }

    @Then("^user should be able to navigate to all \"([^\"]*)\"   Successfully$")
    public void userShouldBeAbleToNavigateToAllSuccessfully(String catogary) throws Throwable
    {

        Utils.assertURLtext(catogary);

    }



    @Given("^user click on loginpage$")
    public void userClickOnLoginpage() {
        homePage.clickOnLogin();
    }


    @When("^user enter  invalid \"([^\"]*)\" and/or \"([^\"]*)\"$")
    public void userEnterInvalidAndOr(String emailid, String password) throws Throwable {
        loginPage.userEnterLoginDetail(emailid,password);
             }

    @Then("^user should able to see\"([^\"]*)\"$")
    public void userShouldAbleToSee(String errormessage) throws Throwable {
        boolean b;
      if (errormessage.contains("No customer account found")||errormessage.contains("The credentials provided are incorrect"))
      {
          b=true;
      }
      else
      {
          b=false;
      }

      Assert.assertTrue(b);
    }
}
