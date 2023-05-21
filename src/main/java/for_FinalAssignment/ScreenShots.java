package for_FinalAssignment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShots {
    WebDriver driver;
    public ScreenShots(WebDriver driver){
        this.driver=driver;
    }

    public  ScreenShots takingss() throws IOException {

        Date date = new Date();
      String sss=   date.toString().replace(" ","-").replace(":","-");
        System.out.println(sss);
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("C:\\Users\\manik\\Desktop\\"+sss+".png"));
        return this;
    }


}
