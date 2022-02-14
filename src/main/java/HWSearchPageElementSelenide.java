import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HWSearchPageElementSelenide {

    SelenideElement buyProductBtn = $(By.xpath("//button[contains(@class, 'buy-button')]"));

    SelenideElement tittleOfFirstProduct = $(By.xpath("//span[@class='goods-tile__title']"));

    SelenideElement cartCounterBtn = $(By.xpath("//span[contains(@class, 'counter--green')]"));

}
