package test.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firsttest {
    private WebDriver driver;
    private String baseUrl;
    private static final String wiley = "WileyPLUS";

    @BeforeClass
    public void setUp() {
//    Before starting the test, copy chromedriver from http://www.seleniumhq.org/download/ and enter correct PATH.!!
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\avtotests\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://www.wiley.com/WileyCDA/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}