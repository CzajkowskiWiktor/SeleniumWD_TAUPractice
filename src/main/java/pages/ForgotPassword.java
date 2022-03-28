package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retriveButton = By.id("form_submit");

    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public SuccessEmailSent clickRetriveButton(){
        driver.findElement(retriveButton).click();
        return new SuccessEmailSent(driver);
    }



}
