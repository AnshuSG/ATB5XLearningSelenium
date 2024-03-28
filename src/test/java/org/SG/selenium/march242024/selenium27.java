package org.SG.selenium.march242024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class selenium27 {


    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");

        driver = new EdgeDriver(options);
    }

    @Test
    @Description("Test Case Description")
    public void TestPositive() throws InterruptedException{
        String Url = "https://awesomeqa.com/webtable.html";
        driver.get(Url);
        driver.manage().window().maximize();

         //    //table[@id="customers"]/tbody/tr[5]/td[2]
        //     //table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td

   // print all the data in the table and if name is helen print which country she belongs to


      //     //table[@id="customers"]/tbody/tr[
        //  i
        //  ]/td[
        // j
        // ]




        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();





        int rows = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();

    int cols = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

    String firstPart= "//table[@id=\"customers\"]/tbody/tr[";
        String secondPart= "]/td[";
        String thirdPart= "]";


        for(int i=2;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                String DynamicXpath= firstPart+i+secondPart+j+thirdPart;
                String data = driver.findElement(By.xpath(DynamicXpath)).getText();
                System.out.println(data);

                if(data.contains("Helen Bennett"))
                {
                    String Country_path = DynamicXpath + "/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(Country_path)).getText();

                    System.out.println("Helen beneet is in " + country_text);
                }


            }
        }





        }




    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }






}
