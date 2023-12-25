package madisonStoreFeaturesTEST;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import madisonStoreFeatures.GeneralMethods;
import madisonStoreFeatures.MainCartFeature;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class MainCartFeatureTest extends GeneralMethods {


    SelenideElement cartileCategory = $(".level0 a[href*='carti']");
    SelenideElement deLaIdeeLaBaniProductName = $(".product-info a[href*='de-la-idee-la-bani']");
    SelenideElement deLaIdeeLaBaniQtyInputTextField = $(".input-text.qty");
    SelenideElement deLaIdeeLaBaniAddToCartButton = $(".add-to-cart-buttons .button.button.btn-cart");
    SelenideElement ciceroneGuideProductName = $(".product-info a[href*='cice-2020']");
    SelenideElement ciceroneGuideQtyInputTextField = $(".add-to-cart .input-text.qty");
    SelenideElement ciceroneGuideAddToCartButton = $(".add-to-cart-buttons .button.button.btn-cart");
    SelenideElement cartIconAndCartLabel = $("a.skip-link.skip-cart");
    SelenideElement viewShoppingCartLink = $("a.cart-link");
    SelenideElement cartPageTitleLabel = $(".page-title h1");
    SelenideElement EmptyCartButton = $("#empty_cart_button");
    SelenideElement MadisonIslandLogo = $(".large");

    @Feature("My Cart") // Test Case ID : MCART-1 FORM TESTING
    @Description("Validate VIEW SHOPPING CART link is clickable and redirect to SHOPPING CART page")
    @Test()
    public void Validate_VIEW_SHOPPING_CART_link_can_be_clicked_and_redirect_to_SHOPPING_CART_page() {
        MainCartFeature clickVeiwShoppingCartLink = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        cartPageTitleLabel.shouldBe(Condition.text("SHOPPING CART"));
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    @Feature("My Cart") // Test Case ID : MCART-2 FORM TESTING
    @Description("Validate DISCOUNT CODES input text field accept entering special, numerical, alphabetical characters")
    @Test()
    public void Input_special_numerical_alphabetical_characters_verify_are_accepted_and_advice_message_appear() {
        MainCartFeature inputSpecialNumericalAphabeticalCharacters = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        inputSpecialNumericalAphabeticalCharacters.input_special_numerical_alphabetical_characters_verify_are_accepted("*1k");
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    @Feature("My Cart") // Test Case ID : MCART-3 FORM TESTING
    @Description("Validate DISCOUNT CODES input text field entering invalid code")
    @Test()
    public void Input_invalid_discount_code_verify_error_message_appear() {
        MainCartFeature inputInvalidDiscountCode = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        inputInvalidDiscountCode.input_invalid_discount_code_verify_error_message_appear("discountCODE");
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement adviceMessageColorVerification = $("#advice-required-entry-coupon_code");
    SelenideElement discountCodesTextboxBorderColorVerification = $("#coupon_code");

    @Feature("My Cart") // Test Case ID : MCART-4 FORM TESTING
    @Description("Validate APPLY button is clickable and functioning by leaving DISCOUNT CODES input text field empty, " +
            "click APPLY button and verify DISCOUNT CODES input text field borders and advice message color.")
    @Test
    public void Click_APPLY_button_verify_advice_message_visibility_and_color_and_text_field_borders_color() {
        MainCartFeature clickAPPLYverifyClickableAndFunctioning = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        clickAPPLYverifyClickableAndFunctioning.click_APPLY_link_verify_advice_message_appear_for_empty_discount_codes_input_text_field();
        System.out.println("The advice message color code = " + adviceMessageColorVerification.getCssValue("color"));
        System.out.println("The DISCOUNT CODES text field border color code = " + discountCodesTextboxBorderColorVerification.getCssValue("border-color"));
        String adviceMessageColorConvertedManuallyRGBA = "rgba(223, 40, 10, 1)";
        String discountCodesTextboxBorderColorConvertedManuallyRGBA = "rgb(223, 40, 10)";
        String getAdviceMessageColorValue = adviceMessageColorVerification.getCssValue("color");
        String getDiscountCodesTextboxBorderColorValue = discountCodesTextboxBorderColorVerification.getCssValue("border-color");
        if (adviceMessageColorConvertedManuallyRGBA.equals(getAdviceMessageColorValue)) {
            System.out.println("The color of the advice message is RED color !");
        }
        if (discountCodesTextboxBorderColorConvertedManuallyRGBA.equals(getDiscountCodesTextboxBorderColorValue)) {
            System.out.println("The color of the DISCOUNT CODES textbox border is RED color !");
        }
        Selenide.sleep(5000);
        clickAPPLYverifyClickableAndFunctioning.empty_your_cart_content();
    }

    SelenideElement countryDropdown = $("#country");
    SelenideElement selectCountry = $("option[value='RO']");

    @Feature("My Cart") // Test Case ID : MCART-5 FORM TESTING
    @Description("Validate at COUNTRY dropdown option can be selected")
    @Test
    public void Validate_country_option_at_COUNTRY_dropdown_can_be_selected() {
        MainCartFeature selectCountryOptionFromDropdown = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        countryDropdown.click();
        selectCountry.scrollTo().click();
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement stateProvinceDropdown = $("#region_id");
    SelenideElement selectStateProvince = $("option[value='291']");

    @Feature("My Cart") // Test Case ID : MCART-6 FORM TESTING
    @Description("Validate at STATE/PROVINCE dropdown option can be selected")
    @Test
    public void Validate_STATE_PROVINCE_option_at_STATE_PROVINCE_dropdown_can_be_selected() {
        MainCartFeature selectStateProvinceFromDropdown = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        countryDropdown.click();
        selectCountry.scrollTo().click();
        stateProvinceDropdown.click();
        selectStateProvince.scrollTo().click();
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement cityInputField = $("#city");

    @Feature("My Cart") // Test Case ID : MCART-7 FORM TESTING
    @Description("Validate at CITY input text field option can be entered ")
    @Test
    public void Validate_at_City_input_text_field_option_can_be_typed_in() {
        MainCartFeature typeInCityOption = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        cityInputField.click();
        cityInputField.sendKeys("Cluj-Napoca");
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    SelenideElement ZIPinputField = $("#postcode");

    @Feature("My Cart") // Test Case ID : MCART-8 FORM TESTING
    @Description("Validate at ZIP input text field option can be entered")
    @Test
    public void Validate_at_ZIP_input_text_field_option_can_be_typed_in() {
        MainCartFeature typeInZIPoption = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        ZIPinputField.click();
        ZIPinputField.sendKeys("400337");
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    SelenideElement stateProvinceAdviceMessage = $("#advice-required-entry-region_id");
    SelenideElement zipAdviceMessage = $("#advice-required-entry-postcode");

    @Feature("My Cart") // Test Case ID : MCART-9 FORM TESTING
    @Description("Validate ESTIMATE button is clickable and functioning")
    @Test
    public void Validate_ESTIMEATE_button_can_be_clicked_verify_advice_message_visibility_and_color_under_required_fields() {
        MainCartFeature clickEstimateLink = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        clickEstimateLink.click_ESTIMATE_link();
        clickEstimateLink.no_option_STATE_PROVINCE_dropdown_and_empty_ZIP_textbox_advice_message_appear();
        Selenide.sleep(5000);
        System.out.println("The STATE/PROVINCE dropdown advice message color code = " + stateProvinceAdviceMessage.getCssValue("color"));
        System.out.println("The ZIP textbox advice message color code = " + zipAdviceMessage.getCssValue("color"));
        String stateProvinceAdviceMessageColorConvertedManuallyRGBA = "rgba(223, 40, 10, 1)";
        String zipAdviceMessageColorConvertedManuallyRGBA = "rgba(223, 40, 10, 1)";
        String getStateProvinceAdvMsgColorCode = stateProvinceAdviceMessage.getCssValue("color");
        String getZipAdvMsgColorCode = zipAdviceMessage.getCssValue("color");
        if (stateProvinceAdviceMessageColorConvertedManuallyRGBA.equals(getStateProvinceAdvMsgColorCode)) {
            System.out.println("The STATE/PROVINCE dropdown advice message is RED color");
        }
        if (zipAdviceMessageColorConvertedManuallyRGBA.equals(getZipAdvMsgColorCode)) {
            System.out.println("The ZIP textbox advice message is RED color");
        }
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    SelenideElement DeLaIdeeLaBaniQtyInputBox = $(".first.odd .input-text.qty");
    SelenideElement DeLaIdeeLaBaniQtyUpdate = $(".button.btn-update");
    String getAlertMsg = "ghgjkfgh";

    @Feature("My Cart") // Test Case ID : MCART-13 FORM TESTING
    @Description("Validate Qty input text field NOT accept alphabetical characters")
    @Test
    public void Validate_Qty_input_text_field_NOT_accept_alphabetical_characters() {
        MainCartFeature typeAlphabeticalQtyInput = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        cartileCategory.click();
        ciceroneGuideProductName.click();
        ciceroneGuideQtyInputTextField.click();
        ciceroneGuideQtyInputTextField.clear();
        ciceroneGuideQtyInputTextField.sendKeys("1");
        ciceroneGuideAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        DeLaIdeeLaBaniQtyInputBox.click();
        DeLaIdeeLaBaniQtyInputBox.clear();
        DeLaIdeeLaBaniQtyInputBox.sendKeys("p");
        DeLaIdeeLaBaniQtyUpdate.click();
        switchTo().activeElement().getText();
        System.out.println(getAlertMsg);
        Selenide.sleep(5000);
        //Postcondition
        DeLaIdeeLaBaniQtyInputBox.clear();
        DeLaIdeeLaBaniQtyInputBox.sendKeys("1");
        DeLaIdeeLaBaniQtyUpdate.click();
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    @Feature("My Cart") // Test Case ID : MCART-14 FORM TESTING
    @Description("Validate Qty input text field accept numerical characters")
    @Test
    public void Validate_Qty_input_text_field_accept_numerical_characters() {
        MainCartFeature typeNumericalQtyInput = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        typeNumericalQtyInput.verify_GRAND_TOTAL_before_QTY_update();
        typeNumericalQtyInput.set_DeLaIdeeLaBani_product_qty_and_update("4");
        typeNumericalQtyInput.verify_GRAND_TOTAL_after_QTY_update();
        Selenide.sleep(5000);
        // Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    @Feature("My Cart") // Test Case ID : MCART-15 FORM TESTING
    @Description("Validate product name link is clickable and functioning")
    @Test
    public void Validate_an_added_product_to_cart_products_name_link_is_clickable_and_redirect_to_product_page() {
        MainCartFeature clickEditButtonAndRedirect = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        clickEditButtonAndRedirect.click_De_La_Idee_La_Bani_product_name_Link();
        clickEditButtonAndRedirect.verify_product_page_open();
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    @Feature("My Cart") // Test Case ID : MCART-16 FORM TESTING
    @Description("Validate UPDATE button is visible, clickable and functioning")
    @Test
    public void Validate_UPDATE_button_of_a_product_added_to_cart_is_visible_clickable_and_update_change_made_to_the_product() {
        MainCartFeature validateUPDATEbuttonVisibleAndSaveChange = new MainCartFeature();
        // Precondition
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        // Test Case Steps
        cartIconAndCartLabel.click();
        viewShoppingCartLink.click();
        validateUPDATEbuttonVisibleAndSaveChange.verify_GRAND_TOTAL_before_QTY_update();
        validateUPDATEbuttonVisibleAndSaveChange.set_DeLaIdeeLaBani_product_qty("4");
        validateUPDATEbuttonVisibleAndSaveChange.verify_DeLaIdeeLaBani_product_update_button_is_visible_and_clickable();
        validateUPDATEbuttonVisibleAndSaveChange.verify_GRAND_TOTAL_after_product_UPDATE_button_save_change();
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    @Feature("My Cart") // Test Case ID : MCART-17 FORM TESTING
    @Description("Validate UPDATE SHOPPING CART button is clickable and functioning")
    @Test
    public void Validate_UPDATE_SHOPPING_CART_button_is_clickable_and_update_the_change_made_to_the_products() {
        MainCartFeature validateUpdateShoppingCartButtonClickableAndUpdateChange = new MainCartFeature();
        open_Menu_Dropdown();
        validateUpdateShoppingCartButtonClickableAndUpdateChange.add_products_to_the_cart_module();

        validateUpdateShoppingCartButtonClickableAndUpdateChange.click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
        validateUpdateShoppingCartButtonClickableAndUpdateChange.verify_GRAND_TOTAL_before_QTY_update_of_products_added_to_cart();
        validateUpdateShoppingCartButtonClickableAndUpdateChange.set_CiceroneGuide_product_qty("6");
        validateUpdateShoppingCartButtonClickableAndUpdateChange.verify_CiceroneGuide_product_update_button_is_visible_and_clickable();
        validateUpdateShoppingCartButtonClickableAndUpdateChange.verify_GRAND_TOTAL_after_QTY_update_of_products_added_to_cart();
        Selenide.sleep(5000);
        validateUpdateShoppingCartButtonClickableAndUpdateChange.empty_your_cart_content();
    }

    @Feature("My Cart") // Test Case ID : MCART-19 FORM TESTING
    @Description("Validate EMPTY CART button is clickable and functioning")
    @Test
    public void Validate_EMPTY_CART_button_can_be_clicked_and_remove_all_products_from_the_cart() {
        MainCartFeature validateEmptyCartButtonClickableAndRemoveProducts = new MainCartFeature();
        open_Menu_Dropdown();
        validateEmptyCartButtonClickableAndRemoveProducts.add_products_to_the_cart_module();

        validateEmptyCartButtonClickableAndRemoveProducts.click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
        validateEmptyCartButtonClickableAndRemoveProducts.verify_EMPTY_CART_button_is_clickable_and_remove_products_from_cart();
        Selenide.sleep(5000);
        MadisonIslandLogo.click();
    }


    SelenideElement HomeAndDecorUpdateCategory = $(".level0.nav-2.parent");
    SelenideElement KitchenCategory = $(".level1.nav-2-5");
    SelenideElement KitchenaidVerticalMixerProductName = $("h2.product-name a[href*='kitchenaid-vertical-mixer.html']");
    SelenideElement QtyInputTextField = $(".input-text.qty");
    SelenideElement KitchenaidVerticalMixerAddToCartButton = $(".add-to-cart-buttons .button.btn-cart");
    SelenideElement AddToCartSuccessMsg = $(".success-msg");
    SelenideElement CartIconCartLabel = $("a.skip-link.skip-cart");
    SelenideElement ViewTheShoppingCartLink = $("a.cart-link");

    @Feature("My Cart") // Test Case ID : FMCART-1  FUNCTIONAL TESTING
    @Description("Validate add product to cart functionality")
    @Test
    public void Validate_add_to_cart_one_item_of_single_product() {
        // Test Case steps
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        AddToCartSuccessMsg.shouldBe(Condition.text("Kitchenaid vertical mixer was added to your shopping cart."));
        Selenide.sleep(5000);
        //Postcondition
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    SelenideElement RemoveProductGarbageCan = $(".a-center.product-cart-remove.last .btn-remove.btn-remove2");
    SelenideElement EmptyCartStatusMsg = $(".page-title");
    SelenideElement EmptyCartStatusIndicationMsg = $(".cart-empty");

    @Feature("My Cart") // Test Case ID : FMCART-2  FUNCTIONAL TESTING
    @Description("Validate remove product from cart functionality")
    @Test
    public void Validate_remove_the_product_from_the_cart_main_page() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        RemoveProductGarbageCan.click();
        EmptyCartStatusMsg.shouldBe(Condition.text("SHOPPING CART IS EMPTY"));
        EmptyCartStatusIndicationMsg.shouldBe(Condition.text("You have no items in your shopping cart."));
        Selenide.sleep(5000);
        // Postconditions
        MadisonIslandLogo.click();
    }


    SelenideElement KitchenaidVerticalMixerQtyInput = $(".product-cart-actions .input-text.qty");
    SelenideElement KitchenaidVerticalMixerUpdateButton = $(".button.btn-update");

    @Feature("My Cart") // Test Case ID : FMCART-3  FUNCTIONAL TESTING
    @Description("Validate remove product from cart by decreasing QTY to 0 value")
    @Test
    public void Validate_remove_product_from_cart_by_decreasing_QTY_to_zero_value_from_the_cart_main_page() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        KitchenaidVerticalMixerQtyInput.click();
        KitchenaidVerticalMixerQtyInput.clear();
        KitchenaidVerticalMixerQtyInput.sendKeys("0");
        KitchenaidVerticalMixerUpdateButton.click();
        EmptyCartStatusMsg.shouldBe(Condition.text("SHOPPING CART IS EMPTY"));
        EmptyCartStatusIndicationMsg.shouldBe(Condition.text("You have no items in your shopping cart."));
        Selenide.sleep(5000);
        // Postconditions
        MadisonIslandLogo.click();
    }


    SelenideElement OneItemGrandTotalPrice = $("td strong span");
    SelenideElement ThreeItemsGrandTotalPrice = $("td strong span");
    SelenideElement KitchenaidVerticalMixerProductNameLink = $(".product-cart-info a[href*='kitchenaid-vertical-mixer']");
    SelenideElement PDPageQtyInputTextField = $("input#qty.input-text.qty");
    SelenideElement PDPageAddToCartButton = $(".add-to-cart-buttons .button.btn-cart");
    SelenideElement ProductAddedToCartMsg = $("li.success-msg");

    @Feature("My Cart") // Test Case ID : FMCART-4 FUNCTIONAL TESTING
    @Description("Validate cart update QTY of product added to cart with valid numerical character")
    @Test
    public void Validate_cart_update_QTY_of_product_added_to_cart_from_the_product_detail_page_with_valid_numerical_character() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        OneItemGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        KitchenaidVerticalMixerProductNameLink.click();
        PDPageQtyInputTextField.click();
        PDPageQtyInputTextField.clear();
        PDPageQtyInputTextField.sendKeys("2");
        PDPageAddToCartButton.click();
        ProductAddedToCartMsg.shouldBe(Condition.text("Kitchenaid vertical mixer was added to your shopping cart."));
        ThreeItemsGrandTotalPrice.shouldBe(Condition.text("2.100,00 RON"));
        Selenide.sleep(5000);
        //Postconditions
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    @Feature("My Cart") // Test Case ID : FMCART-5 FUNCTIONAL TESTING
    @Description("Validate cart not update QTY of products added to cart with invalid negativ numerial character")
    @Test(priority = 1)
    public void Validate_cart_not_update_QTY_of_product_added_to_cart_from_the_product_detail_page_with_invalid_negativ_numerical_character() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        OneItemGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        KitchenaidVerticalMixerProductNameLink.click();
        PDPageQtyInputTextField.click();
        PDPageQtyInputTextField.clear();
        PDPageQtyInputTextField.sendKeys("-2");
        PDPageAddToCartButton.click();
        ProductAddedToCartMsg.shouldBe(Condition.text("Kitchenaid vertical mixer was NOT added to your shopping cart."));
        ThreeItemsGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        Selenide.sleep(5000);
        // Postconditions
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    @Feature("My Cart") // Test Case ID : FMCART-6 FUNCTIONAL TESTING
    @Description("Validate cart not update QTY of products added to cart with empty space")
    @Test(priority = 2)
    public void Validate_cart_not_update_QTY_of_product_added_to_cart_from_the_product_detail_page_with_empty_space() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        OneItemGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        KitchenaidVerticalMixerProductNameLink.click();
        PDPageQtyInputTextField.click();
        PDPageQtyInputTextField.clear();
        PDPageQtyInputTextField.sendKeys(" ");
        PDPageAddToCartButton.click();
        ProductAddedToCartMsg.shouldBe(Condition.text("Kitchenaid vertical mixer was NOT added to your shopping cart."));
        ThreeItemsGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        Selenide.sleep(5000);
        // Postconditions
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    @Feature("My Cart") // Test Case ID : FMCART-7 FUNCTIONAL TESTING
    @Description("Validate cart not update QTY of products added to cart with alphabetical character")
    @Test(priority = 3)
    public void Validate_cart_not_update_QTY_of_product_added_to_cart_from_the_product_detail_page_with_alphabetical_character() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        OneItemGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        KitchenaidVerticalMixerProductNameLink.click();
        PDPageQtyInputTextField.click();
        PDPageQtyInputTextField.clear();
        PDPageQtyInputTextField.sendKeys("V");
        PDPageAddToCartButton.click();
        ProductAddedToCartMsg.shouldBe(Condition.text("Kitchenaid vertical mixer was NOT added to your shopping cart."));
        ThreeItemsGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        Selenide.sleep(5000);
        // Postconditions
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    SelenideElement CartMainPageProductQtyInput = $(".product-cart-actions .input-text.qty");
    SelenideElement CartMainPageProductUpdateButton = $(".button.btn-update");
    SelenideElement UpdatedQtyGrandTotalPrice = $("td strong span");

    @Feature("My Cart") // Test Case ID : FMCART-8 FUNCTIONAL TESTING
    @Description("Validate cart update GRAND TOTAL value of products added to cart when the products QTY value is increased")
    @Test
    public void Validate_cart_update_GRAND_TOTAL_value_of_products_added_to_cart_when_the_products_QTY_value_is_increased_from_the_cart_main_page() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("1");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        OneItemGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        CartMainPageProductQtyInput.click();
        CartMainPageProductQtyInput.clear();
        CartMainPageProductQtyInput.sendKeys("2");
        CartMainPageProductUpdateButton.click();
        UpdatedQtyGrandTotalPrice.shouldBe(Condition.text("1.400,00 RON"));
        Selenide.sleep(5000);
        // Postconditions
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }


    @Feature("My Cart") // Test Case ID : FMCART-9 FUNCTIONAL TESTING
    @Description("Validate cart update GRAND TOTAL value of products added to cart when the products QTY value is decreased")
    @Test
    public void Validate_cart_update_GRAND_TOTAL_value_of_products_added_to_cart_when_the_products_QTY_value_is_decreased_from_the_cart_main_page() {
        // Preconditions
        HomeAndDecorUpdateCategory.hover();
        KitchenCategory.click();
        KitchenaidVerticalMixerProductName.click();
        QtyInputTextField.click();
        QtyInputTextField.clear();
        QtyInputTextField.sendKeys("2");
        KitchenaidVerticalMixerAddToCartButton.click();
        // Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        OneItemGrandTotalPrice.shouldBe(Condition.text("1.400,00 RON"));
        CartMainPageProductQtyInput.click();
        CartMainPageProductQtyInput.clear();
        CartMainPageProductQtyInput.sendKeys("1");
        CartMainPageProductUpdateButton.click();
        UpdatedQtyGrandTotalPrice.shouldBe(Condition.text("700,00 RON"));
        Selenide.sleep(5000);
        // Postconditions
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement cartPageTitle = $(".page-title.title-buttons h1");

    @Feature("My Cart") // Test Case ID : UIMC-1 UI testing
    @Description("Verify the main cart page title is present")
    @Test
    public void Verify_the_main_cart_page_title_is_present() {
        //Preconditions
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        //Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        cartPageTitle.shouldBe(Condition.visible);
        cartPageTitle.shouldBe(Condition.text("SHOPPING CART"));
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement PRODUCTlabel = $("th[rowspan='1'] .nobr");
    SelenideElement PRICElabel = $("th.a-center.cart-price-head");
    SelenideElement SUBTOTALlabel = $("th.a-center.cart-total-head");

    @Feature("My Cart") // Test Case ID : UIMC-2 UI testing
    @Description("Verify the added product to cart : PRODUCT , PRICE , SUBTOTAL labels are present ")
    @Test
    public void Verify_the_added_product_to_cart_PRODUCT_PRICE_SUBTOTAL_labels_are_present() {
        //Preconditions
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        //Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        PRODUCTlabel.shouldBe(Condition.visible);
        PRODUCTlabel.shouldBe(Condition.text("PRODUCT"));
        PRICElabel.shouldBe(Condition.visible);
        PRICElabel.shouldBe(Condition.text("PRICE"));
        SUBTOTALlabel.shouldBe(Condition.visible);
        SUBTOTALlabel.shouldBe(Condition.text("SUBTOTAL"));
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    @Feature("My Cart") // Test Case ID : UIMC-3 UI testing
    @Description("Verify the EMPTY CART button is present ")
    @Test
    public void Verify_the_EMPTY_CART_button_is_present() {
        //Preconditions
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        //Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        EmptyCartButton.shouldBe(Condition.visible);
        EmptyCartButton.shouldBe(Condition.text("EMPTY CART"));
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }



    SelenideElement ContinueShoppingButton = $("button.button2.btn-continue");

    @Feature("My Cart") // Test Case ID : UIMC-5 UI testing
    @Description("Verify the CONTINUE SHOPPING button is present")
    @Test
    public void Verify_the_CONTINUE_SHOPPING_button_is_present() {
        //Preconditions
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        //Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        ContinueShoppingButton.shouldBe(Condition.visible);
        ContinueShoppingButton.shouldBe(Condition.text("CONTINUE SHOPPING"));
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement GrandTotalLabel = $("td[colspan='1'] strong");
    SelenideElement PriceLable = $("td strong .price");

    @Feature("My Cart") // Test Case ID : UIMC-6 UI testing
    @Description("Verify GRAND TOTAL the PRICE and CURRENCY label is present")
    @Test
    public void Verify_GRAND_TOTAL_the_PRICE_and_CURRENCY_label_is_present() {
        //Preconditions
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        //Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        GrandTotalLabel.shouldBe(Condition.visible);
        GrandTotalLabel.shouldBe(Condition.text("GRAND TOTAL"));
        PriceLable.shouldBe(Condition.visible);
        PriceLable.shouldBe(Condition.text("37,00 RON"));
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }

    SelenideElement ProceedToCheckoutButton = $("button.button.btn-proceed-checkout.btn-checkout");

    @Feature("My Cart") // Test Case ID : UIMC-7 UI testing
    @Description("Verify PROCEED TO CHECKOUT buttons are present")
    @Test
    public void Verify_PROCEED_TO_CHECKOUT_buttons_are_present() {
        //Preconditions
        cartileCategory.click();
        deLaIdeeLaBaniProductName.click();
        deLaIdeeLaBaniQtyInputTextField.click();
        deLaIdeeLaBaniQtyInputTextField.clear();
        deLaIdeeLaBaniQtyInputTextField.sendKeys("1");
        deLaIdeeLaBaniAddToCartButton.click();
        //Test Case steps
        CartIconCartLabel.click();
        ViewTheShoppingCartLink.click();
        ProceedToCheckoutButton.shouldBe(Condition.visible);
        ProceedToCheckoutButton.shouldBe(Condition.text("PROCEED TO CHECKOUT"));
        Selenide.sleep(5000);
        //Postcondition
        EmptyCartButton.click();
        MadisonIslandLogo.click();
    }
    
}
