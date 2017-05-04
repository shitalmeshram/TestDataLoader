package com.LiveiNews.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by hishailesh77 on 5/3/2017.
 */
public class RegistrationPage {


    @FindBy(how = How.ID, using = "reg_email")
    private WebElement txtEmail;

    @FindBy(how = How.ID, using = "reg_password")
    private WebElement txtPwd;

    @FindBy(how = How.ID, using = "creg_password")
    private WebElement txtCpwd;

    @FindBy(how = How.ID, using = "i-e-name")
    private WebElement txtUname;

    @FindBy(how = How.NAME, using = "register")
    private WebElement nextBtn;

    public void EnterEmail(String email){
        txtEmail.sendKeys(email);
    }

    public void EnterPwd(String pwd){
        txtPwd.sendKeys(pwd);
    }

    public void EnterCpwd(String cpwd){
        txtCpwd.sendKeys(cpwd);
    }

    public void EnterUname(String uname){
        txtUname.sendKeys(uname);
    }

    public void ClicknextBtn() {
        nextBtn.click();
    }

    // accept terms
    @FindBy(how = How.ID, using = "acceptterms")
    private WebElement chkTerms;

    public void ClickChkBox(){
        chkTerms.click();
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='terms-modal']/div/p[2]/span")
    private WebElement nextBtn1;

    public void ClicknextBtn1() {
        nextBtn1.click();
    }


    @FindBy(how = How.XPATH, using = ".//*[@id='registration-form']/p[2]/input")
    private WebElement submitBtn;

    public void ClicksubmitBtn() {
        submitBtn.click();
    }
}
