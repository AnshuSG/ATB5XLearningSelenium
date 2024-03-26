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

public class selenium18 {



    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new EdgeDriver(options);
    }

    @Test
    @Description("Test Case Description")
    public void ebay() throws InterruptedException{
    //div.first>span
        //div[@class="first"]
        //div.first>span:nth-child(3)



        // Xpath -> //input[@id='login-username'] -> input#login-username
        // //input[@data-qa='hocewoqisi'] -> input[data-qa='hocewoqisi']
        //  input[data-qa$='si'] -> $ ends with, ^ starts with * contains

//https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067

        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchbox.sendKeys("macmini");
   WebElement searchBoxButton = driver.findElement((By.cssSelector("input[value=\"Search\"]")));
   searchBoxButton.click();



   //Wait
        Thread.sleep(3000);

        List<WebElement> searchedTitles = driver.findElements(By.cssSelector("*[class=\"s-item__title\"]"));
        for(WebElement title : searchedTitles)
        {
            System.out.println(title.getText());
        }






    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }





}
