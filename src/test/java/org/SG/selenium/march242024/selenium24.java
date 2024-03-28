package org.SG.selenium.march242024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium24 {


    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");

        driver = new EdgeDriver(options);
    }

    @Test
    @Description("Test Case Description")
    public void TestPositive() throws InterruptedException{
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();


        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select =  new Select(element_select);
        select.selectByVisibleText("Option 2");
        Thread.sleep(15000);


    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
