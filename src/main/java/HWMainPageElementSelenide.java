import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HWMainPageElementSelenide {

    SelenideElement noteBookAndCompCategoryInSideMenu = $(By.xpath("//ul[@class='menu-categories menu-categories_type_main']/li[1]"));
}
