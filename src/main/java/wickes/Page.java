package wickes;

import static junit.framework.TestCase.assertTrue;
import static wickes.appendice.CommonConstants.rootUrl;

public abstract class Page extends ServiceWD {

    private String title;
    private String url;

    public Page() {
    }

    public void visit(){
        driver.get(rootUrl + url);
    }

    public void visit(String requestText){
        driver.get(rootUrl + url + requestText);
    }

    public void check(){
        assertTrue(driver.getCurrentUrl().contains(url));
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
}
