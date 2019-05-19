package CucumberProject;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadProp=new LoadProp();


    private By _clickOnMale= By.id("gender-male");
    private By  _clickOnFemale =By.id("gender-female");
    private By _enterFirstName =By.xpath("//input[@name='FirstName']");
    private By _enterLastName =By.xpath("//input[@name='LastName']");
    private By _selectDayDOB = By.xpath("//select[@name='DateOfBirthDay']");
    private By _selectMonthDOB =By.xpath("//select[@name='DateOfBirthMonth']");
    private By _selectYearDOB =By.xpath(" //select[@name='DateOfBirthYear']");
    private By _enterRegisterEmailID =By.xpath("//input[@name='Email']");
    private By _enterRegistPassword =By.xpath("//input[@name='Password']");
    private By _enterRegsterConfirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    private By _clickOnRegisterButton = By.xpath("//input[@name='register-button']");

    public void verifyUserIsOnRegisterPage()
 {
     assertURLtext("register");
 }
 public void userEnterRegistrationDetail() throws InterruptedException {
     clickElements(_clickOnMale);
     clickElements(_clickOnFemale);
     enterElements(_enterFirstName,loadProp.getProperty("FirstName"));
     enterElements(_enterLastName,loadProp.getProperty("LastName"));
     selectDropdownText(_selectDayDOB,loadProp.getProperty("Day"));
     Thread.sleep(1000);
     selectDropdownText(_selectMonthDOB,loadProp.getProperty("Month"));
     Thread.sleep(1000);
     selectDropdownText(_selectYearDOB,loadProp.getProperty("Year"));
     Thread.sleep(1000);
     String firstemail=loadProp.getProperty("firstemail");
     String  secondemail=loadProp.getProperty("secondemail");
     String Email= firstemail+currentdatetime()+secondemail;
     enterElements(_enterRegisterEmailID,Email);

     Thread.sleep(1000);
     enterElements(_enterRegistPassword,loadProp.getProperty("Password"));
     Thread.sleep(1000);
     enterElements(_enterRegsterConfirmPassword,loadProp.getProperty("Cpassword"));
     Thread.sleep(1000);
     clickElements(_clickOnRegisterButton);
 }

}

