package madisonStoreFeatures;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public final class LoginFeature extends GeneralMethods{

    private SelenideElement inputEmail = $("div.input-box #email");
    private SelenideElement inputPassword = $("div.input-box #pass");
    private SelenideElement loginButton = $("div.buttons-set #send2");
    private SelenideElement loginQuestion = $("div.content.fieldset h2");
    private SelenideElement loginNotification = $("div.content.fieldset p.form-instructions");
    private SelenideElement welcomeMessage = $(".store-language-container+.welcome-msg");
    private SelenideElement logoutButton = $("a[title='Log Out']");
    private SelenideElement invalidCredentialMessage = $("ul li span");
    private SelenideElement passwordAdviceMessage = $(".input-box .validation-advice");
    private SelenideElement emailAdviceMessage = $("div#advice-required-entry-email");
    private SelenideElement emailValidationAdvice = $("#advice-validate-email-email");
    private SelenideElement passwordValidationAdvice = $("#advice-validate-password-pass");
    private SelenideElement emptyEmailAdvice = $("#advice-required-entry-email");
    private SelenideElement emptyPasswordAdvice = $("#advice-required-entry-pass");
    private SelenideElement forgotPasswordLink = $(".f-left");
    private SelenideElement forgotPasswordPageLabel = $(".page-title h1");


    String a = "#df2";
    public void entering_invalid_email_format_click_login_button_verify_advice_message_appear(String input){
        inputEmail.click();
        inputEmail.sendKeys(input);
        loginButton.click();
        emailValidationAdvice.shouldBe(Condition.text("Please enter a valid email address. For example johndoe@domain.com."));
        emailValidationAdvice.getCssValue("color");
        if (emailValidationAdvice.getCssValue("color").equals(a)){
            System.out.println("Color is blue");
        }
    }



    public void leave_email_field_empty_click_login_button_verify_advice_message_appear(){
        loginButton.click();
        emptyEmailAdvice.shouldBe(Condition.text("This is a required field."));
    }

    public void entering_invalid_password_format_click_login_button_verify_advice_message_appear(String input){
        inputPassword.click();
        inputPassword.sendKeys(input);
        loginButton.click();
        passwordValidationAdvice.shouldBe(Condition.text("Please enter 6 or more characters without leading or trailing spaces."));
    }

    public void leave_password_field_empty_click_login_button_verify_advice_message_appear(){
        loginButton.click();
        emptyPasswordAdvice.shouldBe(Condition.text("This is a required field."));
    }
    public void click_forgot_password_link_verify_forgot_your_password_page_appear(){
        forgotPasswordLink.click();
        forgotPasswordPageLabel.shouldBe(Condition.text("FORGOT YOUR PASSWORD?"));
    }

    public void click_login_button_verify_required_field_advice_messages_appear(){
        loginButton.click();
        emptyEmailAdvice.shouldBe(Condition.text("This is a required field."));
        emptyPasswordAdvice.shouldBe(Condition.text("This is a required field."));
    }


    public void input_email(String input) {
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys(input);
    }

    public void input_password(String input) {
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(input);
    }

    public void click_login_button() {
        loginButton.click();
    }

    public void click_logout() {
        logoutButton.click();
    }

    /**
     * Verifiers
     */
    public void verify_email() {
        inputEmail.shouldBe(Condition.visible);
    }

    public void verify_password() {
        inputPassword.shouldBe(Condition.visible);
    }

    public void verify_is_login_button_enabled() {
        loginButton.shouldBe(Condition.enabled);
    }

    public void verify_account_question_message() {
        loginQuestion.shouldBe(Condition.visible);
        loginQuestion.shouldHave(Condition.exactText("ALREADY REGISTERED?"));
    }

    public void verify_account_notification_message() {
        loginNotification.shouldBe(Condition.visible);
        loginNotification.shouldHave(Condition.exactText("If you have an account with us, please log in."));
    }

    public void verify_login_welcome_message() {
        welcomeMessage.shouldBe(Condition.visible);
        welcomeMessage.shouldHave(Condition.exactText("WELCOME, SIMO TAMAS!"));
    }

    public void verify_invalid_credentials_message() {
        invalidCredentialMessage.shouldBe(Condition.visible);
        invalidCredentialMessage.shouldHave(Condition.exactText("Invalid login or password."));
    }

    public void verify_password_guidance_message() {
        passwordAdviceMessage.shouldBe(Condition.visible);
        passwordAdviceMessage.
                shouldHave(Condition.text("Please enter 6 or more characters "));
    }

    public void verify_email_advice_message() {
        emailAdviceMessage.shouldBe(Condition.visible);
        emailAdviceMessage.shouldHave(Condition.exactText("This is a required field."));
    }

    public void verify_password_advice_message() {
        passwordAdviceMessage.shouldBe(Condition.visible);
        passwordAdviceMessage.shouldHave(Condition.exactText("This is a required field."));
    }


}
