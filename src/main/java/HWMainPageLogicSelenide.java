import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class HWMainPageLogicSelenide extends HWMainPageElementSelenide {

    public HWCategoryPageLogicSelenide clickOnCategory(SelenideElement category) {
        category.waitUntil(Condition.visible, 100000).click();
        return page(HWCategoryPageLogicSelenide.class);
    }
}
