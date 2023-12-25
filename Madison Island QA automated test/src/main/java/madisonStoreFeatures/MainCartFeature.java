package madisonStoreFeatures;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.confirm;

public final class MainCartFeature extends GeneralMethods{
    public SelenideElement cartIconAndLabel = $("a.skip-link.skip-cart");
    private SelenideElement clickMyCartLink = $("a.top-link-cart");
    SelenideElement viewShoppingCartLink = $("a.cart-link");
    private SelenideElement clickHereLabelContinueShopping = $(".cart-empty a");
    private SelenideElement cartileCategory = $(".level0 a[href*='carti']");
    private SelenideElement deLaIdeeLaBani = $(".product-info a[href*='de-la-idee-la-bani']");
    private SelenideElement deLaIdeeLaBaniAddToCart = $(".add-to-cart-buttons .button.button.btn-cart");
    private SelenideElement ciceroneGuide = $(".product-info a[href*='cice-2020']");
    private SelenideElement ciceroneGuideAddToCart = $(".add-to-cart-buttons .button.button.btn-cart");
    SelenideElement cartPageTitleLabel = $(".page-title h1");
    private SelenideElement discountCodeInputField = $(".field-wrapper input");
    private SelenideElement discountApplyLink = $(".button-wrapper span");
    private SelenideElement couponCodeValidationMessage = $(".error-msg li");
    private SelenideElement adviceMessageRequiredCode = $("#advice-required-entry-coupon_code");
    private SelenideElement countryDropdown = $("#country");
    private SelenideElement selectCountry = $("option[value='RO']");
    private SelenideElement stateProvinceDropdown = $("#region_id");
    private SelenideElement selectStateProvince = $("option[value='291']");
    private SelenideElement cityInputField = $("#city");
    private SelenideElement ZIPinputField = $("#postcode");
    private SelenideElement ESTIMATElink = $(".buttons-set .button2");
    private SelenideElement flatRateRadioButton = $("#s_method_flatrate_flatrate");
    private SelenideElement UpdateTotalButton = $(".buttons-set .button");
    private SelenideElement grandTotalPrice = $("td strong span");
    private SelenideElement DeLaIdeeLaBaniQtyInputBox = $(".first.odd .input-text.qty");
    private SelenideElement CiceroneGuideQtyInputBox = $(".last.even .product-cart-actions .input-text.qty");
    private SelenideElement DeLaIdeeLaBaniQtyUpdateButton = $(".first.odd .button.btn-update");
    private SelenideElement CiceroneGuideQtyUpdateButton = $(".last.even .button.btn-update");
    private SelenideElement adviceMessageVerification = $("#advice-required-entry-coupon_code");
    private SelenideElement emptyTheCartButton = $("#empty_cart_button");
    private SelenideElement madisonIslandLogoImage = $(".large");
    SelenideElement stateProvinceAdviceMessage = $("#advice-required-entry-region_id");
    SelenideElement zipAdviceMessage = $("#advice-required-entry-postcode");
    private SelenideElement deLaIdeeLaBaniProductNameLink = $(".product-cart-info a[href$='/de-la-idee-la-bani.html']");
    private SelenideElement deLaIdeeLaBaniProductTitle = $(".h1");
    private SelenideElement deLaIdeeLaBaniProductPrice = $(".regular-price .price");
    private SelenideElement deLaIdeeLaBaniProductImage = $("#image-main");
    private SelenideElement emptyCartMainMessage = $(".col-main .page-title");
    private SelenideElement emptyCartSecondaryMessage = $(".cart-empty");
    private SelenideElement DeLaIdeeLaBaniQtyUpdate = $(".button.btn-update");










    private SelenideElement KitchenaidVerticalMixerUpdateButton = $(".button.btn-update");


    /**
     * Actions
     */

    // ACTIONS FOR Test Case ID : MCART-1
    // Validate_VIEW_SHOPPING_CART_link_can_be_clicked_and_redirect_to_SHOPPING_CART_page
    public void add_products_to_the_cart_module() {
        clickMyCartLink.click();
        clickHereLabelContinueShopping.click();
        cartileCategory.click();
        deLaIdeeLaBani.click();
        deLaIdeeLaBaniAddToCart.click();
        cartileCategory.click();
        ciceroneGuide.click();
        ciceroneGuideAddToCart.click();
    }

    public void click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page() {
        cartIconAndLabel.click();
        viewShoppingCartLink.click();
        cartPageTitleLabel.shouldBe(Condition.text("SHOPPING CART"));
    }

    public void empty_your_cart_content() {
        emptyTheCartButton.click();
        madisonIslandLogoImage.click();
    }


