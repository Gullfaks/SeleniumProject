package src.usefulmethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class GenericMethodsDemoTest {
    private WebDriver driver;
    private String baseURL;
    private GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        //driver.manage().timeouts().wait();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testMethod() {
        driver.get(baseURL);

        WebElement element = gm.getElement("name", "id");
        element.sendKeys("test");

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}