import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Dress {
    private WebDriver driver;
    private List<WebElement> dresses;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://automationpractice.com/index.php";
        driver.get(url);

    }

    @Test
    public void doCount(){
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");
        driver.findElement(By.name("submit_search")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.titleIs("Search - My Store"));
        //String title = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();
        dresses= driver.findElements(By.xpath("//div[@class='product-image-container']"));
        //Assert.assertEquals("7 results have been found.",title);
        System.out.println(dresses.size());
        //System.out.println(title);

    }
}
