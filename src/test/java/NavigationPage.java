import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    public NavigationPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="search_query_top")
    WebElement searchInput;

    @FindBy(name="submit_search")
    WebElement searchBtn;

    public void searchDress (String name) {


    }
}
