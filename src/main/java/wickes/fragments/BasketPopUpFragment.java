package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class BasketPopUpFragment extends Fragment {

    @FindBy(css = "div#cart_popup")
    private WebElement root;

    public BasketPopUpFragment() {
        setRootElement(root);
    }

    public boolean isFragmentDisplayed(){
        if(!root.getAttribute("style").contains("display: block;")){
            return false;
        }
            return true;
    }
}
