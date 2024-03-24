package org.SG.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium12 {

    @Test
    @Description("Negative TC#1 , Invalid Username and valid password")
    public void TCNegative1(){

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        WebElement emailinput = driver.findElement(By.id("login-username"));
        emailinput.sendKeys("admin@admin.com");

        WebElement passwordinput = driver.findElement(By.id("login-password"));
        passwordinput.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg  =  driver.findElement(By.className("notification-box-description"));
        String errormsg_text = error_msg.getText();

        Assert.assertEquals(errormsg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    @Description("Negative TC#2 , Valid Username and invalid password")
    public void TCNegative2(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        WebElement emailinput = driver.findElement(By.id("login-username"));
        emailinput.sendKeys("dharanshu6@gmail.com");

        WebElement passwordinput = driver.findElement(By.id("login-password"));
        passwordinput.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg  =  driver.findElement(By.className("notification-box-description"));
        String errormsg_text = error_msg.getText();

        Assert.assertEquals(errormsg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }

}
