package wickes.fragments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wickes.Fragment;

public class MainIconFragment extends Fragment{

    @FindBy(xpath = "//img[@title='Wickes.co.uk']")
    private WebElement root;

    public MainIconFragment() {
        setRootElement(root);
    }
}
