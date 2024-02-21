package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class MainPage extends BasePage {

    //    @FindBy(xpath = "//a[text()='QA']")
//    WebElement buttonQASelect;
    @FindBy(id = "item-name")
    WebElement inputAddItem;

    @FindBy(id = "item-calories")
    WebElement inputAddCalories;

    @FindBy(xpath = "//button[@class='add-btn btn blue darken-3']")
    WebElement addMealButton;


    public MainPage(WebDriver driver) {

        super(driver);
    }

    public void waiting() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void addProduct(String item, int calories) {
        inputAddItem.sendKeys(item);
        inputAddCalories.sendKeys(calories + "");
        addMealButton.click();
    }
}
