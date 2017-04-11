package wickes;

import static junit.framework.TestCase.assertTrue;

public abstract class Page extends ServiceWD {

    private String title;
    private String url;

    public Page() {
    }

    public void visit(String sku){
        driver.get(url);
    }

    public void check(){
        driver.getCurrentUrl().compareTo(url);
    }

    protected void pageContainsFragment(Fragment fragment){
        assertTrue(fragment.rootElement.isDisplayed());
    }

    protected void pageContainsFragments(Fragment... fragments){
        for (Fragment fragment : fragments) {
            assertTrue("Fragment is not displayed",fragment.rootElement.isDisplayed());
        }
    }
}
