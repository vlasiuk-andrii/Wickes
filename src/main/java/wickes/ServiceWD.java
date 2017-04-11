package wickes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import wickes.appendice.CommonConstants;

public class ServiceWD {
    protected WebDriver driver;

    public void initWD(){
        System.setProperty("webdriver.chrome.driver", CommonConstants.BROWSER_PATH_CHROME);
        System.setProperty("webdriver.chrome.silentOutput", "true");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
