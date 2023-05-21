package Selenium_tut;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class _1_PrintLinks {
    @Test
    public void setup() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://online.btes.co.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("rch01220063");
        driver.findElement(By.id("password")).sendKeys("Manish@123");
        driver.findElement(By.id("rememberusername")).click();
        driver.findElement(By.id("loginbtn")).click();


        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for (int i = 0; i <= links.size(); i++) {
            System.out.println(links.get(i).getAttribute("HREF"));
            System.out.println(links.get(i).getText());
        }

    }
}
