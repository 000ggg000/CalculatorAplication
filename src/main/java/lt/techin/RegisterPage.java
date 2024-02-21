package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//h2[@class='form-signin-heading']")
    WebElement createAccountTitle;

    @FindBy(id = "username")
    WebElement inputName;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(id = "passwordConfirm")
    WebElement inputConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    @FindBy(id = "username.errors")
    WebElement errorMessage;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRedirectedToThePage(){
        return createAccountTitle.isDisplayed();
    }

    public void writeName(String name){
        inputName.sendKeys(name);
    }
    public void writePassword(String password){
        inputPassword.sendKeys(password);
        inputConfirmPassword.sendKeys(password);
    }
    public void pressSubmitCreateAccount(){
        submitButton.click();
    }

    public boolean isErrorMessageDisplayed(){
        return errorMessage.isDisplayed();
    }

    public String errorMessageText(){
        return errorMessage.getText();
    }
}
