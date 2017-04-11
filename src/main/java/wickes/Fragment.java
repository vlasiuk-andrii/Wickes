package wickes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public abstract class Fragment extends ServiceWD {
    private WebElement rootElement;

    public WebElement getRootElement(){
        return rootElement;
    }

    public void setRootElement(WebElement element){
        this.rootElement = element;
    }

    public WebElement getChildElement(By element){
        return rootElement.findElement(element);
    }

    public List<By> getChildElements(By... elements){
        List<By> webElements = new ArrayList<By>();
        for (By element : elements) {
                webElements.add(element);
        }
        return webElements;
    }
}
