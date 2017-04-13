package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ProductDetailsFragment extends Fragment {
    @FindBy(css = "div#productDetailUpdateable")
    private WebElement root;

    @FindBy(css = "div.account-box")
    private WebElement root123;

    @FindBy(css = "div.account-box")
    private WebElement root456;

    List webElements = new ArrayList<WebElement>();

    public ProductDetailsFragment() {
        setRootElement(root);
        for (Field field : ProductDetailsFragment.class.getDeclaredFields()){
            if (field.isAnnotationPresent(FindBy.class)){
                webElements.add(field);
            }
        }
        setWebElements(webElements);
    }
}
