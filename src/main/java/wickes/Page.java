package wickes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;

public abstract class Page extends BaseClass{
    protected WebDriver driver;
    protected String title;
    protected String url;

    public Page() {
    }

    public void visit(){
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
