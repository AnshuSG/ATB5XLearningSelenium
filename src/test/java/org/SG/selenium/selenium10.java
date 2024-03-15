package org.SG.selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium10 {


        //open app.vwo.com
        //print the title and get the current url
        //verify the current url is app.vwo.com

    @Test
  public void testVWOLogin(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
  }

}
