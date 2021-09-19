package Test;

/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */

import Utilities.CommonMethods;

public class FillBlanks extends CommonMethods {

    /**
     *                          Description
     * Url = https://qa.logomedia.com
     * User fills out the form
     * verifying that form submitted succesfully
     *
     */

    public static void main(String[] args) throws InterruptedException {
        // calls the created setUp method from the BaseClass
        setUp();
        // this method will click contact button
        click(contact.contactButton);

        //this method will switch to Iframe
        IframeSwitch(contact.iFrame);
        //this method will wait for element to be visible
        waitForVisibility(contact.name);



        // this method will send keys to Name
       // click(contact.name);
        sendText(contact.name,"Ramazan");

        // this method will click on the yes Button
        click(contact.checkboxYes);

        // this method will click DropDown
        click(contact.preferWork);

        //this method will wait if element is clickable or not
        waitForClickAbility(contact.inOffice);
        click(contact.inOffice);

        waitForClickAbility(contact.whyWork);
        //This method will send Keys to Why would like to work us blank
        sendText(contact.whyWork,"I Love this Game");

        //This method will click the Submit and Save.
        click(contact.submitBtton);



        // gets the actual title
        String actual= contact.succesSubmit.getText();
        System.out.println(actual);

        // expected title
        String expected= "Thank you for your time. We are appreciating this.";
        // verifies if the user is on correct page
        if (actual.equals(expected)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test Failed:" +"\n"+ actual+ " is displayed");
        }

        //calls created tear down method from base class.
        tearDown();




    }
}
