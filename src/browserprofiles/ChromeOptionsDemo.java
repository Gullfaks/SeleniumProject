package src.browserprofiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeOptionsDemo {

    public static void main(String[] args) {
        String baseURL = "http://google.com";
        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Alxha\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ljngjbnaijcbncmcnjfhigebomdlkcjo\\6.1.11_0.crx"));

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
}
