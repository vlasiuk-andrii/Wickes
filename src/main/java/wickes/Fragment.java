package wickes;

import org.openqa.selenium.WebElement;

public abstract class Fragment extends ServiceWD {
    private WebElement rootElement;
    //private WebElement rootElement1;


    public WebElement getRootElement(){
        return rootElement;
    }

    public void setRootElement(WebElement element){
        this.rootElement = element;
    }

//    public WebElement getChildElement(By element){
//        return rootElement.findElement(element);
//    }
}
