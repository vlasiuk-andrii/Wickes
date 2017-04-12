package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class ProductDetailsFragment extends Fragment {
    @FindBy(css = "div#productDetailUpdateable")
    private WebElement root;

    public ProductDetailsFragment() {
        setRootElement(root);
    }
}
