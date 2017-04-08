package wickes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Fragment extends BaseClass{
    protected WebDriver driver;
    protected WebElement rootElement;

    public Fragment() {
    }

    public WebElement getRootElement(){
        return rootElement;
    }

    public void setRootElement(WebElement element){
        this.rootElement = element;
    }

    public void isRootElementPresent(){
        //driver.findElement(rootElement);
    }
}
