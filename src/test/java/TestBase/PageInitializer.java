package TestBase;

/**
 * Author: Ramazan Ozkan
 * Email: ramazanozkan72@gmail.com
 *
 */
import Pages.contactPage;

public class PageInitializer extends BaseClass {
    protected static  contactPage contact;

    public static void initializePageObjects(){
    contact= new contactPage();
    }
}
