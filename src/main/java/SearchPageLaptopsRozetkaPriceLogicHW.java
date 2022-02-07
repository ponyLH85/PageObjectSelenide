import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageLaptopsRozetkaPriceLogicHW {

    By firstPromoProduct = By.xpath("//span[contains(@class, 'promo-label_type_action')]");
    By firstPromoProductForClick = By.xpath("//span[contains(@class, 'promo-label_type_action')]/..");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPageLaptopsRozetkaPriceLogicHW(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPageLaptopsRozetkaPriceLogicHW checkVisableOfFirstPromoProduct() {
        driver.findElement(firstPromoProduct).isDisplayed();
        return this;
    }

    public PromoProductPageLogicHW firstPromoProductClick() {
        driver.findElement(firstPromoProductForClick).click();
        return new PromoProductPageLogicHW(driver, wait);
    }

}
