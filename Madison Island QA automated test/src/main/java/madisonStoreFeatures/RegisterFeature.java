package madisonStoreFeatures;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class RegisterFeature extends GeneralMethods{
    private SelenideElement registerNotification = $("div.fieldset p.form-instructions");
    private SelenideElement inputFirstName = $("div.input-box input#firstname");
    private SelenideElement inputMiddleName = $("#middlename");
    private SelenideElement inputLastName = $("div.input-box input#lastname");
    private SelenideElement inputEmail = $("div.input-box input#email_address");
    private SelenideElement inputPassword = $("#password");
    private SelenideElement inputConfirmPassword = $("#confirmation");
    private SelenideElement newsletterCheckbox = $("#is_subscribed");
    private SelenideElement BackLink = $(".back-link a");
    private SelenideElement MainPageTitle = $(".main-container .page-title");
    private SelenideElement notificationMessage = $("li span");
    private SelenideElement RegisterButton = $(".buttons-set .button");
    private SelenideElement CreateAnAccountButton = $(".col-1 .button");
    private SelenideElement CreateAnAccountPageTitle = $(".page-title h1");
    private SelenideElement RequiredFieldAdviceMessage = $(".field #advice-required-entry-firstname");
    private SelenideElement InvalidEmailFormMessage = $("#advice-validate-email-email_address");
    private SelenideElement InvalidPasswordFormMessage = $("#advice-validate-password-password");
    private SelenideElement PasswordMatchingAdviceMessage = $("#advice-validate-cpassword-confirmation");
    /**
     * Actions
     */
    public void click_register_button_verify_required_field_advice_message_appear(){ // 1 test case
        RegisterButton.click();
        RequiredFieldAdviceMessage.shouldHave(Condition.text("This is a required field."));
    }

    public void input_numerical_and_special_characters_as_FirstName_and_click_register(String input){ // 2 test case
        inputFirstName.sendKeys(input);
        RegisterButton.click();
    }

    public void input_alphabetical_characters_as_FirstName_and_click_register(String input){ // 3 test case
        inputFirstName.sendKeys(input);
        RegisterButton.click();
    }

    public void input_numerical_and_special_characters_as_MiddleName_and_click_register(String input){ // 4 test case
        inputMiddleName.sendKeys(input);
        RegisterButton.click();
    }

    public void input_numerical_and_special_characters_as_LastName_and_click_register(String input){ // 5 test case
        inputLastName.sendKeys(input);
        RegisterButton.click();
    }

    public void input_alphabetical_characters_as_LastName_and_click_register(String input){ // 6 test case
        inputLastName.sendKeys(input);
        RegisterButton.click();
    }

    public void input_invalid_email_form_and_click_register_verify_advice_message(String input){ // 7 test case
        inputEmail.sendKeys(input);
        RegisterButton.click();
        InvalidEmailFormMessage.shouldBe(Condition.text("Please enter a valid email address. For example johndoe@domain.com."));
    }

    public void input_invalid_password_format_click_register_verify_advice_message(String input){ // 8 test case
        inputPassword.sendKeys(input);
        RegisterButton.click();
        InvalidPasswordFormMessage.shouldBe(Condition.text("Please enter 6 or more characters without leading or trailing spaces."));
    }

    // 9 test case
    public void input_confirm_password_content_not_match_with_password_content_click_register_verify_advice_message(String input){
        inputConfirmPassword.sendKeys(input);
        RegisterButton.click();
        PasswordMatchingAdviceMessage.shouldBe(Condition.text("Please make sure your passwords match."));
    }
    public void input_Password(String input){
        inputPassword.sendKeys(input);
    }

    public void check_newsletter_checkbox(){  // 10 test case
        newsletterCheckbox.click();
    }

    public void click_register_button_validate_is_functioning(){ // 11 test case
        RegisterButton.click();
        RequiredFieldAdviceMessage.shouldBe(Condition.text("This is a required field."));
    }

    public void click_CREATE_AN_ACCOUNT_button_validate_is_functioning(){ // 12 test case
        CreateAnAccountButton.click();
        CreateAnAccountPageTitle.shouldBe(Condition.text("CREATE AN ACCOUNT"));
    }

    public void click_Back_link_validate_is_functioning(){  // 13 test case
        BackLink.click();
        MainPageTitle.shouldBe(Condition.text("LOGIN OR CREATE AN ACCOUNT"));
    }
}
