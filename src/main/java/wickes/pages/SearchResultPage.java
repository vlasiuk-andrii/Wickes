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
        setTitle("\t\tSearch sfse | Wickes.co.uk");
        setUrl("/search");
    }

    public boolean isContentOnPageCorrect(){
        if (!pageContainsFragments(mainIconFragment, searchFragment, menuFragment, searchFacetFragment, searchResultFragment)){
            return false;
        }
        return true;
    }
}
