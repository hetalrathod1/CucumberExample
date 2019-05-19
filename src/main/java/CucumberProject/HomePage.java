package CucumberProject;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By _clickOnRegister= By.linkText("Register");
    By _euroCurrancy = By.id("customerCurrency");


    public void userIsOnHomepage()
    {
        assertCurrentURL("https://demo.nopcommerce.com/");
    }
    public void clickOnRegister()
    {
        clickElements(_clickOnRegister);
    }
    public void selectEuroCurrancy()
    {
        selectDropdownText(_euroCurrancy,"Euro");

    }
}
