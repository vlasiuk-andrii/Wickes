package wickes;

import org.openqa.selenium.By;

import java.util.*;

import static junit.framework.TestCase.assertTrue;
import static wickes.appendice.CommonConstants.rootUrl;

public abstract class Page extends ServiceWD {

    private String title;
    private String url;
    private Map<String, Fragment> fragments = new HashMap<String, Fragment>();

    public void visit(){
        driver.get(rootUrl + url);
    }

    public void visit(String requestText){
        driver.get(rootUrl + url + requestText);
    }

    public void check(){
        assertTrue(driver.getCurrentUrl().contains(url));
        assertTrue(driver.getTitle().contains(title));
    }

    protected void setTitle(String title){
        this.title = title;
    }

    protected void setUrl(String url){
        this.url = url;
    }

    protected boolean pageContainsFragments(Fragment... fragments){
        for (Fragment fragment : fragments) {
           if (!fragment.getRootElement().isDisplayed()){
               return false;
           }
        }
        return true;
    }

    protected void setFragmentsMap(Fragment... fragments){
        for (Fragment fragment : fragments){
            this.fragments.put(fragment.toString(), fragment);
        }
    }

    public Map<String, Fragment> getFragmentsMap(){
        return (fragments);
    }

    public Fragment getFragment(String fragmentName){
        return fragments.get(fragmentName);
    }
}
