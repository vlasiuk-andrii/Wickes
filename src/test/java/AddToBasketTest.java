import org.junit.Test;
import org.openqa.selenium.By;
import wickes.fragments.ProductDetailsFragment;
import wickes.pages.BasketPage;
import wickes.pages.ProductDetailsPage;
import wickes.pages.SearchResultPage;

public class AddToBasketTest extends BaseSpec{
    private BasketPage basketPage = new BasketPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Test
    public void addToBasketTest(){
        given:
        productDetailsPage.visit();
        productDetailsPage.check();
        when:
        productDetailsPage.getFragment("productDetailsFragment").getChildElement(By.cssSelector("button.addToBasketButton ")).click();
        then:

    }
}
