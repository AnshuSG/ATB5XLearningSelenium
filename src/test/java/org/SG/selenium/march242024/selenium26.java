package org.SG.selenium.march242024;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class selenium26 {


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
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
      List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
     WebElement ch1= CheckBoxes.get(0);
        WebElement ch2= CheckBoxes.get(1);
     ch1.click();
        ch2.click();





        // AWS, Machine, Docker, Alert will load very slow - limited RAM
        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(3));
         wait.until(ExpectedConditions.elementToBeSelected(ch1));







        }




    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
