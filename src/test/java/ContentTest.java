import org.junit.Test;
import org.openqa.selenium.By;
import wickes.pages.*;

import static junit.framework.TestCase.assertTrue;

public class ContentTest extends BaseSpec{

    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private BasketPage basketPage = new BasketPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    public ContentTest(){
    }

    @Test
    public void mainPageContentTest(){
        given:
        mainPage.visit();
        when:
        mainPage.check();
        then:
        assertTrue("Content on mainPage is incorrect",mainPage.isContentOnPageCorrect());
    }

    @Test
    public void loginPageContentTest(){
        given:
        loginPage.visit();
        when:
        loginPage.check();
        then:
        assertTrue("Content on loginPage is incorrect",loginPage.isContentOnPageCorrect());
    }

    @Test
    public void basketPageContentTest(){
        given:
        basketPage.visit();
        when:
        basketPage.check();
        then:
        assertTrue("Content on basketPage is incorrect",basketPage.isContentOnPageCorrect());
    }

    @Test
    public void searchResultPage(){
        given:
        searchResultPage.visit("?text=gloves");
        when:
        searchResultPage.check();
        then:
        assertTrue("Content on searchResultPage is incorrect",searchResultPage.isContentOnPageCorrect());
    }

    @Test
    public void productDetailsPage() {
        given:
        productDetailsPage.visit("/186927");
        when:
        productDetailsPage.check();
        productDetailsPage.getProductDetailsFragment().closeSignUpPopUp();
        productDetailsPage.getProductDetailsFragment().clickAddToBasketButton();
        then:
        assertTrue("Content on productDetailsPage is incorrect",productDetailsPage.isContentOnPageCorrect());
    }
}
