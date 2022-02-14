import static com.codeborne.selenide.Selenide.page;

public class HWSearchPageLogicSelenide extends HWSearchPageElementSelenide {

    public HWSearchPageLogicSelenide buyProductBtnClick() {
        buyProductBtn.click();
        return this;
    }

    public String getTittleFromSearchPage() {
        return tittleOfFirstProduct.text().trim();
    }

    public String getCartCounter() {
        return cartCounterBtn.innerText().trim();
    }

    public HWCartPageLogicSelenide cartCounterBtnClick() {
        cartCounterBtn.click();
        return page(HWCartPageLogicSelenide.class);
    }

}
