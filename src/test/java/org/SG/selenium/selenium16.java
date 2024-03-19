package org.SG.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class selenium16 {
    @Test(groups = "QA")
    @Description("LinkText and Partial Link Text ")
    public void Test1() {
        EdgeDriver driver = new EdgeDriver();
        //step 1. open the url app.vwo.com
        driver.get("https://app.vwo.com");
        List<WebElement> all_atags= driver.findElements(By.tagName("a"));
        all_atags.get(0).click();  // start free trial
        all_atags.get(1).click(); // start vwo insights
        for(WebElement element:all_atags)
        {
            System.out.println(element.getText());
        }
        driver.close();
    }
    }
