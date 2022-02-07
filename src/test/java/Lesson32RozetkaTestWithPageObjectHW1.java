
//Перейти на https://rozetka.com.ua/
//В сайд меню перейти в раздел Ноутбуки и компьютеры
//Перейти в категорию Ноутбуки
//Примерить фильтр "Продавец" Rozetka
//Примерить фильтр "Цена" установть цену до - 100000
//Перейти на продуктовую первого товара с плашкой "Акция"
//Проверить что на продуктовой странице отображается плашка "Акция"

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Lesson32RozetkaTestWithPageObjectHW1 {

    private WebDriver driver;
    private WebDriverWait wait;
    private final String MAX_PRICE = "100000";
    private final String EXPECTED_TEXT = "АКЦИЯ";

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
    }

    @Test
    public void testRozetkaHW() throws IOException {
        new MainPageLogicHW(driver, wait).checkVisableOfLaptopsAndComputers().searchLaptopsAndComputersClick();
        new SearchPageLaptopsAndComputersLogicHW(driver, wait).checkVisableOfLaptops().searchLaptopsClick();
        new SearchPageLaptopsLogicHW(driver, wait).checkVisableOfSellerRozetka().searchLaptopsRozetkaClick();

        SearchPageLaptopsRozetkaLogicHW searchPageLaptopsRozetkaLogicHW = new SearchPageLaptopsRozetkaLogicHW(driver, wait);
        searchPageLaptopsRozetkaLogicHW.checkVisableOfInputMaxPrice().clearInputMaxPrice().typeTextToInputMaxPrice(MAX_PRICE);
        searchPageLaptopsRozetkaLogicHW.checkVisableOfOkButton().searchLaptopsRozetkaPriceClick();

        new SearchPageLaptopsRozetkaPriceLogicHW(driver, wait).checkVisableOfFirstPromoProduct().firstPromoProductClick();

        PromoProductPageLogicHW promoProductPageLogicHW = new PromoProductPageLogicHW(driver, wait);
        Assert.assertEquals(promoProductPageLogicHW.checkVisableOfPromoLabel().promoLabelText(), EXPECTED_TEXT);
    }

    @AfterMethod
    public void after() {
        driver.close(); // driver.quit()
    }
}
