package Test;
/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */
import Utilities.CommonMethods;


public class ContactClick extends CommonMethods {
    /**
     *                          Description
     * Url = https://qa.logomedia.com
     * User clicks the contact button
     * verifying if the user is on next page
     *
     */


    public static void main(String[] args)  {
        // calls the created setUp method from the BaseClass
        setUp();
        //clicks the contact button
        click(contact.contactButton);

        // gets the actual title
        String actual= driver.getTitle();

        // expected title
        String expected= "Contact";
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

