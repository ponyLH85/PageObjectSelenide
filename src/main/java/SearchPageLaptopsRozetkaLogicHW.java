import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLaptopsRozetkaLogicHW {

    By inputMaxPrice = By.xpath("//input[@formcontrolname='max']");
    By okButton = By.xpath("//input[@formcontrolname='max']/../button");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLaptopsRozetkaLogicHW(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLaptopsRozetkaLogicHW checkVisableOfInputMaxPrice() {
        driver.findElement(inputMaxPrice).isDisplayed();
        return this;
    }

    public SearchPageLaptopsRozetkaLogicHW clearInputMaxPrice() {
        driver.findElement(inputMaxPrice).clear();
        return this;
    }

    public SearchPageLaptopsRozetkaLogicHW typeTextToInputMaxPrice(String text) {
        driver.findElement(inputMaxPrice).sendKeys(text);
        return this;
    }

    public SearchPageLaptopsRozetkaLogicHW checkVisableOfOkButton() {
        driver.findElement(okButton).isDisplayed();
        return this;
    }

    public SearchPageLaptopsRozetkaPriceLogicHW searchLaptopsRozetkaPriceClick() {
        driver.findElement(okButton).click();
        return new SearchPageLaptopsRozetkaPriceLogicHW(driver, wait);
    }

}
