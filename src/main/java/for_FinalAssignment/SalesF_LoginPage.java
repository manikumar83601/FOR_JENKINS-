package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesF_LoginPage {
    WebDriver driver;
    public SalesF_LoginPage(WebDriver driver) {
        this.driver = driver;
    }




    public SalesF_LoginPage firstname (){
        WebElement fname = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[1]/div/div[1]/div/div/input"));
        fname.sendKeys("Manish");
        return this;
    }


    public SalesF_LoginPage lastname (){
        WebElement lname = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[1]/div/div[2]/div/div/input"));
        lname.sendKeys("Kumar");
        return this;
    }


    public SalesF_LoginPage jobtitle (){
        WebElement jtitle = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/div/div[1]/div/div/input"));
        jtitle.sendKeys("Eng.");
        return this;
    }


    public SalesF_LoginPage email (){
        WebElement emaill = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/div/div[2]/div/div/input"));
        emaill.sendKeys("qwer@gmail.com");

        return this;
    }

    public SalesF_LoginPage comapny (){
        WebElement cname = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[3]/div/div[1]/div/div/input"));
        cname.sendKeys("BEBO inst.");
        return this;
    }

    public SalesF_LoginPage selectdropdown() {
        WebElement down = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[3]/div/div[2]/div/div/select"));
        Select select = new Select(down);
        select.selectByValue("95");

        return this;
    }

    public SalesF_LoginPage phone (){
        WebElement pno = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[4]/div/div[1]/div/div/input"));
        pno.sendKeys("2824263889");
        return this;
    }


    public SalesF_LoginPage watchdemo (){
        WebElement demobtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/div[11]/button"));
        demobtn.click();
        return this;
    }
    
    
    
    
    


}
