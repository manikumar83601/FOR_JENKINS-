package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Youtube {

    WebDriver driver;
    public Youtube(WebDriver driver) {
        this.driver = driver;
    }

    public Youtube Url (){
        driver.get("https://www.youtube.com/");
        return  this;
    }

    public Youtube search (){
        WebElement searchbox = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
        searchbox.sendKeys("selenium");
        return this;
    }

    public Youtube searchbtn (){
        WebElement searchbutton = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
        searchbutton.click();
        return this;
    }



}
