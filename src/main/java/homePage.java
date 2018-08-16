import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

    @FindBy (xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
    WebElement menu;

    public void menuClick() {
        menu.click();
    }

}
