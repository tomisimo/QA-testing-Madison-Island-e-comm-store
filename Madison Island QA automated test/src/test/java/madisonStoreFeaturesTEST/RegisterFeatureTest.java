package madisonStoreFeaturesTEST;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import madisonStoreFeatures.GeneralMethods;
import madisonStoreFeatures.RegisterFeature;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

@Epic("Register tests")
public class RegisterFeatureTest extends GeneralMethods {

    @Feature("Register") // Test Case ID : RFORM-1 FORM TESTING
    @Description("Validate required field advice message appear when not entering data in the required input text fields")
    @Test
    public void When_required_field_is_left_empty_required_field_advice_message_appear() {
        RegisterFeature requiredFieldMessage = new RegisterFeature();
        open_Register_Form();
        requiredFieldMessage.click_register_button_verify_required_field_advice_message_appear();
    }


    @Feature("Register") // Test Case ID : RFORM-2 FORM TESTING
    @Description("Validate First Name input text field accept entering numerical and special characters")
    @Test
    public void Validate_First_Name_input_text_field_accept_numerical_and_special_characters() {
        RegisterFeature numericalSpecialCharAcceptedFirstName = new RegisterFeature();
        open_Register_Form();
        numericalSpecialCharAcceptedFirstName.input_numerical_and_special_characters_as_FirstName_and_click_register("123+-*/");
    }


    @Feature("Register") // Test Case ID : RFORM-3 FORM TESTING
    @Description("Validate First Name input text field accept entering alphabetical characters")
    @Test
    public void Validate_First_Name_input_text_field_accept_alphabetical_characters() {
        RegisterFeature alphabeticalCharAcceptedFirstName = new RegisterFeature();
        open_Register_Form();
        alphabeticalCharAcceptedFirstName.input_alphabetical_characters_as_FirstName_and_click_register("Fred");
    }


    @Feature("Register") // Test Case ID : RFORM-4 FORM TESTING
    @Description("Validate Middle Name/Initial input text field accept numerical and special characters")
    @Test
    public void Validate_Middle_Name_Initial_input_text_field_accept_numeriacl_and_special_characters() {
        RegisterFeature numericalSpecialCharAcceptedMiddleName = new RegisterFeature();
        open_Register_Form();
        numericalSpecialCharAcceptedMiddleName.input_numerical_and_special_characters_as_MiddleName_and_click_register("123+-*/");
    }


    @Feature("Register") // Test Case ID : RFORM-5 FORM TESTING
    @Description("Validate Last Name input text field accept entering numerical and special characters")
    @Test
    public void Validate_Last_Name_input_text_field_accept_numerical_and_special_characters() {
        RegisterFeature numericalSpecialCharAcceptedLastName = new RegisterFeature();
        open_Register_Form();
        numericalSpecialCharAcceptedLastName.input_numerical_and_special_characters_as_LastName_and_click_register("123+-*/");
    }


    @Feature("Register") // Test Case ID : RFORM-6 FORM TESTING
    @Description("Validate Last Name input text field accept entering alphabetical characters")
    @Test
    public void Validate_Last_Name_input_text_field_accept_alphabetical_characters() {
        RegisterFeature alphabeticalCharAcceptedLastName = new RegisterFeature();
        open_Register_Form();
        alphabeticalCharAcceptedLastName.input_alphabetical_characters_as_LastName_and_click_register("Fred");
    }


    @Feature("Register") // Test Case ID : RFORM-7 FORM TESTING
    @Description("Validate Email Address input text field not accept invalid email format")
    @Test
    public void Validate_email_address_input_text_box_do_not_accept_invalid_email_form() {
        RegisterFeature emailAddressNotAcceptInvalidForm = new RegisterFeature();
        open_Register_Form();
        emailAddressNotAcceptInvalidForm.input_invalid_email_form_and_click_register_verify_advice_message("my@email");
    }


