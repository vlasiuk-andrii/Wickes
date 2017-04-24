package wickes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;
import static wickes.appendice.CommonConstants.BROWSER_PATH_CHROME;

public class ServiceWD {
    protected static WebDriver driver;

    public ServiceWD(){
        PageFactory.initElements(driver, this);
    }

    public static void initWD(){
        System.setProperty("webdriver.chrome.driver", BROWSER_PATH_CHROME);
        System.setProperty("webdriver.chrome.silentOutput", "true");
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public void waitForJSinactivity(){
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
        try {
            sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            //Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
