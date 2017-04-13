import org.junit.Test;
import org.openqa.selenium.By;
import wickes.pages.BasketPage;
import wickes.pages.ProductDetailsPage;

public class AddToBasketTest extends BaseSpec{
    private BasketPage basketPage = new BasketPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Test
    public void addToBasketTest() throws InterruptedException {
        given:
        productDetailsPage.visit("/186927");
        productDetailsPage.check();
        when:
        productDetailsPage.getFragment("ProductDetailsFragment").getChildElement(By.cssSelector("button.addToBasketButton")).click();
        then:
        productDetailsPage.getFragment("BasketPopUpFragment").isFragmentDisplayed();
        //Thread.sleep(5000);
    }
}
