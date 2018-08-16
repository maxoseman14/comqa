import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ca.I;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class stepDefs {

    static ChromeDriver driver;


    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown (){
        driver.quit();
    }

    @Given("^the correct web address$")
    public void the_correct_web_address()  {
        driver.get(constants.url);
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() {
        homePage home = PageFactory.initElements(driver, homePage.class);
        home.menuClick();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() {
        assertEquals("Green Tea", driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")).getText());
    }


    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() {

    }


    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page()  {

    }

}
