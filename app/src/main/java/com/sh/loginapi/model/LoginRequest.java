package com.sh.loginapi.model;

public class LoginRequest {

    private String userNameOrEmailAddress;
    private String password;
    private String twoFactorVerificationCode;
    private String twoFactorRememberClientToken;
    private String returnUrl;
    private String captchaResponse;
    private Boolean rememberClient;
    private Boolean singleSignIn;


    public LoginRequest() {
    }

    public String getUserNameOrEmailAddress() {
        return userNameOrEmailAddress;
    }

    public void setUserNameOrEmailAddress(String userNameOrEmailAddress) {
        this.userNameOrEmailAddress = userNameOrEmailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTwoFactorVerificationCode() {
        return twoFactorVerificationCode;
    }

    public void setTwoFactorVerificationCode(String twoFactorVerificationCode) {
        this.twoFactorVerificationCode = twoFactorVerificationCode;
    }

    public String getTwoFactorRememberClientToken() {
        return twoFactorRememberClientToken;
    }

    public void setTwoFactorRememberClientToken(String twoFactorRememberClientToken) {
        this.twoFactorRememberClientToken = twoFactorRememberClientToken;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCaptchaResponse() {
        return captchaResponse;
    }

    public void setCaptchaResponse(String captchaResponse) {
        this.captchaResponse = captchaResponse;
    }

    public Boolean getRememberClient() {
        return rememberClient;
    }

    public void setRememberClient(Boolean rememberClient) {
        this.rememberClient = rememberClient;
    }

    public Boolean getSingleSignIn() {
        return singleSignIn;
    }

    public void setSingleSignIn(Boolean singleSignIn) {
        this.singleSignIn = singleSignIn;
    }
}
