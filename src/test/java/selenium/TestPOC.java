package selenium;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

/**
 * Created by Nicochu on 14/12/2016.
 */
public class TestPOC {

    static WebDriver driver;
    static Wait<WebDriver> wait;

    @Test
    public void testHibernateJSP() {
        System.setProperty("webdriver.gecko.driver", "C:\\Apps\\geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://localhost:8088/HibernateJSP");

        System.out.println(driver.findElement(By.xpath("//h2")).toString());

        assertTrue( driver.findElement(By.xpath("//h2")) != null);
    }

    @AfterClass
    public static void killFirefox() {
        driver.quit();
    }
}
