package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class idXPATHDemo {

    public static void main(String[] args) {
        /*
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@href='http://letskodeit.teachable.com/sign_in?_ga=2.218390105.1996747835.1621470563-1575260381.1621375427']")).click();

        driver.findElement(By.id("user_email")).sendKeys("alxhansen@gmail.com");
        */

        //
        String baseURL = "https://learn.letskodeit.com";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        driver.findElement(By.id("user_email")).sendKeys("letskodeit@gmail.com");

    }
}
