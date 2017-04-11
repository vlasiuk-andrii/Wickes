package wickes.pages;

import wickes.Page;
import wickes.fragments.BasketFragment;
import wickes.fragments.MainIconFragment;
import wickes.fragments.MenuFragment;
import wickes.fragments.SearchFragment;

public class BasketPage extends Page{

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    BasketFragment basketFragment = new BasketFragment();

    public BasketPage() {
        setTitle("\t\tWickes.co.uk");
        setUrl("/cart");
    }

    public boolean isContentOnPageCorrect(){
        if (!pageContainsFragments(mainIconFragment, searchFragment, menuFragment, basketFragment)){
            return false;
        }
        return true;
    }

}
