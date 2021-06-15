package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA 2021.1\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https.letskodeit.com";
        driver.get(baseURL);
    }
}
