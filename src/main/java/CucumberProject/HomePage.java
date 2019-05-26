package CucumberProject;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    private By _clickOnRegister= By.linkText("Register");
    By _euroCurrancy = By.id("customerCurrency");
    private By _apprel=By.linkText("Apparel");
    private By _clothing=By.linkText("Clothing");
    private By _books=By.linkText("Books");
    private By _computerCatogery= By.linkText("Computers");
    private By _loginLink = By.xpath("//a[@class='ico-login']");




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

    public void clcikOnCatogaryLink(String link)
        {
            clickElements(By.linkText(link));
        }
    public void clickOnLogin()
    {
          clickElements(_loginLink);
    }

}