    // ACTIONS FOR Test Case ID : MCART-2
    // Input_special_numerical_alphabetical_characters_verify_are_accepted_and_advice_message_appear
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void input_special_numerical_alphabetical_characters_verify_are_accepted(String input) {
        discountCodeInputField.click();
        discountCodeInputField.sendKeys(input);
        discountApplyLink.click();
        couponCodeValidationMessage.shouldBe(Condition.text("Coupon code \"*1k\" is not valid."));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-3
    // Input_invalid_discount_code_verify_error_message_appear
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void input_invalid_discount_code_verify_error_message_appear(String input) {
        discountCodeInputField.click();
        discountCodeInputField.sendKeys(input);
        discountApplyLink.click();
        couponCodeValidationMessage.shouldBe(Condition.text("Coupon code \"discountCODE\" is not valid."));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-4
    // Validate APPLY button is clickable and functioning by leaving DISCOUNT CODES input text field empty,
    // click APPLY button and verify DISCOUNT CODES input text field borders and advice message color.
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void click_APPLY_link_verify_advice_message_appear_for_empty_discount_codes_input_text_field() {
        discountApplyLink.click();
        adviceMessageRequiredCode.shouldBe(Condition.visible);
        adviceMessageRequiredCode.shouldBe(Condition.text("This is a required field."));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-5
    // Validate_country_option_at_COUNTRY_dropdown_can_be_selected
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void select_country_option_from_COUNTRY_dropdown() {
        countryDropdown.click();
        selectCountry.scrollTo().click();
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-6
    // Validate_STATE_PROVINCE_option_at_STATE_PROVINCE_dropdown_can_be_selected
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    // select_country_option_from_COUNTRY_dropdown();
    public void select_state_province_option_from_STATE_PROVINCE_dropdown() {
        stateProvinceDropdown.click();
        selectStateProvince.scrollTo().click();
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-7
    // Validate_at_City_input_text_field_option_can_be_typed_in
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void type_in_city_input_text_field_option(String input) {
        cityInputField.click();
        cityInputField.sendKeys(input);
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-8
    // Validate_at_ZIP_input_text_field_option_can_be_typed_in
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void type_in_ZIP_input_text_field_option(String input) {
        ZIPinputField.click();
        ZIPinputField.sendKeys(input);
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-9
    // Validate_ESTIMEATE_button_can_be_clicked_verify_advice_message_visibility_and_color_under_required_fields
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void click_ESTIMATE_link() {
        ESTIMATElink.click();
    }

    public void no_option_STATE_PROVINCE_dropdown_and_empty_ZIP_textbox_advice_message_appear() {
        stateProvinceAdviceMessage.shouldBe(Condition.visible);
        stateProvinceAdviceMessage.shouldBe(Condition.text("This is a required field."));
        zipAdviceMessage.shouldBe(Condition.visible);
        zipAdviceMessage.shouldBe(Condition.text("This is a required field."));
    }


    // ACTIONS FOR Test Case ID : MCART-10
    // Validate_FLAT_RATE_fixed_option_radio_button_can_be_checked
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    // select_country_option_from_COUNTRY_dropdown();
    // select_state_province_option_from_STATE_PROVINCE_dropdown();
    // type_in_city_input_text_field_option(String input);
    // type_in_ZIP_input_text_field_option(String input);
    // click_ESTIMATE_link();
    public void check_RADIO_BUTTON() {
        flatRateRadioButton.click();
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-11
    // Validate_FLAT_RATE_fixed_option_radio_button_can_be_unchecked
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    // select_country_option_from_COUNTRY_dropdown();
    // select_state_province_option_from_STATE_PROVINCE_dropdown();
    // type_in_city_input_text_field_option(String input);
    // type_in_ZIP_input_text_field_option(String input);
    // click_ESTIMATE_link();
    // check_RADIO_BUTTON();
    // check_RADIO_BUTTON();
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-12
    // Validate_UPDATE_TOTAL_button_can_be_clicked_and_save_changes
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    // select_country_option_from_COUNTRY_dropdown();
    // select_state_province_option_from_STATE_PROVINCE_dropdown();
    // type_in_city_input_text_field_option(String input);
    // type_in_ZIP_input_text_field_option(String input);
    // click_ESTIMATE_link();
    public void verify_price_before_update() {
        grandTotalPrice.shouldBe(Condition.text("136,00 RON"));
    }

    // check_RADIO_BUTTON();
    public void click_UPDATE_TOTAL() {
        UpdateTotalButton.click();
    }

    public void verify_price_after_update() {
        grandTotalPrice.shouldBe(Condition.text("146,00 RON"));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-13
    // Validate_Qty_input_text_field_accept_alphabetical_characters
    public void add_DeLaIdeeLaBani_product_to_the_cart_module() {
        clickMyCartLink.click();
        clickHereLabelContinueShopping.click();
        cartileCategory.click();
        deLaIdeeLaBani.click();
        deLaIdeeLaBaniAddToCart.click();
    }

    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void set_DeLaIdeeLaBani_product_qty_and_update(String input) {
        DeLaIdeeLaBaniQtyInputBox.click();
        DeLaIdeeLaBaniQtyInputBox.clear();
        DeLaIdeeLaBaniQtyInputBox.sendKeys(input);
        DeLaIdeeLaBaniQtyUpdate.click();
    }

    public void verify_qty_not_accept_alphabetical_characters_advice_message() {
        Selenide.switchTo().alert();
        confirm("Please match the requested format. Qty");
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-14
    // Validate_Qty_input_text_field_accept_numerical_characters
    // add_DeLaIdeeLaBani_product_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void verify_GRAND_TOTAL_before_QTY_update() {
        grandTotalPrice.shouldBe(Condition.text("37,00 RON"));
    }

    // set_DeLaIdeeLaBani_product_qty_and_update(String input);
    public void verify_GRAND_TOTAL_after_QTY_update() {
        grandTotalPrice.shouldBe(Condition.text("148,00 RON"));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-15
    // Validate_an_added_product_to_cart_products_name_link_is_clickable_and_redirect_to_product_page
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void click_De_La_Idee_La_Bani_product_name_Link() {
        deLaIdeeLaBaniProductNameLink.click();
    }

    public void verify_product_page_open() {
        deLaIdeeLaBaniProductTitle.shouldBe(Condition.text("DE LA IDEE LA BANI"));
        deLaIdeeLaBaniProductPrice.shouldBe(Condition.text("37,00 RON"));
        deLaIdeeLaBaniProductImage.shouldBe(Condition.visible);
        cartIconAndLabel.click();
        viewShoppingCartLink.click();
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-16
    // Validate_UPDATE_button_of_a_product_added_to_cart_is_visible_clickable_and_update_change_made_to_the_product
    // add_DeLaIdeeLaBani_product_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    // verify_GRAND_TOTAL_before_QTY_update();
    public void set_DeLaIdeeLaBani_product_qty(String input) {
        DeLaIdeeLaBaniQtyInputBox.click();
        DeLaIdeeLaBaniQtyInputBox.clear();
        DeLaIdeeLaBaniQtyInputBox.sendKeys(input);
    }

    public void verify_DeLaIdeeLaBani_product_update_button_is_visible_and_clickable() {
        DeLaIdeeLaBaniQtyUpdate.shouldBe(Condition.visible);
        DeLaIdeeLaBaniQtyUpdate.click();
    }

    public void verify_GRAND_TOTAL_after_product_UPDATE_button_save_change() {
        grandTotalPrice.shouldBe(Condition.text("148,00 RON"));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-17
    // Validate_UPDATE_SHOPPING_CART_button_is_clickable_and_update_the_change_made_to_the_products
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void verify_GRAND_TOTAL_before_QTY_update_of_products_added_to_cart() {
        grandTotalPrice.shouldBe(Condition.text("136,00 RON"));
    }

    public void set_CiceroneGuide_product_qty(String input) {
        CiceroneGuideQtyInputBox.click();
        CiceroneGuideQtyInputBox.clear();
        CiceroneGuideQtyInputBox.sendKeys(input);
    }

    public void verify_CiceroneGuide_product_update_button_is_visible_and_clickable() {
        CiceroneGuideQtyUpdateButton.shouldBe(Condition.visible);
        CiceroneGuideQtyUpdateButton.click();
    }

    public void verify_GRAND_TOTAL_after_QTY_update_of_products_added_to_cart() {
        grandTotalPrice.shouldBe(Condition.text("631,00 RON"));
    }
    // empty_your_cart_content();


    // ACTIONS FOR Test Case ID : MCART-19
    // Validate_EMPTY_CART_button_can_be_clicked_and_remove_all_products_from_the_cart
    // add_products_to_the_cart_module();
    // click_VIEW_SHOPPING_CART_link_verify_redirect_to_shopping_cart_page();
    public void verify_EMPTY_CART_button_is_clickable_and_remove_products_from_cart() {
        emptyTheCartButton.click();
        emptyCartMainMessage.shouldBe(Condition.text("SHOPPING CART IS EMPTY"));
        emptyCartSecondaryMessage.shouldBe(Condition.text("You have no items in your shopping cart."));
    }
}

