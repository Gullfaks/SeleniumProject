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

public class DropdownSelectTest {
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
    public void TestDropdownSelect() throws InterruptedException {
        driver.get(baseURL);
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select benz by value ");
        sel.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Select honda by index ");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select bmw by visible text ");
        sel.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("print the list of all options ");
        List<WebElement> options = sel.getOptions();
        int size= options.size();

        for (int i = 0; i < size; i++) {
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }
    }

    @After
    public void tearDown() throws Exception {
    }
}