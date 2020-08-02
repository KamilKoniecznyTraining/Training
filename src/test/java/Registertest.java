import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registertest {

    private WebDriver driver;
    private WebElement error;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        driver.get(url);

    }

    @Test
    public void Register(){
        driver.findElement(By.id("email_create")).sendKeys("poczta@poczta.pl");
        driver.findElement(By.id("SubmitCreate")).click();

        //String error= driver.findElement(By.id("create_account_error")).getText();
        error= driver.findElement(By.id("create_account_error"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(error));
        Assert.assertTrue(error.isDisplayed());
    }

}
