package for_FinalAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitClass_ {
    WebDriver driver;

    WaitClass_(WebDriver driver) {
        this.driver = driver;
    }

    public void waits() {
      //  _1_DriverClass.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
