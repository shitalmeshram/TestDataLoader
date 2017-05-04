package com.LiveiNews.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by hishailesh77 on 5/3/2017.
 */
public class GetNadaPage {
    //@FindBy(how= How.XPATH, using = ".//*[@id='sidebar-container']/div/div/div/div/div/div/div/ul/li[2]/a/span[2]/span")
    @FindBy(how= How.XPATH, using = "//span[.='Add More']")
    private WebElement addBtn;

    public void ClickaddBtn(){
        addBtn.click();
    }

    @FindBy(how= How.XPATH, using = "html/body/div[2]/div[2]/form/div[2]/div/input")
    private WebElement txtBox;

    public void EnterTxt(String txt){
        txtBox.sendKeys(txt);
    }

    @FindBy(how= How.XPATH, using = "html/body/div[2]/div[2]/form/div[3]/button[1]")


    private WebElement add1Btn;

    public void Clickadd1Btn(){
        add1Btn.click();
    }

    @FindBy(how= How.ID, using = "soflow")
    private WebElement dropDown;

    public void SelectDropDown() throws InterruptedException {
        Select dropdown2 = new Select(dropDown);
        dropdown2.selectByVisibleText("@getnada.com");
        Thread.sleep(2000);
    }
}
