package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartAppPage {
    WebDriver driver;


    public CartAppPage(WebDriver driver){
        this.driver = driver;
    }




    public CartAppPage cart(){
        WebElement cartbutn = driver.findElement(By.className("shopping_cart_link"));
        cartbutn.click();
        return this;
    }


    public CartAppPage Contishop(){
        WebElement returnbtn = driver.findElement(By.id("continue-shopping"));
        returnbtn.click();
        return this;
    }

    public CartAppPage shopingicon (){
        WebElement shoppingicon = driver.findElement(By.className("shopping_cart_container"));
        shoppingicon.click();
        return this;
    }

    public  CartAppPage checkout(){
        WebElement checkoutbtn = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkoutbtn.click();
        return this;
    }

}
