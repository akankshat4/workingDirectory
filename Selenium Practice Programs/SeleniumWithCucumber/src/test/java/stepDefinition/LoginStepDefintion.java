package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefintion {
    WebDriver webDriver;

    @Given("^User is available on the Login page$")
    public void step1_user_is_available(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Study\\Programming\\SeleniumWithCucumber\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.freecrm.com/");
    }

    @When("^Title of the login page is Free CRM$")
    public void step2_title_of_the_page(){
        String expectedTitle = "Free CRM software for customer relationship management, sales, marketing campaigns and support.";
        String title = webDriver.getTitle();
        System.out.println(title);
        Assert.assertEquals(expectedTitle, title);
    }

    @And("^User clicks on login link$")
    public void step3_user_clicks_login_link() {
        // Write code here that turns the phrase above into concrete actions
        webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a")).click();
    }

    @And("^User enters userName$")
    public void step4_user_enters_user_name() throws InterruptedException {
        Thread.sleep(10000);
        webDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("akankshat4@gmail.com");
    }
    @And("^User enters password$")
    public void step5_user_enters_password() {
        webDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("Kra23#Hem");
    }

    @And("^User clicks on login button$")
    public void step6_user_clicks_on_login_button() {
        webDriver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
    }

    @Then("^User should be logged in to the free CRM home page$")
    public void step7_user_should_be_logged_in_to_the_free_crm_home_page() {
        // Write code here that turns the phrase above into concrete actions
        String expectedLoggedInUsername = "AKANKSHA TOMAR";
        String actualLoggedInUsername = webDriver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[2]/span[1]")).getText();
        Assert.assertEquals(expectedLoggedInUsername, actualLoggedInUsername);
    }

    //to terminate browser session
    @And("^Terminate the browser instance$")
    public void terminate_browser_instance(){
        webDriver.quit();
    }
}