package wickes.Fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wickes.Fragment;

public class SearchFragment extends Fragment{

    public SearchFragment() {
        rootElement = driver.findElement(By.xpath("//form[@name='search_form']"));
    }
}
