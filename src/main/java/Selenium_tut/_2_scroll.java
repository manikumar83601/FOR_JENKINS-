package Selenium_tut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _2_scroll {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
        driver.manage().window().maximize();
//to scroll to element -----------------------------------------------------------------------------
        WebElement scroll_to = driver.findElement(By.xpath("//*[@id=\"radio_1665628131_Vegetarian\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll_to);
        actions.perform();
//----------------------------------------
        driver.findElement(By.xpath("//*[@id=\"radio_1665627931_No\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
//to check it is clicked or not -------------------------------------------------------------------------
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Shared Room\"]"));
        checkbox1.click();
        System.out.println(checkbox1.isSelected());
    }
}
//-----------------------handle frames ------------------------------------------------------------
