package com.github.test;

import com.commonInTest.BaseTest;
import com.github.pages.SignInPage;
import org.testng.annotations.Test;

public class GitHubSignInTest extends BaseTest {

    @Test
    public void signInTest(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov1","Test1VTB1");
        signInPage.pushSignInButton();
    }

    @Test
    public void signIn1Test(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov111111111","Test1VsafasfasfasTB1");
        System.out.println("Russian");
        signInPage.pushSignInButton();
    }

    @Test
    public void signIn444Test(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov111111111","Test1VsafasfasfasTB1");
        System.out.println("Russian");
        signInPage.pushSignInButton();
    }

    @Test
    public void signIn2Test(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov1","Test1VTB");
        signInPage.pushSignInButton();
    }

    @Test
    public void signIn2Test1(){
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goTo();
        signInPage.enterUserCredentials("EVZaykov1","Test1VTB");
        signInPage.pushSignInButton();
    }
}
