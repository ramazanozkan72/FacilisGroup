package Pages;

/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */

import TestBase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage extends BaseClass {
    @FindBy(xpath = "//a[@role='link' and text()='Contact']")
    public WebElement contactButton;

    @FindBy(xpath ="(//input[@type='text'])[1]" )
    public WebElement name;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement whyWork;

    @FindBy(xpath = "//*[text()='Choose']")
    public WebElement preferWork;

    @FindBy(xpath = "(//span[text()='In the office'])[2]")
    public WebElement inOffice;

    @FindBy(xpath = "//*[@id=\"i9\"]/div[3]/div")
    public WebElement checkboxYes;

    @FindBy(xpath = "//iframe[@jsname='L5Fo6c']")
    public WebElement iFrame;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitBtton;

    @FindBy(xpath = "//div[@class='freebirdFormviewerViewResponseConfirmationMessage']")
    public WebElement succesSubmit;


    public contactPage(){
        PageFactory.initElements(driver,this);
    }
}


