package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class navigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickFramePage();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.pl");
    }

    @Test
    public void testSwitchTab(){
        //homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("");
    }
}
