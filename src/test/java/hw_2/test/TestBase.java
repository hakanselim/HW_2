package hw_2.test;

import hw_2.utilities.ConfigurationReader;
import hw_2.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeMethod
    public void SetUp() {
        driver = Driver.get();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        actions = new Actions(driver);

        wait = new WebDriverWait(driver,10);

        driver.get(ConfigurationReader.get("url"));

    }

    @AfterMethod
    public void TearDown() throws InterruptedException {
        Thread.sleep(1000);
        Driver.closeDriver();
    }
}
