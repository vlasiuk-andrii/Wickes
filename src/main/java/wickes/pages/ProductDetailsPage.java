package wickes.pages;

import wickes.Page;
import wickes.fragments.*;

public class ProductDetailsPage extends Page {

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
    BasketPopUpFragment basketPopUpFragment = new BasketPopUpFragment();

    public ProductDetailsPage(){
        setUrl("/p");
        setTitle("Wickes Grippa Gloves Orange One Size | Wickes.co.uk");
        setFragmentsMap(
                mainIconFragment,
                searchFragment,
                menuFragment,
                productDetailsFragment,
                basketPopUpFragment);
    }

    public boolean isContentOnPageCorrect(){
        if (!pageContainsFragments(mainIconFragment, searchFragment, menuFragment, productDetailsFragment)){
            return false;
        }
        return true;
    }
}
