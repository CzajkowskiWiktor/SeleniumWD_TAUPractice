package loadingPage;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoadingTest extends BaseTest {

    @Test
    public void testLoadingPage(){
        var dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickButton();
        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Wrong Loaded Text!");
    }
}
