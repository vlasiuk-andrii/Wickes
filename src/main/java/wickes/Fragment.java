package wickes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public abstract class Fragment extends ServiceWD {
    private WebElement rootElement;
    private Map<String, WebElement> webElements = new HashMap<String, WebElement>();

    public WebElement getRootElement(){
        return rootElement;
    }

    public void setRootElement(WebElement element){
        this.rootElement = element;
    }

    public void setWebElements(WebElement... childWebElements){
        for (WebElement element : childWebElements){
            webElements.put( element.toString(), element);
        }
    }

    public Map<String, WebElement> getWebElements(){
        return webElements;
    }

    public WebElement getChildElement(By cssSelector){
        return rootElement.findElement(cssSelector);
    }

    public Map<String, WebElement> getChildElementMap(){
        return webElements;
    }

    public List<By> getChildElements(By... elements){
        List<By> webElements = new ArrayList<By>();
        for (By element : elements) {
                webElements.add(element);
        }
        return webElements;
    }

    public boolean isFragmentDisplayed(){
        return false;
    }
}
