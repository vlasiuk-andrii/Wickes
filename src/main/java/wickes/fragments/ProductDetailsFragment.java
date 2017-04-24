package wickes.fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsFragment extends Fragment {
    @FindBy(css = "div#productDetailUpdateable")
    private WebElement root;

    private By addToBasketButton = By.cssSelector("button.addToBasketButton");

    @FindBy(css = "div.account-box")
    private WebElement root456;

    private List webElements = new ArrayList<WebElement>();

    public ProductDetailsFragment() {
        setRootElement(root);
//        for (Field field : ProductDetailsFragment.class.getDeclaredFields()){
//            if (field.isAnnotationPresent(FindBy.class)){
//                webElements.add(field);
//            }
//        }

//        setWebElements(root,
//                addToBasketButton,
//                root456);
//        }
    }

    public void clickAddToBasketButton() {
        getChildElement(addToBasketButton).click();
        waitForJSinactivity();
    }

    public void closeSignUpPopUp(){
        getDriver().findElement(By.cssSelector("a#lightBoxClose")).click();
    }
}
