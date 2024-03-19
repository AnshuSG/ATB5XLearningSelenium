package org.SG.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class selenium15 {
    //Locators
    @Test(groups = "QA")
    @Description("LinkText and Partial Link Text ")
    public void Test1() {
        EdgeDriver driver = new EdgeDriver();
        //step 1. open the url app.vwo.com
        driver.get("https://app.vwo.com");

        //WebElement anchor_tag= driver.findElement(By.linkText("Start a free trial"));
        WebElement anchor_tag= driver.findElement(By.partialLinkText("Start a free"));
        System.out.println(anchor_tag.getAttribute("href"));
        anchor_tag.click();
        driver.close();

    }
    }
