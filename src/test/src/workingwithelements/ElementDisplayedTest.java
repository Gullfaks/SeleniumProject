package src.workingwithelements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ElementDisplayedTest {
    WebDriver driver;
    String baseURL;
    String baseURL2;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        baseURL2 = "https://expedia.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void testLetsKodeIt() throws InterruptedException {
        driver.get(baseURL);

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text box displayed: " + textBox.isDisplayed());

        Thread.sleep(3000);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("clicked on hide button");
        System.out.println("Text box displayed: "+ textBox.isDisplayed());

        Thread.sleep(3000);

        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Clicked on show button: " + textBox.isDisplayed());
        System.out.println("Text box displayed: " + textBox.isDisplayed());

    }

    @Test
    public void testExpedia() {
        driver.get(baseURL2);

        WebElement childDropdown = driver.findElement(By.id("child-age-input-0-0"));
        System.out.println("Child dropdown is displayed" + childDropdown.isDisplayed());

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}