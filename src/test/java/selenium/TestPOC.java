package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nicochu on 14/12/2016.
 */
public class TestPOC {

    static WebDriver driver;
    static Wait<WebDriver> wait;

    @Test
    public void testHibernateJSP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Apps\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://localhost:8088/HibernateJSP");

        System.out.println(driver.findElement(By.xpath("//h2")).toString());

        try {
            driver.findElement(By.xpath("//h2"));
        }
        catch (NoSuchElementException e) {
            assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    public void testHibernateJSP2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Apps\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://localhost:8088/HibernateJSP");

        try {
            driver.findElement(By.xpath("//h3"));
        }
        catch (NoSuchElementException e) {
            assertEquals(true,false);
        }
        assertTrue(true);
    }

    @After
    public void killFirefox() {
        driver.quit();
    }
}
