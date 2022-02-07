import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLaptopsAndComputersLogicHW {

    By laptops = By.xpath("//div[@class='tile-cats']");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLaptopsAndComputersLogicHW(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLaptopsAndComputersLogicHW checkVisableOfLaptops() {
        driver.findElement(laptops).isDisplayed();
        return this;
    }

    public SearchPageLaptopsLogicHW searchLaptopsClick() {
        driver.findElement(laptops).click();
        return new SearchPageLaptopsLogicHW(driver, wait);
    }

}
