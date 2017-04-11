package wickes;

import static junit.framework.TestCase.assertTrue;

public abstract class Page extends ServiceWD {

    private String title;
    private String url;
    protected String rootUrl = "http://www.wickes.co.uk";

    public Page() {
    }

    public void visit(){
        driver.get(rootUrl + url);
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

    protected void pageContainsFragment(Fragment fragment){
        assertTrue(fragment.getRootElement().isDisplayed());
    }

    protected void pageContainsFragments(Fragment... fragments){
        for (Fragment fragment : fragments) {
           assertTrue("Fragment is not displayed",fragment.getRootElement().isDisplayed());
        }
    }
}
