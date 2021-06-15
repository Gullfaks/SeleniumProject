package src.workingwithelements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MultipleSelectTest {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://courses.letskodeit.com/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void testMultipleSelect() throws InterruptedException {
        driver.get(baseURL);
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(element);


        Thread.sleep(2000);
        System.out.println("Select orange by value ");
        sel.selectByValue("orange");

        Thread.sleep(2000);
        System.out.println("De-select orange by value ");
        sel.deselectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Select peach by index ");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select apple by visible text ");
        sel.selectByVisibleText("Apple");

        Thread.sleep(2000);
        System.out.println("Print all selected options ");
        List<WebElement> selectedOptions = sel.getAllSelectedOptions();
        for (WebElement options : selectedOptions) {
            System.out.println(options.getText());
        }

        Thread.sleep(2000);
        System.out.println("De-select all selected options ");
        sel.deselectAll();
    }

    @After
    public void tearDown() throws Exception {
    Thread.sleep(3000);
    driver.quit();
    }
}