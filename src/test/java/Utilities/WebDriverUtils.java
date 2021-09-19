package Utilities;

/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverUtils {

    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("iedriver")) {
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            return new SafariDriver();
        } else {
            System.out.println("Browser does not exist");
            System.out.println("Current browser name : " + browser);
            return null;
        }
    }
}