package CucumberProject;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage
{
    BrowserSelectore browserSelectore= new BrowserSelectore();

    static String timestamp=new SimpleDateFormat("ddMMyyHHmmss").format(new Date());

    @Before
    public void setUpBrowser()
    {
        browserSelectore.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
        public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            try {

                TakesScreenshot ts = (TakesScreenshot) driver;

                File source = ts.getScreenshotAs(OutputType.FILE);

                FileUtils.copyFile(source, new File("./CaptureScreenshots/" + scenario.getName() + ".png"));

                System.out.println("Screenshot taken");
            } catch (Exception e) {

                System.out.println("Exception while taking screenshot " + e.getMessage());
            }


        }
        driver.close();
    }}
