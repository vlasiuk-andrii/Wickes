package wickes.pages;

import wickes.Page;
import wickes.fragments.*;

public class ProductDetailsPage extends Page {

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();


    public ProductDetailsPage() {
        String url = "/p";
        setUrl(url);
        setTitle("Wickes Grippa Gloves Orange One Size | Wickes.co.uk");
        setFragmentsMap(
                mainIconFragment,
                searchFragment,
                menuFragment,
                productDetailsFragment,
                basketPopUpFragment);
    }

    public BasketPopUpFragment getBasketPopUpFragment() {
        return new BasketPopUpFragment();
    }

}
