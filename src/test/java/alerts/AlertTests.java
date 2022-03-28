package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Wrong text");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Text is incorrect");
    }

    @Test
    public void setTextToAlert(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerPrompt();
        String text = "there is some text";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: "+text, "Wrong text!");
    }
}
