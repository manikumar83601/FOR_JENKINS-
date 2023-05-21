package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesF_Authentication {
    WebDriver driver;
    public SalesF_Authentication(WebDriver driver) {
        this.driver = driver;
    }

    public SalesF_Authentication Url (){
        driver.get("https://www.salesforce.com/solutions/mobile/app-suite/security/");
        return  this;
    }

    public SalesF_Authentication clickdemo (){
        WebElement demobtn = driver.findElement(By.xpath("/html/body/nav/div[2]/div/div/div/div[3]/div[1]/div/div/a"));
        demobtn.click();
        return  this;
    }






}
