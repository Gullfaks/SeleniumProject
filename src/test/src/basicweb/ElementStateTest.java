package src.basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ElementStateTest {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void Test(){
        driver.findElement(By.className("jyfHyd")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[3]/div[2]/div/div[2]/div[1]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[5]/div[2]/div[2]/div/div[2]/div[1]/div/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/form/div/button/span")).click();

        WebElement el = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        el.sendKeys("letskodeit");

        /*
        from course it was a different input lik with the following example (isEnabled method):

        WebElement element1 = driver.findElement(By.id("gs_htif0"));
        System.out.println("E1 is Enabled? " + element1.isEnabled());

        WebElement element2 = driver.findElement(By.id("gs_taiF0"));
        System.out.println("E1 is Enabled? " + element2.isEnabled());

        WebElement element3 = driver.findElement(By.id"lst-ib"));
        System.out.println("E1 is Enabled? " + element3.isEnabled());
         */
    }

    @After
    public void tearDown() throws Exception {
        //Thread.sleep(3000);
        //driver.quit();
    }
}