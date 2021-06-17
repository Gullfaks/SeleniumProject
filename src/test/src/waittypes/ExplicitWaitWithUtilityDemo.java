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
import src.utilities.WaitTypes;


public class ExplicitWaitWithUtilityDemo {
    private WebDriver driver;
    private String baseURL;
    WaitTypes wt;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        wt = new WaitTypes(driver);

        driver.manage().window().maximize();
    }

    @Test
    public void testM() throws Exception {
        driver.get(baseURL);

        WebElement loginLink = driver.findElement(By.xpath("//div[@id='navbar-inverse-collapse']/div//a[@href='/login']"));
        loginLink.click();

        WebElement emailField = wt.waitForElement(By.id("email"),
                3);
        emailField.sendKeys("test");

        wt.clickWhenReady(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]"), 3);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}

