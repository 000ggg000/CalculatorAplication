package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[text()='Sukurti naują paskyrą']")
    WebElement createAccount;

    @FindBy(css = "input[name='username']")
    WebElement inputName;

    @FindBy(css = "input[name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//span[text()='Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi']")
    WebElement errorMessage;


    @FindBy(xpath = "//span[text()='Sėkmingai atsijungėte']")
    WebElement loggedOutMessage;


    public MainPage(WebDriver driver) {

        super(driver);
    }

    public void waiting() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void pressCreateAccount() {
        createAccount.click();
    }

    public void setName(String name) {
        inputName.sendKeys(name);
    }

    public void setPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }

    public String errorMessageText() {
        return errorMessage.getText();
    }

    public boolean isLogoutMessageDisplayed() {
        return loggedOutMessage.isDisplayed();
    }


    public String logoutMessageText() {
        return loggedOutMessage.getText();
    }
}
