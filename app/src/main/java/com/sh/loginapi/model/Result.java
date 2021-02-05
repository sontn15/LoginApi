package com.sh.loginapi.model;

import java.io.Serializable;

public class Result implements Serializable {

    private String accessToken;
    private String encryptedAccessToken;
    private Integer expireInSeconds;
    private boolean shouldResetPassword;
    private String passwordResetCode = null;
    private Integer userId;
    private boolean requiresTwoFactorVerification;
    private String twoFactorAuthProviders = null;
    private String twoFactorRememberClientToken = null;
    private String returnUrl;
    private String refreshToken;
    private Integer refreshTokenExpireInSeconds;

    public Result() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getEncryptedAccessToken() {
        return encryptedAccessToken;
    }

    public Integer getExpireInSeconds() {
        return expireInSeconds;
    }

    public boolean getShouldResetPassword() {
        return shouldResetPassword;
    }

    public String getPasswordResetCode() {
        return passwordResetCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public boolean getRequiresTwoFactorVerification() {
        return requiresTwoFactorVerification;
    }

    public String getTwoFactorAuthProviders() {
        return twoFactorAuthProviders;
    }

    public String getTwoFactorRememberClientToken() {
        return twoFactorRememberClientToken;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public Integer getRefreshTokenExpireInSeconds() {
        return refreshTokenExpireInSeconds;
    }

    // Setter Methods

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setEncryptedAccessToken(String encryptedAccessToken) {
        this.encryptedAccessToken = encryptedAccessToken;
    }

    public void setExpireInSeconds(Integer expireInSeconds) {
        this.expireInSeconds = expireInSeconds;
    }

    public void setShouldResetPassword(boolean shouldResetPassword) {
        this.shouldResetPassword = shouldResetPassword;
    }

    public void setPasswordResetCode(String passwordResetCode) {
        this.passwordResetCode = passwordResetCode;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setRequiresTwoFactorVerification(boolean requiresTwoFactorVerification) {
        this.requiresTwoFactorVerification = requiresTwoFactorVerification;
    }

    public void setTwoFactorAuthProviders(String twoFactorAuthProviders) {
        this.twoFactorAuthProviders = twoFactorAuthProviders;
    }

    public void setTwoFactorRememberClientToken(String twoFactorRememberClientToken) {
        this.twoFactorRememberClientToken = twoFactorRememberClientToken;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public void setRefreshTokenExpireInSeconds(Integer refreshTokenExpireInSeconds) {
        this.refreshTokenExpireInSeconds = refreshTokenExpireInSeconds;
    }
}
