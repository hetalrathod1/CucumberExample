package CucumberProject;

import org.junit.Assert;
import org.openqa.selenium.By;

public class EuroCurrancy extends Utils {

    HomePage homePage=new HomePage();
    By _euroCurrancy = By.id("customerCurrency");

     public void userIsOnEuroCurrancyPage()
     {
         assertTextMessage("Euro",_euroCurrancy);
     }


    public void userSeeEuroCurrencyProduct() {

        for (int i = 1; i < 4; i++) {
            //store xpath text in actresult to continue loop
            String actresult = driver.findElement(By.xpath("(//span[@class='price actual-price'])[" + i + "]")).getText();

            // expected n actual result verify. so actresult we r taking first character value "Ђ"
            Assert.assertEquals("Ђ", String.valueOf(actresult.charAt(0)));

           // System.out.println(actresult);


        }
    }
}