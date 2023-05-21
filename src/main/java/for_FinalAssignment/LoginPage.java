package for_FinalAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    By username = By.id("user-name");
    By password = By.id("password");
    By loginbtn = By.id("login-button");


    public LoginPage enterusername() {
        driver.findElement(username).sendKeys("standard_user");

        return this;
    }

    public LoginPage enterpassword() {
        driver.findElement(password).sendKeys("secret_sauce");
        return this;
    }

    public LoginPage clickloginbtn() {
        driver.findElement(loginbtn).click();
        return this;
    }


}

