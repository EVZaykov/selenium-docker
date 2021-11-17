package com.github.test;

import com.commonInTest.BaseTest;
import com.github.pages.SignInPage;
import org.testng.annotations.Test;

public class TestTest extends BaseTest {

    @Test
    public void HelloTest(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov1","Test1VTB1");
        signInPage.pushSignInButton();
    }

    @Test
    public void HelloTest1(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov111111111","Test1VsafasfasfasTB1");
        System.out.println("Russian");
        signInPage.pushSignInButton();
    }

    @Test
    public void HelloTest2(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov111111111","Test1VsafasfasfasTB1");
        System.out.println("Russian");
        signInPage.pushSignInButton();
    }

    @Test
    public void HelloTest4(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov1","Test1VTB");
        signInPage.pushSignInButton();
    }
}
