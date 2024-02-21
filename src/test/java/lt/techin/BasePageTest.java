package lt.techin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static lt.techin.utils.TestUtils.log;

public class BasePageTest {
    WebDriver driver;

    public BasePageTest() {
    }

    @BeforeEach
    void setup() {
        this.driver = new ChromeDriver();
        this.driver.get("http://localhost:8080/");
        this.driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void closeDown() {
//        this.driver.quit();
        log.info("WebDriver closed");
    }

}
