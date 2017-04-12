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
        //given:
        productDetailsPage.visit("/186927");
        productDetailsPage.check();
        //when:
        System.out.println(productDetailsPage.getFragment("ProductDetailsFragment"));
        //productDetailsPage.getFragment("productDetailsFragment").getChildElement(By.cssSelector("button.addToBasketButton")).click();
        //then:
        //productDetailsPage.getFragment("basketPopUpFragment").isFragmentDisplayed();
    }
}
