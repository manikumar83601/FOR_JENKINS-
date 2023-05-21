package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {
    WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    By link = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By addincart = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");


    public Dashboard clicklink() {
        driver.findElement(link).click();
        return this;
    }


    public Dashboard additem() {
        driver.findElement(addincart).click();
        return this;
    }

    public Dashboard selectdropdown() {
        WebElement down = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(down);
        select.selectByValue("lohi");

        return this;
    }

    public Dashboard threeline() {

        WebElement threelinee = driver.findElement(By.id("react-burger-menu-btn"));
        threelinee.click();
        return this;
    }

    public Dashboard redtop() {

        WebElement Addingredtop = driver.findElement(By.id("item_3_title_link"));
        Addingredtop.click();
        return this;
    }

    public Dashboard additem1() {
       WebElement addingredtopincart =  driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
       addingredtopincart.click();
        return this;
    }





}
