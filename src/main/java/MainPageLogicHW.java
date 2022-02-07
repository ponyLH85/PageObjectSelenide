import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageLogicHW {

    By laptopsAndComputers = By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]//span");

    private WebDriver driver;
    private WebDriverWait wait;

    public MainPageLogicHW(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public MainPageLogicHW checkVisableOfLaptopsAndComputers() {
        driver.findElement(laptopsAndComputers).isDisplayed();
        return this;
    }

    public SearchPageLaptopsAndComputersLogicHW searchLaptopsAndComputersClick() {
        driver.findElement(laptopsAndComputers).click();
        return new SearchPageLaptopsAndComputersLogicHW(driver, wait);
    }

}
