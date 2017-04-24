import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import wickes.pages.BasketPage;
import wickes.pages.ProductDetailsPage;

import static junit.framework.TestCase.assertTrue;

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
        productDetailsPage.getProductDetailsFragment().closeSignUpPopUp();
        productDetailsPage.getProductDetailsFragment().clickAddToBasketButton();
        then:
        assertTrue("Fragment is not displayed",productDetailsPage.getBasketPopUpFragment().isFragmentDisplayed());
    }

    @Test
    public void secondLookIntoBasketTest() {
        given:
        basketPage.visit();
        when:
        basketPage.check();
        then:
        assertTrue("Product code is not displayed",basketPage.getBasketFragment().isProductCodeDisplayed());
    }
}
