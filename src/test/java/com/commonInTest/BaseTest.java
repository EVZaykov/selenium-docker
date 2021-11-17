package com.commonInTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setDriver(ITestContext ctx) throws MalformedURLException {
        String host = "localhost";


        DesiredCapabilities dc;


        if(System.getProperty("BROWSER") != null &&
            System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }else{
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            dc = DesiredCapabilities.chrome().merge(options);
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String testName = ctx.getCurrentXmlTest().getName();

        String completeUrl = "http://" + host + ":4444/wd/hub";
        dc.setCapability("name",testName);
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);

        //System.setProperty("webdriver.chrome.driver", "C:\\projects\\DemoCucumber-master\\src\\test\\java\\resources\\other\\chromedriver.exe");
        //this.driver = new ChromeDriver();
    }

    @AfterTest
    public void closeDriver() {
        this.driver.close();
        this.driver.quit();
    }



}
