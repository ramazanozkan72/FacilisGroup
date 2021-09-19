package TestBase;

/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */

import Utilities.WebDriverUtils;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class BaseClass extends WebDriverUtils {
    public static WebDriver driver;
    public static WebDriver setUp(){
        driver= WebDriverUtils.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://qa.logomedia.com");
        driver.manage().window().maximize();
        PageInitializer.initializePageObjects();
        return driver;
    }

    public static void tearDown(){
        if (driver!=null){
            driver.quit();
        }
    }
}
