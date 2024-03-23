package org.SG.selenium.march172024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class selenium17 {

    @Test
    public void anchortagcheck(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        List<WebElement> anchorTagList = driver.findElements(By.tagName("a"));
        System.out.println(anchorTagList.size());
        for(int i=0;i<=anchorTagList.size()-1;i++)
        {
            System.out.println(anchorTagList.get(i).getText());
        }
    }
}
