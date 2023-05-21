package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.TimeUnit;

public class _1_DataDriverTestingXML {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", ("C:\\Users\\manik\\Downloads\\chromedriver.exe"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

    }








    @Test(dataProvider = "dataproviderMethod")
    public void logintest(String username, String password, String result) {

        //clearing and entering details ---------------------------------------------------------------------------------
        WebElement usernamebox = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]/div[1]/input"));
        usernamebox.clear();
        usernamebox.sendKeys(username);

        WebElement passwordbox = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        passwordbox.clear();
        passwordbox.sendKeys(password);

        WebElement loginbtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
        loginbtn.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String exp_title = "Dashboard / nopCommerce administration";
        String actual_title = driver.getTitle();

     // POSITIVE TEST
        if (result.equals("vaild")) {
            if (exp_title.equals(actual_title)) {

                driver.findElement(By.xpath("//a[text()='Logout']")).click();
                Assert.assertTrue(true);

            }
            else {
                Assert.assertTrue(false);
            }
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


       //NEGATIVE TEST
        if (result.equals("invaild")) {
            if (exp_title.equals(actual_title)) {
                driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a")).click();
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }








    @DataProvider(name = "dataproviderMethod")
    public Object[][] getdata() {
        String[][] data = {


                {"sadfadv", "admin", "invalid"},
                {"admin@yourstore.com", "admin", "valid"},



        };

        return data;
    }


}
