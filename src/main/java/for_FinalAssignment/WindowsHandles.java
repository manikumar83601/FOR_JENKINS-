package for_FinalAssignment;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandles {

    WebDriver driver;
    public WindowsHandles(WebDriver driver) {
        this.driver = driver;
    }

    public WindowsHandles childwindownhandles() {


        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);
        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        System.out.println(parentwindow);
        String childwindow = iterator.next();
        System.out.println(childwindow);
        driver.switchTo().window(childwindow);

        return this;

    }
    public WindowsHandles parentwindownhandles() {


        Set<String> windowhandles = driver.getWindowHandles();

        Iterator<String> iterator = windowhandles.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();
        driver.switchTo().window(parentwindow);

        return this;

    }
}


