package lt.techin;

import org.junit.jupiter.api.Test;

import static lt.techin.utils.TestUtils.log;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends BasePageTest {
    @Test
    void loginToTheCalculatorPagePositiveTest() {
        MainPage mainPage = new MainPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String name = "Jonas";
        String password = "John123";
        mainPage.setName(name);
        mainPage.setPassword(password);
        mainPage.clickLoginButton();
        assertTrue(calculatorPage.islogoutNameTextdisplayed(name), "The user did not successfully logged in.");
        log.info("successfully logged in to the calculator page");
    }

    @Test
    void loginToTheCalculatorPageNegativeTest() {
        MainPage mainPage = new MainPage(driver);
        String name = "Jonas";
        String password = "Jon123";
        mainPage.setName(name);
        mainPage.setPassword(password);
        mainPage.clickLoginButton();
        assertTrue(mainPage.isErrorMessageDisplayed(), "The message did not appear.");
        assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", mainPage.errorMessageText());
        log.info("successfully not logged in to the calculator page with the existing name.");
    }
}
