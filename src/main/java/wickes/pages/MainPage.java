package wickes.pages;
import wickes.Page;
import wickes.fragments.*;

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

    public MainIconFragment getMainIconFragment() { return new MainIconFragment(); }
    public SearchFacetFragment getSearchFacetFragment() { return new SearchFacetFragment(); }
    public MenuFragment getMenuFragment(){return new MenuFragment(); }
}
