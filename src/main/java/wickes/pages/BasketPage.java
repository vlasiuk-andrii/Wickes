package wickes.pages;

import org.openqa.selenium.WebElement;
import wickes.Page;
import wickes.fragments.*;

public class BasketPage extends Page{

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    BasketFragment basketFragment = new BasketFragment();

    public BasketPage() {
        setTitle("Wickes.co.uk");
        setUrl("/cart");
        setFragmentsMap(
                mainIconFragment,
                searchFragment,
                menuFragment,
                basketFragment);
    }

    public MainIconFragment getMainIconFragment() { return new MainIconFragment(); }
    public SearchFacetFragment getSearchFacetFragment() { return new SearchFacetFragment(); }
    public MenuFragment getMenuFragment(){return new MenuFragment(); }
    public BasketFragment getBasketFragment() {
        return new BasketFragment();
    }

}
