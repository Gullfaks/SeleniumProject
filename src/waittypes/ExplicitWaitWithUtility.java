package src.waittypes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithUtility {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";

        driver.manage().window().maximize();

    }

    @Test
    public void testM() throws Exception {
        driver.get(baseURL);
        //driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']")).click();

        //driver.manage().timeouts().wait(); see webdriverwait under
        WebElement loginLink= driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']"));
        loginLink.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("test");
//making tiny change
        //driver.findElement(By.id("email")).sendKeys("test");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}
