package wickes.pages;

import wickes.Page;
import wickes.fragments.*;

public class SearchResultPage extends Page{

    MainIconFragment mainIconFragment = new MainIconFragment();
    SearchFragment searchFragment = new SearchFragment();
    MenuFragment menuFragment = new MenuFragment();
    SearchFacetFragment searchFacetFragment = new SearchFacetFragment();
    SearchResultFragment searchResultFragment = new SearchResultFragment();

    public SearchResultPage() {
        setTitle("Search gloves | Wickes.co.uk");
        setUrl("/search");
        setFragmentsMap(
                mainIconFragment,
                searchFragment,
                menuFragment,
                searchFacetFragment,
                searchResultFragment);
    }

    public MainIconFragment getMainIconFragment() {
        return mainIconFragment;
    }

    public SearchFragment getSearchFragment() {
        return searchFragment;
    }

    public MenuFragment getMenuFragment() {
        return menuFragment;
    }

    public SearchFacetFragment getSearchFacetFragment() {
        return searchFacetFragment;
    }

    public SearchResultFragment getSearchResultFragment() {
        return searchResultFragment;
    }
}
