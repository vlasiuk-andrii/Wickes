package wickes.Fragments;

import org.openqa.selenium.By;
import wickes.Fragment;

public class MainIconFragment extends Fragment{

    public MainIconFragment() {
        rootElement = driver.findElement(By.xpath("//img[@title='Wickes.co.uk']"));
    }
}
