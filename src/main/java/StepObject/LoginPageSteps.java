package StepObject;

import DataObject.LoginPageData;
import PageObject.LoginPage;
import io.qameta.allure.Step;

public class LoginPageSteps extends LoginPage {

    public LoginPageSteps clickProfileIcon(){
        profileIcon.click();
        return this;
    }

    public LoginPageSteps goToLoginAccount(){
        accountLoginButton.click();
        return this;
    }
    public LoginPageSteps loginWithMobile(){
        loginWithMobile.click();
        return this;
    }
    public LoginPageSteps inputMobile() {
        mobileInput.setValue(LoginPageData.mobile);
        return this;
    }

    public LoginPageSteps loginWithEmail(){
        loginWithEmail.click();
        return this;
    }
    public LoginPageSteps inputEmail() {
        emailInput.setValue(LoginPageData.email);
        return this;
    }

    public LoginPageSteps inputPassword(){
        passwordInput.setValue(LoginPageData.password);
        return this;
    }
    public LoginPageSteps enterLoginButton(){
        loginButton.click();
        return this;
    }

    public LoginPageSteps checkRememberMe(){
        rememberMeCheckBox.click();
        return this;
    }



}
