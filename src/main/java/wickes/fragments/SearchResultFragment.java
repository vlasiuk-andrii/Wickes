package wickes.fragments;

import org.openqa.selenium.By;
import wickes.Fragment;

public class SearchResultFragment extends Fragment{
    public SearchResultFragment() {
        rootElement = driver.findElement(By.cssSelector("div#searchResults"));
    }
}
