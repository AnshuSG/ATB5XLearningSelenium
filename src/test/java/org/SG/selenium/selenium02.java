package org.SG.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class selenium02 {

    @Test
    public void testMethod(){
        WebDriver driver = new EdgeDriver();
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new SafariDriver();
        WebDriver driver4 = new InternetExplorerDriver();
        WebDriver driver5 = new SafariDriver();

        //SearchContext(I)->WebDriver(I)->RemoteWebDriver(C)->Chromium driver(C)->EdgeDriver(c)
        //SearchContext(I)->WebDriver(I)->RemoteWebDriver(C)->Chromium driver(C)->chromedriver(c)


        //SearchContext is an interface - findelement and findelements
        //Webdriver is an interface- some incomplete functions
        //Remotewebdriver class
        //edge,chrome drivers== classes

    }
    //searchcontext driver= new chromedriver(); dynamic dispatch


}
