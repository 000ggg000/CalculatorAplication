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


    public MainPage(WebDriver driver) {

        super(driver);
    }

    public void waiting() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void pressCreateAccount() {
        createAccount.click();
    }
}
