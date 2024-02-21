package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static lt.techin.utils.TestUtils.log;
import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends BasePageTest {

    @Test
    void createAccountPositiveTest() {
        MainPage mainPage = new MainPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        mainPage.pressCreateAccount();
        assertTrue(registerPage.isRedirectedToThePage(), "redirected to the wrong page.");
        log.info("navigation to registering page");
        String name = "Jonas";
        registerPage.writeName(name);
        registerPage.writePassword("John123");
        registerPage.pressSubmitCreateAccount();
        assertTrue(calculatorPage.islogoutNameTextdisplayed(name), "The user did not successfully logged in.");
        log.info("successfully registered to the calculator page");
    }

    @Test
    void createAccountNegativeTest() {
        MainPage mainPage = new MainPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        mainPage.pressCreateAccount();
        assertTrue(registerPage.isRedirectedToThePage(), "redirected to the wrong page.");
        log.info("navigation to registering page");
        String name = "Jonas";
        registerPage.writeName(name);
        registerPage.writePassword("John123");
        registerPage.pressSubmitCreateAccount();
        assertTrue(registerPage.isErrorMessageDisplayed(), "The message did not appear.");
        assertEquals("Toks vartotojo vardas jau egzistuoja", registerPage.errorMessageText());
        log.info("successfully not registered to the calculator page with the existing name.");
    }


}
