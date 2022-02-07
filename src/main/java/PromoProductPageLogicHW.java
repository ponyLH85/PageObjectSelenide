import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromoProductPageLogicHW {

    By promoLabel = By.xpath("//app-label[@class='main-gallery__label ng-star-inserted']");

    private WebDriver driver;
    private WebDriverWait wait;

    public PromoProductPageLogicHW(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public PromoProductPageLogicHW checkVisableOfPromoLabel() {
        driver.findElement(promoLabel).isDisplayed();
        return this;
    }

    public String promoLabelText() {
        return driver.findElement(promoLabel).getText();
    }

}
