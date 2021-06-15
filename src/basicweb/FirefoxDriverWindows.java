package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverWindows {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA 2021.1\\selenium\\drivers\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "https://learn.letskodeit.com";
        driver.get(baseURL);


    }


}
