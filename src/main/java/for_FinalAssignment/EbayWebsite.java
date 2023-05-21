package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EbayWebsite {
    WebDriver driver;
    public EbayWebsite(WebDriver driver) {
        this.driver = driver;
    }

    public EbayWebsite Url (){
        driver.get("https://www.ebay.com/");
        return  this;
    }

    public EbayWebsite mouseonelectronics (){

        WebElement ele = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();

        return this;
    }

    public EbayWebsite Deals (){

        WebElement deal = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[6]/a"));
        deal.click();

        return this;
    }



}
