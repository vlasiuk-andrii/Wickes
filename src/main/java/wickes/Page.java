package wickes;

import java.util.HashMap;
import java.util.Map;

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

    protected boolean pageContainsFragments(Map<String,Fragment> fragments){
        for (Map.Entry<String,Fragment> entry : fragments.entrySet()) {
           if (!entry.getValue().getRootElement().isDisplayed()){
               return false;
           }
        }
        return true;
    }

    protected void setFragmentsMap(Fragment... fragments){
        for (Fragment fragment : fragments){
            this.fragments.put(fragment.getClass().toString().replaceAll("class wickes.fragments.", ""), fragment);
        }
    }

    public Map<String, Fragment> getFragments(){
        return (fragments);
    }

    public Fragment getFragment(String fragmentName){
        return fragments.get(fragmentName);
    }
}
