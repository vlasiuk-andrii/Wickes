package wickes.pages;

import wickes.Page;
import wickes.fragments.*;

public class LoginPage extends Page {

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    AccountFragment accountFragment = new AccountFragment();

    public LoginPage() {
        setTitle("Wickes.co.uk");
        setUrl("/login");
        setFragmentsMap(
                mainIconFragment,
                searchFragment,
                menuFragment,
                accountFragment);
    }

    public MainIconFragment getMainIconFragment() { return new MainIconFragment(); }
    public SearchFacetFragment getSearchFacetFragment() { return new SearchFacetFragment(); }
    public MenuFragment getMenuFragment(){return new MenuFragment(); }
    public AccountFragment getAccountFragment() {return new AccountFragment();}
}
