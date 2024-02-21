package lt.techin;

import org.junit.jupiter.api.Test;

import static lt.techin.utils.TestUtils.log;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoutPageTest extends BasePageTest {

    @Test
    void logoutFromTheCalculatorPageTest() {
        MainPage mainPage = new MainPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String name = "Jonas";
        String password = "John123";
        mainPage.setName(name);
        mainPage.setPassword(password);
        mainPage.clickLoginButton();
        assertTrue(calculatorPage.isLogoutNameTextDisplayed(name), "The user did not successfully logged in.");
        log.info("successfully logged in to the calculator page");
        calculatorPage.clickLogoutButton(name);
        assertTrue(mainPage.isLogoutMessageDisplayed(), "The message did not appear.");
        assertEquals("Sėkmingai atsijungėte", mainPage.logoutMessageText());
        log.info("successfully logged out from the calculator page with the existing name.");

    }

}
