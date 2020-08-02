import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {

    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void checkPageTitle(){
        String pageTitle ="";
        String url = "http://automationpractice.com/index.php";
        String expectedTitle = "My Store";

        driver.get(url);

        pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle,expectedTitle);
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
