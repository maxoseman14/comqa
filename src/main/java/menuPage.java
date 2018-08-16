import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class menuPage {

    @FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
    WebElement checkOut;

    @FindBy (xpath = "wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
    WebElement greenText;


    public void clickCheckOut (){
        checkOut.click();
    }

    public Boolean greenTea (){
        String text = greenText.getText();
        if(text.equals("Green Tea")){
            return true;
        } else {
            return false;
        }
    }
}
