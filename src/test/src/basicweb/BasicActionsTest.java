package src.basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class BasicActionsTest {
    WebDriver driver;
    String baseURL;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void test(){
        driver.get(baseURL);
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        System.out.println("Clicked on login");
        driver.findElement(By.xpath("//input[@id='user_email']")).clear();
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("alxhansen@gmail.com");
        System.out.println("Sending keys to user name field");
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("noPasswordForYou");
        System.out.println("Sending keys to password field");
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();


    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }
}