    @Feature("Register") // Test Case ID : RFORM-8 FORM TESTING
    @Description("Validate password input text field when invalid password format is typed in")
    @Test
    public void Validate_password_input_text_field_entering_invalid_password_format() {
        RegisterFeature passwordInvalidPasswordFormat = new RegisterFeature();
        open_Register_Form();
        passwordInvalidPasswordFormat.input_invalid_password_format_click_register_verify_advice_message("pass");
    }


    @Feature("Register") // Test Case ID : RFORM-9 FORM TESTING
    @Description("Validate confirm password input text field when confirm password content do not match with password content")
    @Test
    public void Validate_confirm_password_input_text_field_when_confirm_password_content_not_match_with_password_content() {
        RegisterFeature confirmPasswordNotMatchPassword = new RegisterFeature();
        open_Register_Form();
        confirmPasswordNotMatchPassword.input_Password("parola");
        confirmPasswordNotMatchPassword.input_confirm_password_content_not_match_with_password_content_click_register_verify_advice_message("parola1");
        Selenide.sleep(1000);
    }

    SelenideElement newsletterCheckbox = $("#is_subscribed");
    @Feature("Register") // Test Case ID : RFORM-10 FORM TESTING
    @Description("Validate Sign Up for newsletter checkbox can be checked")
    @Test
    public void Validate_newsletter_checkbox_can_be_checked() {
        RegisterFeature checkNewsletterCheckbox = new RegisterFeature();
        open_Register_Form();
        newsletterCheckbox.click();
        if (newsletterCheckbox.isSelected()){
            System.out.println("The Sign Up for newsletter checkbox can be checked");
        }
        Selenide.sleep(5000);
    }

    @Feature("Register") // Test Case ID : RFORM-11 FORM TESTING
    @Description("REGISTER button can be clicked and functioning")
    @Test
    public void Click_register_button_validate_functioning() {
        RegisterFeature clickRegisterButtonFunctioning = new RegisterFeature();
        open_Register_Form();
        clickRegisterButtonFunctioning.click_register_button_validate_is_functioning();
    }

    @Feature("Register") // Test Case ID : RFORM-12 FORM TESTING
    @Description("Validate CREATE AN ACCOUNT can be clicked and functioning")
    @Test
    public void Click_CREATE_AN_ACCOUNT_button_validate_functioning() {
        RegisterFeature clickCreateAnAccountButtonFunctioning = new RegisterFeature();
        open_Login_Form();
        clickCreateAnAccountButtonFunctioning.click_CREATE_AN_ACCOUNT_button_validate_is_functioning();
    }

    @Feature("Register") // Test Case ID : RFORM-13 FORM TESTING
    @Description("Validate <<Back link can be clicked and functioning")
    @Test
    public void Click_Back_link_validate_functioning() {
        RegisterFeature clickBackLinkFunctioning = new RegisterFeature();
        open_Register_Form();
        clickBackLinkFunctioning.click_Back_link_validate_is_functioning();
    }

    SelenideElement FirstnameInputTextField = $("#firstname");
    SelenideElement MiddlenameInputTextField = $("#middlename");
    SelenideElement LastnameInputTextField = $("#lastname");
    SelenideElement EmailAddressInputTextField = $("#email_address");
    SelenideElement PasswordInputTextField = $("#password");
    SelenideElement ConfirmPasswordInputTextField = $("#confirmation");
    SelenideElement REGISTERbutton = $(".buttons-set .button");
    SelenideElement AlreadyUsedEmailErrorMsg = $(".error-msg span");
    SelenideElement MadisonIslandLogo = $(".large");

