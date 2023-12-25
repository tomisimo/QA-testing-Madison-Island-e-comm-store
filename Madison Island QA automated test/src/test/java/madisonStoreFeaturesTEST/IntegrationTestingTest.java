package madisonStoreFeaturesTEST;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import madisonStoreFeatures.GeneralMethods;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

@Epic("Login and Main Cart integration testing")
public class IntegrationTestingTest extends GeneralMethods {

    SelenideElement emailInputTextBox = $("#email");
    SelenideElement passwordInputTextBox = $("#pass");
    SelenideElement loginButton = $("#send2");
    SelenideElement loginWelcomeMsg = $("p.welcome-msg");
    SelenideElement cartileCategory = $(".level0 a[href*='carti']");
    SelenideElement deLaIdeeLaBani = $(".product-info a[href*='de-la-idee-la-bani']");
    SelenideElement setProductQty = $("#qty");
    SelenideElement deLaIdeeLaBaniAddToCart = $(".add-to-cart-buttons .button.button.btn-cart");
    SelenideElement cartIconAndLabel = $("a.skip-link.skip-cart");
    SelenideElement viewShoppingCartLink = $("a.cart-link");
    SelenideElement mainCartPageTitle = $(".page-title.title-buttons h1");
    SelenideElement deLaIdeeLaBaniProductImage = $(".product-cart-image a.product-image");
    SelenideElement deLaIdeeLaBaniProductName = $("h2.product-name");
    SelenideElement deLaIdeeLaBaniProductPrice = $(".product-cart-price .price");
    SelenideElement deLaIdeeLaBaniProductQty = $(".product-cart-actions .input-text.qty");
    SelenideElement EmptyCartButton = $("#empty_cart_button");
    SelenideElement ACCOUNTlink = $(".skip-link.skip-account .label");
    SelenideElement accountLogOut = $("a[href*='/account/logout/']");

    @Feature("Login and Main Cart integration")
    @Description("Login to registered user account and add a product to the cart")
    @Test
    public void Login_to_registered_user_account_and_add_a_product_to_the_cart(){
        //Preconditions
        open_Login_Form();
        //Test Case steps
        emailInputTextBox.click();
        emailInputTextBox.clear();
        emailInputTextBox.sendKeys("simo_tamas2007@yahoo.com");
        passwordInputTextBox.click();
        passwordInputTextBox.clear();
        passwordInputTextBox.sendKeys("realmadrid");
        loginButton.click();
        loginWelcomeMsg.shouldBe(Condition.text("WELCOME, SIMO TAMAS!"));
        cartileCategory.click();
        deLaIdeeLaBani.click();
        setProductQty.click();
        setProductQty.clear();
        setProductQty.sendKeys("2");
        deLaIdeeLaBaniAddToCart.click();
        cartIconAndLabel.click();
        viewShoppingCartLink.click();
        mainCartPageTitle.shouldBe(Condition.text("SHOPPING CART"));
        deLaIdeeLaBaniProductImage.shouldBe(Condition.visible);
        deLaIdeeLaBaniProductName.shouldBe(Condition.text("DE LA IDEE LA BANI"));
        deLaIdeeLaBaniProductPrice.shouldBe(Condition.text("37,00 RON"));
        //Postcondition
        EmptyCartButton.click();
        ACCOUNTlink.click();
        accountLogOut.click();
    }
}
