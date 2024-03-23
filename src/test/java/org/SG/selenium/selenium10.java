package org.SG.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium10 {


        //open app.vwo.com
        //print the title and get the current url
        //verify the current url is app.vwo.com

    @Test(groups = "QA")
    @Description("Verify the correct URl, title of the VWO app")
  public void testVWOLogin(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
  }

}
