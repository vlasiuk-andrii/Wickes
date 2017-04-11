package wickes.fragments;

import org.openqa.selenium.By;
import wickes.Fragment;

public class EmptySearchResultFragment extends Fragment{

    public EmptySearchResultFragment() {
        rootElement = driver.findElement(By.cssSelector("div.item_container_holder.empty_search"));
    }
}
