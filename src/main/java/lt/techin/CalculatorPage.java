package lt.techin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage {


    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public boolean islogoutNameTextdisplayed(String name) {
        WebElement logoutNameText = driver.findElement(By.xpath("//a[text()='Logout, " + name + "']"));
        return logoutNameText.isDisplayed();
    }
}
