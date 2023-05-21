package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver=driver;
    }

    public CheckoutPage enterdetails (){
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        firstname.sendKeys("manish");

        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        lastname.sendKeys("Kumar");

        WebElement zip = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        zip.sendKeys("160030");
        return this;
    }

    public CheckoutPage conti(){
        WebElement contibtn = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        contibtn.click();

        WebElement finibtn = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
        finibtn.click();
        return this;
    }








}
