import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Lesson34RozetkaSelenideWithPageObjectHW14 {
//Открыть https://rozetka.com.ua/
//Перейти в раздел «Компьютеры и ноутбуки»
//Перейти в раздел «Ноутбуки»
//Добавить первый товар в корзину
//Проверить что в корзину добавился один товар
//Перейти в корзину и проверить, что добавился правильный товар

    @BeforeMethod
    public void before() {
        Configuration.startMaximized = true;
        open("https://rozetka.com.ua/");
    }

    @Test
     public void firstSelenideTest() {
        HWMainPageLogicSelenide mp = new HWMainPageLogicSelenide();
        HWCategoryPageLogicSelenide cp = new HWCategoryPageLogicSelenide();
        HWSearchPageLogicSelenide sp = new HWSearchPageLogicSelenide();

        mp.clickOnCategory(mp.noteBookAndCompCategoryInSideMenu)
                .clickOnCategory(cp.noteBookCategory)
                .buyProductBtnClick();

        Assert.assertEquals(sp.getCartCounter(), "1");
        Assert.assertEquals(sp.getTittleFromSearchPage(), sp.cartCounterBtnClick().getTittleOfProductInCartPopup());
    }
}
