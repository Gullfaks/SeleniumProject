package src.browserprofiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import java.util.concurrent.TimeUnit;

public class ProfilesDemo {
    public static void main(String[] args) throws InterruptedException {
        String baseURL = "http://letskodeit.com";

        ProfilesIni profile = new ProfilesIni();
        FirefoxProfile fxProfile = profile.getProfile("automationprofile");

        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(fxProfile);

        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get(baseURL);

        Thread.sleep(3000);
        driver.quit();
    }
}
