package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class AccountFragment extends Fragment {

    @FindBy(css = "div.account-box")
    private WebElement root;

    public AccountFragment() {
        setRootElement(root);
    }
}
