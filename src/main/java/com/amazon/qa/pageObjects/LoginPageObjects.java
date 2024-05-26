package main.java.com.amazon.qa.pageObjects;

public interface LoginPageObjects {

    String expectedIncorrectPwdMsg = "Your password is incorrect";
    String signInHeader = "//div/h1[contains(text(),'Sign in')]";
    String emailAddress = "ap_email";
    String continueButton = "//input[@id='continue']";
    String userPassword = "ap_password";
    String signInButton = "signInSubmit";
    String incorrectPwdMsg = "//span[@class='a-list-item']";
    String forgotPassword = "auth-fpp-link-bottom";
}
