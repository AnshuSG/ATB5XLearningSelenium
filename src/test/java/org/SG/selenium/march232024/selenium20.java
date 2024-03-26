package org.SG.selenium.march232024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class selenium20 {



    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new EdgeDriver(options);
    }

    @Test
    @Description("Test Case Description")
    public void wellness() throws InterruptedException{
       driver.get("https://wf-ecomm-pwa-git-feat-enhanced-search-wellness-forever.vercel.app/");
        driver.manage().window().maximize();
     WebElement btnCL = driver.findElement(By.xpath("//button[contains(text(),'Use Current Location')]"));
     Thread.sleep(3000);
     btnCL.click();
     Thread.sleep(5000);
        System.out.println("tbncl" + btnCL);
    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }





}
