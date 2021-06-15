package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class FindByLinkText {

    public static void main(String[] args) throws Exception{
        WebDriver driver;

        System.setProperty("webdriver.gecko.driver",
                "C:\\Program Files\\JetBrains\\IntelliJ IDEA 2021.1\\selenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseURL = "https://learn.letskodeit.com/";
        driver.get(baseURL);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
