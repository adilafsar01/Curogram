package curogram.base;

import curogram.dataproviders.ConfigUtility;
import curogram.factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.time.Duration;

public abstract class BaseClass {

    public static WebDriver driver;

    public WebDriver getDriver()
    {
        return driver;
    }

    @Parameters({"browser"})
    @BeforeTest
    public void setup(@Optional("chrome")String browser){

        driver= BrowserFactory.startBrowser(ConfigUtility.getValue("browser"));
        driver.get(ConfigUtility.getValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
