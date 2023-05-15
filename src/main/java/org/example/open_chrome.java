package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public  class open_chrome   {

     static    WebDriver driver = new ChromeDriver();
     @Test
    void setup() {

         System.out.println("browser is opening ");

        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","D:\\intelijj idea\\chrome driver\\chromedriver.exe");
        driver.get("https://online.btes.co.in/login/index.php");
         System.out.println(" test completed ");
    }
}

