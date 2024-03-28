package org.SG.selenium.march242024.march24Assignment;

import io.qameta.allure.Description;
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

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class Assignment {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        String URL = "https://katalon-demo-cura.herokuapp.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement btnMakeAppt = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        btnMakeAppt.click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id='btn-login']"));
        btnLogin.click();

        WebElement element_facility =  driver.findElement(By.xpath("//select[@id='combo_facility']"));
        Select select = new Select(element_facility);
        select.selectByIndex(2);

        WebElement chk1 = driver.findElement(By.xpath("//input[@id=\"chk_hospotal_readmission\"]"));
        chk1.click();

        WebElement radioselect = driver.findElement(By.xpath("//input[@id=\"radio_program_none\"]"));
        radioselect.click();

        driver.findElement(By.id("txt_visit_date")).sendKeys("01/01/2024");
        driver.findElement(By.id("txt_comment")).sendKeys("Hello Automation 123");


        WebElement btnbookAppt = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        btnbookAppt.click();

        WebElement LeadMessage = driver.findElement(By.xpath("//p[@class=\"lead\"]"));
        String txtmessage = LeadMessage.getText();

        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.textToBePresentInElement(LeadMessage,txtmessage));

        Assert.assertEquals(txtmessage,"Please be informed that your appointment has been booked as following:");

        String CommentConfirm =  driver.findElement(By.xpath("//p[@id=\"comment\"]")).getText();
        Assert.assertEquals(CommentConfirm,"Hello Automation 123");

    }



    @AfterTest
    public void closeBrowser(){
       driver.quit();
    }

}
