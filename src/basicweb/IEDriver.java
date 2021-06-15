package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {
    public static void main(String[] args) {
        //System.setProperty("webdriver.ie.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA 2021.1\\selenium\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        String baseURL = "https://letskodeit.com";
        driver.get(baseURL);
    }
}
