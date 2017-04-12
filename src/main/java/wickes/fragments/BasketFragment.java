package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class BasketFragment extends Fragment{

    @FindBy(css = "div#basketPanel")
    private WebElement root;

    public BasketFragment() {
        setRootElement(root);
    }
}
