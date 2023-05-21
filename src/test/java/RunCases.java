import for_FinalAssignment.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RunCases {

    static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException

    {
        //automatic setup------------------------------------------------------------------
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //maximize-----------------------------------------------------
        driver.manage().window().maximize();
        //url---------------------------------------
        driver.get("https://www.saucedemo.com/");
        //waits---------------------------------------------------
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //LOGINPAGE ------------------------------------------------
        LoginPage lo = new LoginPage(driver);
        lo.enterusername().enterpassword().clickloginbtn();
        //DASHBOARD --------------------------------------------------
        Dashboard da = new Dashboard(driver);
        da.clicklink().additem();
        driver.navigate().back();
        da.selectdropdown().threeline();
        //CARTAPPAPGE --------------------------------------------
        CartAppPage ca = new CartAppPage(driver);
        ca.cart().Contishop();
        //AGAIN ORDERING ---------------------------
        da.redtop().additem1();
        // ----------------------------------------------
        ca.shopingicon().checkout();
        //CHECKING OUT
        CheckoutPage co = new CheckoutPage(driver);
        co.enterdetails().conti();
        //---------------------------------------------------------------

        ScreenShots ss = new ScreenShots(driver);
        ss.takingss();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //------------------------------------------------------------------------


        SalesF_Authentication sa = new SalesF_Authentication(driver);
        sa.Url().clickdemo();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //window handles---------------------------------------------------------

        WindowsHandles handles = new WindowsHandles(driver);
        handles.childwindownhandles();

        //------------------------------------------------------------------------
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SalesF_LoginPage sl = new SalesF_LoginPage(driver);
        sl.firstname().lastname().jobtitle().email().comapny().selectdropdown().phone().watchdemo();

        //---------------------------------------------------------------------
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        handles.parentwindownhandles();
        //----------------------------------------------------------------

       /* for_FinalAssignment.Youtube you = new for_FinalAssignment.Youtube(driver);
        you.Url().search().searchbtn();*/
        //---------------------------------------------------------------

        //Mouse hover

        EbayWebsite ebay = new EbayWebsite(driver);
        ebay.Url().mouseonelectronics().Deals();




    }

}

