package wickes.Fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class SearchFacetFragment extends Fragment{
    private By submitButton = By.cssSelector("");

    @FindBy(css = "div#searchFacetBlock")
    private WebElement root;

    public SearchFacetFragment() {
        setRootElement(root);
    }

    public void clickSubmit() {
        getChildElement(submitButton).click();
    }
}
