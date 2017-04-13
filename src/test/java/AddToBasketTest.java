import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import wickes.pages.BasketPage;
import wickes.pages.ProductDetailsPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddToBasketTest extends BaseSpec{
    private BasketPage basketPage = new BasketPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Test
    public void firstAddToBasketTest() throws InterruptedException {
        given:
        productDetailsPage.visit("/186927");
        productDetailsPage.check();
        when:
        productDetailsPage.getFragment("ProductDetailsFragment").getChildElement(By.cssSelector("button.addToBasketButton")).click();
        then:
        productDetailsPage.getFragment("BasketPopUpFragment").isFragmentDisplayed();
    }

    @Test
    public void secondLookIntoBasketTest() throws InterruptedException {
        given:
        basketPage.visit();
        when:
        basketPage.check();
        then:
        basketPage.getFragment("BasketFragment").getChildElement(By.cssSelector("div.product_details_sku")).isDisplayed();
    }
}
