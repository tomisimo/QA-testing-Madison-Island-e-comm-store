package madisonStoreFeatures;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GeneralMethods {
    public GeneralMethods() {
        open_Madison_Island_Webpage();
    }
    /**
     * Actions
     */
    @Step("Open webpage")
    public void open_Madison_Island_Webpage() {
        open("http://testfasttrackit.info/magento-test/");
    }
    @Step("Open webpage menu dropdown")
    public void open_Menu_Dropdown() {
        SelenideElement openMenuDropdown = $("a.skip-link.skip-account");
        openMenuDropdown.click();
    }
    @Step("Open Login form")
    public void open_Login_Form() {
        open_Menu_Dropdown();
        SelenideElement clickLogIn = $("a[href*='/customer/account/login/']");
        SelenideElement loginPageTitle = $(".page-title h1");
        clickLogIn.click();
        loginPageTitle.shouldBe(Condition.visible);
        loginPageTitle.shouldHave(Condition.exactText("LOGIN OR CREATE AN ACCOUNT"));
    }
    @Step("Open Register form")
    public void open_Register_Form(){
        open_Menu_Dropdown();
        SelenideElement clickRegister = $("a[href*='/customer/account/create/']");
        SelenideElement registerPageTitle = $("div.page-title h1");
        clickRegister.click();
        registerPageTitle.shouldBe(Condition.visible);
        registerPageTitle.shouldHave(Condition.exactText("CREATE AN ACCOUNT"));
    }
    @Step("Open My Account page")
    public void open_My_Account_Page(){
        open_Menu_Dropdown();
        SelenideElement clickMyAccount = $("a[title='My Account']");
        SelenideElement myAccountPageTitle = $(".page-title h1");
        clickMyAccount.click();
        myAccountPageTitle.shouldBe(Condition.visible);
        myAccountPageTitle.shouldHave(Condition.text("MY DASHBOARD"));
    }
    @Step("Click general reset")
    public void general_reset_button(){
        SelenideElement clickLogoImageReset = $("img.large");
        clickLogoImageReset.click();
    }
}
