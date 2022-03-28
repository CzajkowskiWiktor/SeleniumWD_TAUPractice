package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessEmailSent {

    private WebDriver driver;
    private By statusAlert = By.id("popText");

    public SuccessEmailSent(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
