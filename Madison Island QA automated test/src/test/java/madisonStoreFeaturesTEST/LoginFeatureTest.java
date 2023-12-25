package madisonStoreFeaturesTEST;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import madisonStoreFeatures.GeneralMethods;
import madisonStoreFeatures.LoginFeature;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

@Epic("Login tests")
public class LoginFeatureTest extends GeneralMethods {


    @Feature("Login") // Test Case ID : LOGF-1 FORM TESTING
    @Description("Validate Email Address input text field entering invalid email format")
    @Test
    public void Validate_Email_Address_field_with_invalid_email_format() {
        LoginFeature invalidEmailFormat = new LoginFeature();
        open_Login_Form();
        invalidEmailFormat.entering_invalid_email_format_click_login_button_verify_advice_message_appear("my@email");
    }


    @Feature("Login") // Test Case ID : LOGF-2 FORM TESTING
    @Description("Validate Email Address input text field leaving field empty")
    @Test
    public void Validate_Email_Address_field_leaving_field_empty() {
        LoginFeature emptyEmailField = new LoginFeature();
        open_Login_Form();
        emptyEmailField.leave_email_field_empty_click_login_button_verify_advice_message_appear();
    }


    @Feature("Login") // Test Case ID : LOGF-3 FORM TESTING
    @Description("Validate Password input text field entering invalid password format")
    @Test
    public void Validate_Password_field_with_invalid_password_format() {
        LoginFeature invalidPasswordFormat = new LoginFeature();
        open_Login_Form();
        invalidPasswordFormat.entering_invalid_password_format_click_login_button_verify_advice_message_appear("pass");
    }


    @Feature("Login") // Test Case ID : LOGF-4 FORM TESTING
    @Description("Validate Password input text field leaving field empty")
    @Test
    public void Validate_Password_field_leaving_field_empty() {
        LoginFeature emptyPasswordField = new LoginFeature();
        open_Login_Form();
        emptyPasswordField.leave_password_field_empty_click_login_button_verify_advice_message_appear();
    }


    @Feature("Login") // Test Case ID : LOGF-5 FORM TESTING
    @Description("Validate Forgot Your Password ? Link can be clicked and functioning")
    @Test
    public void Validate_Forgot_Your_Password_link_is_clickable_and_functioning() {
        LoginFeature clickForgotPasswordLink = new LoginFeature();
        open_Login_Form();
        clickForgotPasswordLink.click_forgot_password_link_verify_forgot_your_password_page_appear();
    }


    @Feature("Login") // Test Case ID : LOGF-6 FORM TESTING
    @Description("Validate LOGIN button can be clicked and functioning")
    @Test
    public void Validate_LOGIN_button_is_clickable_and_functioning() {
        LoginFeature clickLoginButton = new LoginFeature();
        open_Login_Form();
        clickLoginButton.click_login_button_verify_required_field_advice_messages_appear();
    }


    SelenideElement EmailInputTextField = $("div.input-box #email");
    SelenideElement PasswordInputTextField = $("div.input-box #pass");
    SelenideElement LoginButton = $("div.buttons-set #send2");
    SelenideElement UserLoginWelcomeMsg = $("p.welcome-msg");
    SelenideElement LabelACCOUNT = $(".skip-link.skip-account .label");
    SelenideElement LinkLogOut = $("a[title='Log Out']");
    SelenideElement LogoMadisonIsland = $(".large");

