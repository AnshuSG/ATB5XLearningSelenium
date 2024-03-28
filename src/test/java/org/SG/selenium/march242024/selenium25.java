package org.SG.selenium.march242024;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium25 {


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
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();


       //WebElement elementalert = driver.findElement(By.cssSelector("button[onClick='jsAlert()']"));
       //elementalert.click();
        //   WebElement elementConfirm = driver.findElement(By.cssSelector("button[onClick='jsConfirm()']"));
        //elementConfirm.click();
       WebElement elementPrompt = driver.findElement(By.cssSelector("button[onClick='jsPrompt()']"));
      elementPrompt.click();


        // AWS, Machine, Docker, Alert will load very slow - limited RAM
        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.alertIsPresent());




       Alert alert =  driver.switchTo().alert();
       alert.sendKeys("surekha");
        alert.accept();
       // alert.dismiss();

     String result = driver.findElement(By.id("result")).getText();
       // Assert.assertEquals(result,"You successfully clicked an alert");
       // Assert.assertEquals(result,"You clicked: Ok");

        Assert.assertEquals(result,"You entered: surekha");



        }




    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
