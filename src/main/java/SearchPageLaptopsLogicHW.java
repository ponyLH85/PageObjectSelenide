import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLaptopsLogicHW {

    By sellerRozetka = By.xpath("//li[@class='checkbox-filter__item ng-star-inserted']");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLaptopsLogicHW(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLaptopsLogicHW checkVisableOfSellerRozetka() {
        driver.findElement(sellerRozetka).isDisplayed();
        return this;
    }

    public SearchPageLaptopsRozetkaLogicHW searchLaptopsRozetkaClick() {
        driver.findElement(sellerRozetka).click();
        return new SearchPageLaptopsRozetkaLogicHW(driver, wait);
    }

}
