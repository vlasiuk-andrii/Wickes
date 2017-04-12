package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class MenuFragment extends Fragment {
    @FindBy(css = "div.navMainWrapper")
    private WebElement root;

    public MenuFragment() {
        setRootElement(root);
    }
}
