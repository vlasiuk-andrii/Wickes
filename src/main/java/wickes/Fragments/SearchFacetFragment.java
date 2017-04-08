package wickes.Fragments;

import org.openqa.selenium.By;
import wickes.Fragment;

public class SearchFacetFragment extends Fragment{
    public SearchFacetFragment() {
        rootElement = driver.findElement(By.cssSelector("div#searchFacetBlock"));
    }
}
