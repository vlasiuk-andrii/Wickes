package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class EmptySearchResultFragment extends Fragment{

    @FindBy(css = "div.item_container_holder.empty_search")
    private WebElement root;

    public EmptySearchResultFragment() {
        setRootElement(root);
    }
}
