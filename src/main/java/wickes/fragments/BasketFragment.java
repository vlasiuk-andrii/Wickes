package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class BasketFragment extends Fragment{

    @FindBy(css = "div#basketPanel")
    private WebElement root;

    @FindBy(css = "div.product_details_sku")
    private WebElement productCode;

    public BasketFragment() {
        setRootElement(root);
    }

    public boolean isProductCodeDisplayed(){
        if(!productCode.isDisplayed()){
            return false;
        }
        return true;
    }
}
