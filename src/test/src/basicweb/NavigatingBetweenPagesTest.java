package src.basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NavigatingBetweenPagesTest {
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
    public void test() throws InterruptedException {
        driver.get(baseURL);
        String title= driver.getTitle();
        System.out.println("Title is: " + title);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentURL);

        String stringURLToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(stringURLToNavigate);
        System.out.println("navigating to login");
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentURL);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        currentURL= driver.getCurrentUrl();
        System.out.println("Current URL is " + currentURL);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate forward");
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentURL);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        currentURL= driver.getCurrentUrl();
        System.out.println("Current URL is " + currentURL);

        driver.navigate().refresh();
        System.out.println("Navigate Refresh");
        driver.getCurrentUrl();
        System.out.println("weird currentURL " + currentURL);
        driver.navigate().refresh();

        String pageSourceVar = driver.getPageSource();
        System.out.println(pageSourceVar);


    }

    @After
    public void tearDown() throws Exception {
    }
}