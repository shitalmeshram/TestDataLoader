package com.LiveiNews.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage {
    //Define Sign Up Link
    @FindBy(how= How.XPATH, using = ".//*[@id='menu-item-1716']/a")
    private WebElement signUpLink;

    //Define Register Button Click Method
    public void ClickRegisterLink()
    {
        signUpLink.click();
    }
}
