package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class SearchFragment extends Fragment{

    @FindBy(xpath = "//form[@name='search_form']")
    private WebElement root;

    public SearchFragment() {
        setRootElement(root);
    }
}
