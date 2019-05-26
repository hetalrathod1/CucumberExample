package CucumberProject;

import org.openqa.selenium.By;

import static CucumberProject.Utils.assertTextMessage;

public class LoginSuccessfully
{
    LoadProp loadProp=new LoadProp();
    private By _loginSuccessMessage=By.linkText("Log out");

    public void verifyUserSeeLoginSuccessfulMessage()
    {


        assertTextMessage("Log out",_loginSuccessMessage);
    }
}
