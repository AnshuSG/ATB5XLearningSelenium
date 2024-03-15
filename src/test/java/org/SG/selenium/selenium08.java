package org.SG.selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class selenium08 {

    public static void main(String[] args) {
        EdgeDriver driver =new EdgeDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();// will not close other windows
        driver.quit(); // close other windows  ..session id is null
    }

}