    @Feature("Login") // Test Case ID : FLOG-1  Functional Testing
    @Description("User can login with valid credentials")
    @Test
    public void User_type_in_Email_Address_and_Password_field_valid_credetials_and_login() {
        LoginFeature loginWithValidCredentials = new LoginFeature();
        loginWithValidCredentials.open_Login_Form();
        EmailInputTextField.click();
        EmailInputTextField.clear();
        EmailInputTextField.sendKeys("simo_tamas2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("realmadrid");
        LoginButton.click();
        UserLoginWelcomeMsg.shouldBe(Condition.text("WELCOME, SIMO TAMAS!"));
        Selenide.sleep(5000);
        LabelACCOUNT.click();
        LinkLogOut.click();
        LogoMadisonIsland.click();
    }


    SelenideElement InvalidEmailValidPasswordLoginErrorMsg = $("li.error-msg");

    @Feature("Login") // Test Case ID : FLOG-2  Functional Testing
    @Description("User can not login with invalid Email Address and valid Password")
    @Test
    public void User_can_not_login_with_invalid_Email_Address_and_valid_Password() {
        LoginFeature notLoginInvalidEmailValidPassword = new LoginFeature();
        notLoginInvalidEmailValidPassword.open_Login_Form();
        EmailInputTextField.click();
        EmailInputTextField.clear();
        EmailInputTextField.sendKeys("simo_2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("realmadrid");
        LoginButton.click();
        InvalidEmailValidPasswordLoginErrorMsg.shouldBe(Condition.text("Invalid login or password."));
        Selenide.sleep(5000);
        LogoMadisonIsland.click();
    }


    SelenideElement ValidEmailInvalidPasswordLoginErrorMsg = $("li.error-msg");

    @Feature("Login") // Test Case ID : FLOG-3  Functional Testing
    @Description("User can not login with valid Email Address and invalid Password")
    @Test
    public void User_can_not_login_with_valid_Email_Address_and_invalid_Password() {
        LoginFeature notLoginValidEmailInvalidPassword = new LoginFeature();
        notLoginValidEmailInvalidPassword.open_Login_Form();
        EmailInputTextField.click();
        EmailInputTextField.clear();
        EmailInputTextField.sendKeys("simo_tamas2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("password");
        LoginButton.click();
        ValidEmailInvalidPasswordLoginErrorMsg.shouldBe(Condition.text("Invalid login or password."));
        Selenide.sleep(5000);
        LogoMadisonIsland.click();
    }


    SelenideElement EmptyEmailAdviceMsg = $("#advice-required-entry-email");
    SelenideElement EmptyPasswordAdviceMsg = $("#advice-required-entry-pass");

    @Feature("Login") // Test Case ID : FLOG-4  Functional Testing
    @Description("User can not login with empty Email Addresss and empty Password")
    @Test
    public void User_can_not_leave_empty_space_for_Email_Address_field_and_for_Password_field_and_login() {
        LoginFeature notLoginWithEmptyEmailAndPassword = new LoginFeature();
        notLoginWithEmptyEmailAndPassword.open_Login_Form();
        EmailInputTextField.click();
        EmailInputTextField.clear();
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        LoginButton.click();
        EmptyEmailAdviceMsg.shouldBe(Condition.text("This is a required field."));
        EmptyPasswordAdviceMsg.shouldBe(Condition.text("This is a required field."));
        Selenide.sleep(5000);
        LogoMadisonIsland.click();
    }

    SelenideElement LoginPageTitle = $(".page-title h1");

    @Feature("Login") // Test Case ID : UILOG-1 UI testing
    @Description("Verify Login page main title is present ")
    @Test
    public void Verify_Login_page_main_title_is_present() {
        LoginFeature verifyLoginPageMainTitle = new LoginFeature();
        //Precondition
        verifyLoginPageMainTitle.open_Login_Form();
        //Test Case steps
        LoginPageTitle.shouldBe(Condition.visible);
        LoginPageTitle.shouldBe(Condition.text("LOGIN OR CREATE AN ACCOUNT"));
        //Postcondition
        LogoMadisonIsland.click();
    }

    SelenideElement EmailAddressLabel = $("label[for='email']");

    @Feature("Login") // Test Case ID : UILOG-2 UI testing
    @Description("Verify Login page Email Address label is present ")
    @Test
    public void Verify_Login_page_Email_Address_label_is_present() {
        LoginFeature verifyEmailAddressLabel = new LoginFeature();
        //Precondition
        verifyEmailAddressLabel.open_Login_Form();
        //Test Case steps
        EmailAddressLabel.shouldBe(Condition.visible);
        EmailAddressLabel.shouldBe(Condition.text("Email Address"));
        //Postcondition
        LogoMadisonIsland.click();
    }

    SelenideElement EmailAddressTextBox = $(".input-box #email");

    @Feature("Login") // Test Case ID : UILOG-3 UI testing
    @Description("Verify Login page Email Address input text box is present ")
    @Test
    public void Verify_Login_page_Email_Address_input_text_box_is_present() {
        LoginFeature verifyEmailAddressInputTextBox = new LoginFeature();
        //Precondition
        verifyEmailAddressInputTextBox.open_Login_Form();
        //Test Case steps
        EmailAddressTextBox.shouldBe(Condition.visible);
        //Postcondition
        LogoMadisonIsland.click();
    }

    SelenideElement PasswordLabel = $("label[for='pass']");

    @Feature("Login") // Test Case ID : UILOG-4 UI testing
    @Description("Verify Login page Password label is present ")
    @Test
    public void Verify_Login_page_Password_label_is_present() {
        LoginFeature verifyPasswordLabel = new LoginFeature();
        //Precondition
        verifyPasswordLabel.open_Login_Form();
        //Test Case steps
        PasswordLabel.shouldBe(Condition.visible);
        PasswordLabel.shouldBe(Condition.text("Password"));
        //Postcondition
        LogoMadisonIsland.click();
    }

    SelenideElement PasswordTextBox = $(".input-box #pass");

    @Feature("Login") // Test Case ID : UILOG-5 UI testing
    @Description("Verify Login page Password input text box is present  ")
    @Test
    public void Verify_Login_page_Password_input_text_box_is_present() {
        LoginFeature verifyPasswordInputTextBox = new LoginFeature();
        //Precondition
        verifyPasswordInputTextBox.open_Login_Form();
        //Test Case steps
        PasswordTextBox.shouldBe(Condition.visible);
        //Postcondition
        LogoMadisonIsland.click();
    }

    SelenideElement LoginButtonPresent = $("#send2");

    @Feature("Login") // Test Case ID : UILOG-6 UI testing
    @Description("Verify LOGIN button is present  ")
    @Test
    public void Verify_LOGIN_button_is_present() {
        LoginFeature verifyLoginButton = new LoginFeature();
        //Precondition
        verifyLoginButton.open_Login_Form();
        //Test Case steps
        LoginButtonPresent.shouldBe(Condition.visible);
        LoginButtonPresent.shouldBe(Condition.text("LOGIN"));
        //Postcondition
        LogoMadisonIsland.click();
    }

    SelenideElement ForgotYourPasswordLink = $(".f-left");

    @Feature("Login") // Test Case ID : UILOG-7 UI testing
    @Description("Verify Login page \"Forgot your password?\" link is present")
    @Test
    public void Verify_Login_page_Forgot_your_password_link_is_present(){
        LoginFeature verifyForgotPasswordLink = new LoginFeature();
        //Precondition
        verifyForgotPasswordLink.open_Login_Form();
        //Test Case steps
        ForgotYourPasswordLink.shouldBe(Condition.visible);
        ForgotYourPasswordLink.shouldBe(Condition.text("Forgot Your Password?"));
        //Postcondition
        LogoMadisonIsland.click();
    }
}


