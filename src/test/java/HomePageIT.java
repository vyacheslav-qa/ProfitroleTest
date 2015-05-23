import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by first on 19.05.2015.
 */
public class HomePageIT {

   // private String baseUrl = "http://gioia-profiterole.rhcloud.com";

    @BeforeClass
    public static void initChromeDriver() {
        System.out.println("Test - " + System.getProperty("webdriver.chrome.driver"));
        System.setProperty("webdriver.chrome.driver", "D:\\Project\\ProfitroleTest\\chromedriver.exe");
    }
//asdads
    @Test
    public void homePageSearchTest() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("http://gioia-profiterole.rhcloud.com/");
        WebElement searhString = driver.findElement(By.className("search-query"));
        //findElement(By.searhString);
        searhString.sendKeys("Борщ");
        assertEquals("Борщ", driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[2]/p")).getText());


/*    @AfterClass
    public void closeBrowser() throws Exception {
        driver.quit();
    }*/
    }
}