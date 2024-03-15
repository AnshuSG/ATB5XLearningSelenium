package org.SG;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    @Description("Verify the title of the testing academy website")
    public void VWOLogin(){

        //how selenium architecture works
        // Write the code - client -java,python,ruby,c#
         WebDriver driver = new EdgeDriver();
         //1. Cretae sessin -> Box -> connect with browser via the http methods
        //2. session id
        //3.driver -> ref -> functions-> driver.get()-> http command  open the url
        //4. driver.command ()-> API(GET,POST,PATCH)

        //Selenium 3.x  json wire protocol
        //selenium 4 w3c protocol


        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());

          }


}
