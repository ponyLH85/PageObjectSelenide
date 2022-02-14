public class HWCartPageLogicSelenide extends HWCartPageElementSelenide {

    public String getTittleOfProductInCartPopup() {
        return tittleOfProductInCartPopup.text().trim();
    }

}
