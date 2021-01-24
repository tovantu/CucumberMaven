package hooks;

import driver.DriverManager;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import uihelper.ReadProperties;
import util.WebPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void before(Scenario scenario){
        DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverManager.getDriver().manage().window().maximize();
        String URL = ReadProperties.getInstance("testsetting").getProperty("url");
        DriverManager.getDriver().get(URL);
    }

    @After
    public void after(Scenario scenario)  {
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Image test failed");
        }
        DriverManager.resetDriver();
    }
}
