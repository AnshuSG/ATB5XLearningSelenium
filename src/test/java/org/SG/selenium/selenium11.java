package org.SG.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium11 {


        //open app.vwo.com
        //print the title and get the current url
        //verify the current url is app.vwo.com

    @Test(groups = "QA")
    @Description("Find elements ")
  public void testVWOLogin(){
        EdgeDriver driver = new EdgeDriver();
        //step 1. open the url app.vwo.com
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");


        //step2. find email id and enter email as admin@admin.com
        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement PasswordInputBox = driver.findElement(By.id("login-password"));
        PasswordInputBox.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msg_text = error_msg.getText();

        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");

        driver.quit();




    }

}
