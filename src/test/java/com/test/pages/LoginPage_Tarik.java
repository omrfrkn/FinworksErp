package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Tarik extends BasePage_Tarik{

    @FindBy(id = "#login")
    public WebElement emailInputBox;

    @FindBy(id = "#password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signButton;
}
