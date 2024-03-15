package org.SG.selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class selenium05 {

    public static void main(String[] args) {
        EdgeOptions edgeoptions = new EdgeOptions();
        //headless
        //startmax
        //addextensions
        //windowsize

        //edgeoptions.addArguments("--start-maximized");
        edgeoptions.addArguments("--window-size=800,600");
  edgeoptions.addArguments("--incognito");
        EdgeDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        //driver.manage().window().maximize();
        driver.quit();
    }




}
