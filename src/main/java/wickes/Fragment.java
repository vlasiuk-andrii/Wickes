package wickes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public abstract class Fragment extends ServiceWD {
    private WebElement rootElement;
    private List<WebElement> webElements = new ArrayList<WebElement>();

    public WebElement getRootElement(){
        return rootElement;
    }

    public void setRootElement(WebElement element){
        this.rootElement = element;
    }

    public void setWebElements(List<WebElement> fields){
        fields.get(0).

        System.out.println(fields);
    }

    public WebElement getChildElement(String element){
        return rootElement.findElement(By.cssSelector(element));
    }

    public List<WebElement> getChildElementList(){
        return webElements;
    }

    public List<By> getChildElements(By... elements){
        List<By> webElements = new ArrayList<By>();
        for (By element : elements) {
                webElements.add(element);
        }
        return webElements;
    }

    public void isFragmentDisplayed(){}
}
