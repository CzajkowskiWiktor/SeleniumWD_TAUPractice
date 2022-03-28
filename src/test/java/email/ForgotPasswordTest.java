package email;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.SuccessEmailSent;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void testSuccessfullForgotPasswordSent(){
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmail("tau@example.com");
        SuccessEmailSent successEmailSent = forgotPassword.clickRetriveButton();
        assertTrue(successEmailSent.getAlertText().contains("Your e-mail's been sent"),
                "Alert text is incorrect!");
    }
}
