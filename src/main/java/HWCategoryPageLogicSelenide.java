import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class HWCategoryPageLogicSelenide extends HWCategoryPageElementSelenide{

    public HWSearchPageLogicSelenide clickOnCategory(SelenideElement category){
      category.shouldBe(Condition.visible).click();
      return page(HWSearchPageLogicSelenide.class);
    }
}
