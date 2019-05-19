package CucumberProject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homePage= new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage=new RegistrationSuccessPage();
    EuroCurrancy euroCurrancy=new EuroCurrancy();

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
}
