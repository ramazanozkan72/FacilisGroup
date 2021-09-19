package Utilities;

/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */

import TestBase.PageInitializer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods extends PageInitializer {

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }
    public static void jsClick(WebElement element) {

        getJSExecutor().executeScript("arguments[0].click();", element);
    }
    public static void scrollUpp(int pixel) {

        getJSExecutor().executeScript("window.scrollBy(0,-" + pixel + ")");
    }
    public static void scrollDown(int pixel) {

        getJSExecutor().executeScript("window.scrollBy(0," + pixel + ")");
    }
    public static WebDriverWait getWaitObject() {

        return new WebDriverWait(driver, 20);
    }
    public static void waitForClickAbility(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitForVisibility(WebElement element) {
        getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }
    public static void click(WebElement element) {
        element.click();
    }


    /**
     *
     *
     * This method will help to switch Iframe
     * @param element
     */
    public static void IframeSwitch(WebElement element){
        driver.switchTo().frame(element);

    }
}