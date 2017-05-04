package com.LiveiNews;
import com.LiveiNews.Pages.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


/**
 * Unit test for simple App.
 */
public class TestRunner{
    private WebDriver driver,driver1;

    ArrayList arrayList = new ArrayList();

    int count;
    @BeforeClass
    @Parameters({"driverName","driverLocation","browser"})
    public void beforeClass(String driverName,String driverLocation,String browser) {
        count = 0;
        System.setProperty(driverName, driverLocation);
        if (browser.equalsIgnoreCase("firefox")){
            driver1 = new FirefoxDriver();
            driver = new FirefoxDriver();

        }
        else if (browser.equalsIgnoreCase("chrome")){
            driver1 = new ChromeDriver();
            driver = new ChromeDriver();

        }
        driver1.navigate().to("https://app.getnada.com/inbox/heqopin@cmail.club");
        driver1.manage().window().maximize();
        driver.navigate().to("http://liveinews.com/");
        driver.manage().window().maximize();

    }




    @Test(priority=1,invocationCount = 3)

    public void RegistrationTest() throws InterruptedException {
        String randomEmailChars;
        GetNadaPage getNadaPage = PageFactory.initElements(driver1,GetNadaPage.class);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getNadaPage.ClickaddBtn();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        randomEmailChars = RandomStringUtils.randomAlphanumeric(10).toLowerCase();


        getNadaPage.EnterTxt(randomEmailChars);
       // arrayList.add(randomEmailChars);
        getNadaPage.SelectDropDown();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getNadaPage.Clickadd1Btn();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver1.navigate().refresh();

        HomePage homePageTest = PageFactory.initElements(driver,HomePage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePageTest.ClickRegisterLink();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Submit Login page
       // LoginTestPage loginTestPage = PageFactory.initElements(driver,LoginTestPage.class);
        RegistrationPage registrationPage=PageFactory.initElements(driver,RegistrationPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //  System.out.println("Assert Result:- ");
        // Assert.assertTrue(loginTestPage.getLoginTitle().contains("Login - BidQA"));
        registrationPage.EnterEmail(randomEmailChars+"@getnada.com");
        registrationPage.EnterPwd("12345");
        registrationPage.EnterCpwd("12345");
        registrationPage.EnterUname(randomEmailChars);
       System.out.println("username = "+randomEmailChars);
        System.out.println("Email = "+randomEmailChars+"@getnada.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      registrationPage.ClicknextBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        registrationPage.ClickChkBox();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       registrationPage.ClicknextBtn1();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       registrationPage.ClicksubmitBtn();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  //  driver.navigate().refresh();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterClass
    public void afterClass() throws InterruptedException {
        //Close the browser
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.close();
        driver.quit();
        driver1.close();
        driver1.quit();
    }

}

