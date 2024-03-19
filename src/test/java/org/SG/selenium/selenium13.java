package org.SG.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class selenium13 {

  @Test(description = "xpath testing")
    public void testVWOLogin() {
        EdgeDriver driver = new EdgeDriver();
        //step 1. open the url app.vwo.com
        driver.get("https://app.vwo.com");



        driver.findElement(By.xpath("//input[contains(@id,'login-user')]")).sendKeys("admin@admin.com");
        driver.findElement(By.xpath("//input[contains(@id,'login-pass')]")).sendKeys("admin");

        driver.findElement(By.xpath("//button[contains(@id, 'js-login-btn')]")).click();

      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }

      String error_msg_text = driver.findElement(By.xpath("//div[contains(@class,'notification-box-description')]")).getText();


      Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");

      driver.quit();
//        driver.findElement(By.xpath("//input[contains(@id, 'userN')]/.")).sendKeys("Full Name");
//
//        // Double dot “..” - Full name label
//        String label = driver.findElement(By.xpath("//input[contains(@id, 'userN')]/../../div/label")).getText();
//        System.out.println("The label of full text is : " + label);
//
//        // Asterisk “*” - Full Name textbox
//        driver.findElement(By.xpath("//div[contains(@id, 'userName-wrapper')]/div[2]/*")).sendKeys("Full Name");
//
//        // Address and Asterisk “@*” - full name text box
//        driver.findElement(By.xpath("//input[@*= 'userName']")).sendKeys("Full Name");
//
//        // Pipe “|” - to locate both full name and Email label
//        List<WebElement> lst = driver.findElements(By.xpath("//label[@*= 'userName-label']|//label[@*= 'userEmail-label']"));

    }

}
