import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        String pageTitle ="";
        String url = "http://automationpractice.com/index.php";
        String expectedTitle = "My Store";
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle,expectedTitle);
        driver.close();
    }
}
