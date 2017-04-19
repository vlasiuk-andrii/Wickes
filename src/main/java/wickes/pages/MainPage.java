package wickes.pages;
import wickes.Page;
import wickes.fragments.MainIconFragment;
import wickes.fragments.MenuFragment;
import wickes.fragments.SearchFragment;

public class MainPage extends Page{

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();

    public MainPage() {
        setUrl("/");
        setTitle("Wickes DIY - Home Improvement Products for Trade and DIY");
        setFragmentsMap(
                mainIconFragment,
                searchFragment,
                menuFragment);
    }
}
