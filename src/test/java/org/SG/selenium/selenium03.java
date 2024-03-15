package org.SG.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class selenium03 {
    @Test
    public void testMethod(){
        //Ad blocker extension
        EdgeOptions edgeoptions = new EdgeOptions();
       edgeoptions.addExtensions(new File("C://Users/SUREKHA/Downloads/AdBlock1.crx"));
       //edgeoptions.addArguments("--headless");
        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://youtube.com");
    }

}
