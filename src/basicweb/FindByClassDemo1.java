package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByClassDemo1 {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "https://courses.letskodeit.com/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.className("9o-t")).click();

        driver.findElement(By.className("btn-style")).click();

        driver.findElement(By.className("inputtext")).sendKeys("Automation");
        driver.findElement(By.className("uiButtonConfirm"));
    }
}
