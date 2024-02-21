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
    void addTheProductAndCheckIfItIs() {
        MainPage mainPage = new MainPage(driver);
        mainPage.addProduct("Butter", 250);
        mainPage.addProduct("Milk", 100);

        log.info("navigation to page");
    }
    @Test
    void clickOnQAButton() {
        MainPage mainPage = new MainPage(driver);
//        QAPage qaPage = new QAPage(driver);
//        mainPage.selectQAButton();
//        assertEquals("QA", qaPage.titleQaDisplayed(), "The page was not redirected to QA");

       log.info("navigation to page");
    }

//    @ParameterizedTest
//    @CsvFileSource(files = "src/main/resources/names.csv", numLinesToSkip = 1)
//    void testWithCsvFileSourceFromFileFindItemName(String name) {
//        MainPage mainPage = new MainPage(driver);
//        QAPage qaPage = new QAPage(driver);
//        mainPage.selectQAButton();
//        qaPage.clickShowItemsInList();
//        assertTrue(qaPage.namesOfItemsDisplayed(name), "The item was not found");
//        assertEquals(name, qaPage.namesOfItemsDisplayedName(name), "" + name + " does not exist in the eshop");
//
//    }


}
