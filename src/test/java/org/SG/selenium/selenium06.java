package org.SG.selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class selenium06 {
    public static void main(String[] args) {
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.setPageLoadStrategy(PageLoadStrategy.NONE);
//        Proxy proxy = new Proxy();
//        proxy.setHttpProxy("<HOST:PORT");
//        edgeoptions.setCapability("proxy",proxy);
        WebDriver driver = new EdgeDriver(edgeoptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
