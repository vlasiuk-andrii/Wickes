import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import wickes.pages.BasketPage;
import wickes.pages.ProductDetailsPage;

import static wickes.appendice.FragmentsConstants.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddToBasketTest extends BaseSpec{
    private BasketPage basketPage = new BasketPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    public AddToBasketTest() {
    }

    @Test
    public void firstAddToBasketTest() {
        given:
        productDetailsPage.visit("/186927");
        productDetailsPage.check();
        when:
        productDetailsPage.getFragment(PRODUCT_DETAILS_FRAGMENT).getChildElement(By.cssSelector("button.addToBasketButton")).click();
        then:
        productDetailsPage.getFragment(BASKET_POPUP_FRAGMENT).isFragmentDisplayed();
    }

    @Test
    public void secondLookIntoBasketTest() {
        given:
        basketPage.visit();
        when:
        basketPage.check();
        then:
        basketPage.getFragment(BASKET_FRAGMENT).getChildElement(By.cssSelector("div.product_details_sku")).isDisplayed();
    }
}
