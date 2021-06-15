package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByClassDemo2 {
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new ChromeDriver();
        String baseURL = "https://www.facebook.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);


    }
}
