package CucumberProject;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
    LoadProp loadProp=new LoadProp();
    private By _loginEmailId = By.xpath("//input[@name='Email']");
    private By _loginPassword = By.xpath("//input[@name='Password']");
    private By _loginButton    = By.xpath("//input[@class='button-1 login-button']");

    public void verifyUserIsOnLoginPage()
    {
        assertURLtext("login");
    }

    public void userEnterLoginDetail(String emaiid,String password)
    {
        enterElements(_loginEmailId,emaiid);
        enterElements(_loginPassword,password);
        clickElements(_loginButton);
    }


}
