import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownList {

    private WebDriver driver;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://automationpractice.com/index.php";
        driver.get(url);

    }
    @Test
    public void ContactUs(){
        driver.findElement(By.id("contact-link")).click();
        WebElement testDropDown = driver.findElement(By.id("id_contact"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(testDropDown));
        Select DropDown = new Select(testDropDown);
        DropDown.selectByValue("2");

        }



}
