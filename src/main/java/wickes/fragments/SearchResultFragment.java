package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class SearchResultFragment extends Fragment{

    @FindBy(css = "div#searchResults")
    private WebElement root;

    public SearchResultFragment() {
        setRootElement(root);
    }
}
