package wickes.pages;

import wickes.Page;
import wickes.fragments.AccountFragment;
import wickes.fragments.MainIconFragment;
import wickes.fragments.MenuFragment;
import wickes.fragments.SearchFragment;

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
}
