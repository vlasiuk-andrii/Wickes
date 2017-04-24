package wickes.pages;

import wickes.Page;
import wickes.fragments.*;

public class ProductDetailsPage extends Page {

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    ProductDetailsFragment productDetailsFragment = new ProductDetailsFragment();
    BasketPopUpFragment basketPopUpFragment = new BasketPopUpFragment();


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

    public MainIconFragment getMainIconFragment() { return new MainIconFragment(); }
    public SearchFacetFragment getSearchFacetFragment() { return new SearchFacetFragment(); }
    public MenuFragment getMenuFragment(){return new MenuFragment(); }
    public ProductDetailsFragment getProductDetailsFragment() {return new ProductDetailsFragment(); }
    public BasketPopUpFragment getBasketPopUpFragment() {
        return new BasketPopUpFragment();
    }
}