    @Feature("Register")
    @Description("Guest user can not register an account with already used email for registration")
    @Test
    public void Guest_user_register_with_already_used_email_for_registration_error_message_is_displayed() {
        // Precondition
        open_Register_Form();
        // Test Case steps
        FirstnameInputTextField.click();
        FirstnameInputTextField.clear();
        FirstnameInputTextField.sendKeys("Simo");
        MiddlenameInputTextField.click();
        MiddlenameInputTextField.clear();
        MiddlenameInputTextField.sendKeys("Attila");
        LastnameInputTextField.click();
        LastnameInputTextField.clear();
        LastnameInputTextField.sendKeys("Tamas");
        EmailAddressInputTextField.click();
        EmailAddressInputTextField.clear();
        EmailAddressInputTextField.sendKeys("simo_tamas2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("realmadrid");
        ConfirmPasswordInputTextField.click();
        ConfirmPasswordInputTextField.clear();
        ConfirmPasswordInputTextField.sendKeys("realmadrid");
        REGISTERbutton.click();
        AlreadyUsedEmailErrorMsg.shouldBe(Condition.text("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account."));
        // Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement NotPopulatedRequiredFirstnameAdviceMsg = $("#advice-required-entry-firstname");

    @Feature("Register")
    @Description("Guest user can not register an account with any of required fields not populated ")
    @Test
    public void Guest_user_register_with_any_of_required_fields_not_populated_advice_message_is_displayed() {
        // Precondition
        open_Register_Form();
        // Test Case steps
        MiddlenameInputTextField.click();
        MiddlenameInputTextField.clear();
        MiddlenameInputTextField.sendKeys("Attila");
        LastnameInputTextField.click();
        LastnameInputTextField.clear();
        LastnameInputTextField.sendKeys("Tamas");
        EmailAddressInputTextField.click();
        EmailAddressInputTextField.clear();
        EmailAddressInputTextField.sendKeys("simo_tamas2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("realmadrid");
        ConfirmPasswordInputTextField.click();
        ConfirmPasswordInputTextField.clear();
        ConfirmPasswordInputTextField.sendKeys("realmadrid");
        REGISTERbutton.click();
        NotPopulatedRequiredFirstnameAdviceMsg.shouldBe(Condition.text("This is a required field."));
        // Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement NotPopulatedRequiredLastnameAdviceMsg = $("#advice-required-entry-lastname");
    SelenideElement NotPopulatedRequiredEmailAddressAdviceMsg = $("#advice-required-entry-email_address");
    SelenideElement NotPopulatedRequiredPasswordAdviceMsg = $("#advice-required-entry-password");
    SelenideElement NotPopulatedRequiredConfirmPasswordAdviceMsg = $("#advice-required-entry-confirmation");

    @Feature("Register")
    @Description("Guest user can not register an account with all of required fields not populated")
    @Test
    public void Guest_user_register_with_all_of_required_fields_not_populated_advice_messages_are_displayed_for_not_populated_required_fields() {
        // Precondition
        open_Register_Form();
        // Test Case steps
        MiddlenameInputTextField.click();
        MiddlenameInputTextField.clear();
        MiddlenameInputTextField.sendKeys("Attila");
        REGISTERbutton.click();
        NotPopulatedRequiredFirstnameAdviceMsg.shouldBe(Condition.text("This is a required field."));
        NotPopulatedRequiredLastnameAdviceMsg.shouldBe(Condition.text("This is a required field."));
        NotPopulatedRequiredEmailAddressAdviceMsg.shouldBe(Condition.text("This is a required field."));
        NotPopulatedRequiredPasswordAdviceMsg.shouldBe(Condition.text("This is a required field."));
        NotPopulatedRequiredConfirmPasswordAdviceMsg.shouldBe(Condition.text("This is a required field."));
        // Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement InvalidEmailAddressFormatAdviceMsg = $("#advice-validate-email-email_address");

    @Feature("Register")
    @Description("Guest user can not register with invalid email format")
    @Test
    public void Guest_user_register_with_invalid_email_format_advice_message_is_displayed() {
        // Precondition
        open_Register_Form();
        // Test Case steps
        FirstnameInputTextField.click();
        FirstnameInputTextField.clear();
        FirstnameInputTextField.sendKeys("Simo");
        MiddlenameInputTextField.click();
        MiddlenameInputTextField.clear();
        MiddlenameInputTextField.sendKeys("Attila");
        LastnameInputTextField.click();
        LastnameInputTextField.clear();
        LastnameInputTextField.sendKeys("Tamas");
        EmailAddressInputTextField.click();
        EmailAddressInputTextField.clear();
        EmailAddressInputTextField.sendKeys("simo_tamas2007@com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("realmadrid");
        ConfirmPasswordInputTextField.click();
        ConfirmPasswordInputTextField.clear();
        ConfirmPasswordInputTextField.sendKeys("realmadrid");
        REGISTERbutton.click();
        InvalidEmailAddressFormatAdviceMsg.shouldBe(Condition.text("Please enter a valid email address. For example johndoe@domain.com."));
        // Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement InvalidPasswordFormatAdviceMsg = $("#advice-validate-password-password");

    @Feature("Register")
    @Description("Guest user can not register with invalid password format")
    @Test
    public void Guest_user_register_with_invalid_password_format_advice_message_is_displayed() {
        // Precondition
        open_Register_Form();
        // Test Case steps
        FirstnameInputTextField.click();
        FirstnameInputTextField.clear();
        FirstnameInputTextField.sendKeys("Simo");
        MiddlenameInputTextField.click();
        MiddlenameInputTextField.clear();
        MiddlenameInputTextField.sendKeys("Attila");
        LastnameInputTextField.click();
        LastnameInputTextField.clear();
        LastnameInputTextField.sendKeys("Tamas");
        EmailAddressInputTextField.click();
        EmailAddressInputTextField.clear();
        EmailAddressInputTextField.sendKeys("simo_tamas2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("123");
        ConfirmPasswordInputTextField.click();
        ConfirmPasswordInputTextField.clear();
        ConfirmPasswordInputTextField.sendKeys("123");
        REGISTERbutton.click();
        InvalidPasswordFormatAdviceMsg.shouldBe(Condition.text("Please enter 6 or more characters without leading or trailing spaces."));
        // Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement DifferentPasswordsAdviceMsg = $("#advice-validate-cpassword-confirmation");

    @Feature("Register")
    @Description("Guest user can not register with different Confirm Password and Password option")
    @Test
    public void Guest_user_register_with_different_Confirm_Password_option_than_the_Password_option_an_advice_message_is_displayed() {
        // Precondition
        open_Register_Form();
        // Test Case steps
        FirstnameInputTextField.click();
        FirstnameInputTextField.clear();
        FirstnameInputTextField.sendKeys("Simo");
        MiddlenameInputTextField.click();
        MiddlenameInputTextField.clear();
        MiddlenameInputTextField.sendKeys("Attila");
        LastnameInputTextField.click();
        LastnameInputTextField.clear();
        LastnameInputTextField.sendKeys("Tamas");
        EmailAddressInputTextField.click();
        EmailAddressInputTextField.clear();
        EmailAddressInputTextField.sendKeys("simo_tamas2007@yahoo.com");
        PasswordInputTextField.click();
        PasswordInputTextField.clear();
        PasswordInputTextField.sendKeys("accessWord");
        ConfirmPasswordInputTextField.click();
        ConfirmPasswordInputTextField.clear();
        ConfirmPasswordInputTextField.sendKeys("permissionWord");
        REGISTERbutton.click();
        DifferentPasswordsAdviceMsg.shouldBe(Condition.text("Please make sure your passwords match."));
        // Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement RegisterPageTitle = $(".page-title h1");

    @Feature("Register")
    @Description("Verify Register page main title is present ")
    @Test
    public void Verify_Register_page_main_title_is_present() {
        // Precondition
        open_Register_Form();
        //Test Case steps
        RegisterPageTitle.shouldBe(Condition.visible);
        RegisterPageTitle.shouldBe(Condition.text("CREATE AN ACCOUNT"));
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement FirstNameLabel = $(".field.name-firstname label");
    SelenideElement FirstNameTextBox = $("#firstname");

    @Feature("Register")
    @Description("Verify Register page First Name label and input text box is present  ")
    @Test
    public void Verify_Register_page_First_Name_label_and_input_text_box_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        FirstNameLabel.shouldBe(Condition.visible);
        FirstNameLabel.shouldBe(Condition.text("First Name"));
        FirstNameTextBox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement MiddleNameLabel = $(".field.name-middlename label");
    SelenideElement MiddleNameTextBox = $("#middlename");

    @Feature("Register")
    @Description("Verify Register page form Middle Name/Initial label and input text box is present  ")
    @Test
    public void Verify_Register_page_form_Middle_Name_Initial_label_and_input_text_box_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        MiddleNameLabel.shouldBe(Condition.visible);
        MiddleNameLabel.shouldBe(Condition.text("Middle Name/Initial"));
        MiddleNameTextBox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement LastNameLabel = $(".field.name-lastname label");
    SelenideElement LastNameTextBox = $("#lastname");

    @Feature("Register")
    @Description("Verify Register page form Last Name label and input text box is present ")
    @Test
    public void Verify_Register_page_form_Last_Name_label_and_input_text_box_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        LastNameLabel.shouldBe(Condition.visible);
        LastNameLabel.shouldBe(Condition.text("Last Name"));
        LastNameTextBox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement EmailAddressLabel = $("label[for='email_address']");
    SelenideElement EmailAddressTextBox = $("#email_address");

    @Feature("Register")
    @Description("Verify Register page form Email Address label and input text box is present  ")
    @Test
    public void Verify_Register_page_form_Email_Address_label_and_input_text_box_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        EmailAddressLabel.shouldBe(Condition.visible);
        EmailAddressLabel.shouldBe(Condition.text("Email Address"));
        EmailAddressTextBox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement PasswordLabel = $(".field label[for='password']");
    SelenideElement PasswordTextBox = $("#password");

    @Feature("Register")
    @Description("Verify Register page form Password label and input text box is present ")
    @Test
    public void Verify_Register_page_form_Password_label_and_input_text_box_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        PasswordLabel.shouldBe(Condition.visible);
        PasswordLabel.shouldBe(Condition.text("Password"));
        PasswordTextBox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement ConfirmPasswordLabel = $(".field label[for='confirmation']");
    SelenideElement ConfirmPasswordTextBox = $("#confirmation");

    @Feature("Register")
    @Description("Verify Register page Confirm Password label and input text box is present ")
    @Test
    public void Verify_Register_page_Confirm_Password_label_and_input_text_box_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        ConfirmPasswordLabel.shouldBe(Condition.visible);
        ConfirmPasswordLabel.shouldBe(Condition.text("Confirm Password"));
        ConfirmPasswordTextBox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement RegisterButton = $("button[title='Register']");

    @Feature("Register")
    @Description("Verify Register page form REGISTER button is present ")
    @Test
    public void Verify_Register_page_form_REGISTER_button_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        RegisterButton.shouldBe(Condition.visible);
        RegisterButton.shouldBe(Condition.text("REGISTER"));
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement NewsletterLabel = $("label[for='is_subscribed']");
    SelenideElement NewsletterCheckbox = $("#is_subscribed");

    @Feature("Register")
    @Description("Verify Register page form Sign Up for Newsletter label and checkbox is present ")
    @Test
    public void Verify_Register_page_form_Sign_Up_for_Newsletter_label_and_checkbox_is_present() {
        //Precondition
        open_Register_Form();
        //Test Case steps
        NewsletterLabel.shouldBe(Condition.visible);
        NewsletterLabel.shouldBe(Condition.text("Sign Up for Newsletter"));
        NewsletterCheckbox.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }

    SelenideElement BackLink = $("p .back-link");

    @Feature("Register")
    @Description("Verify Register page form <<Back link is present ")
    @Test
    public void Verify_Register_page_form_Back_link_is_present () {
        //Precondition
        open_Register_Form();
        //Test Case steps
        BackLink.shouldBe(Condition.visible);
        //Postcondition
        MadisonIslandLogo.click();
    }
}

