package StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Assignment2 {
	static WebDriver driver;
    @Given("user is on saucedemo homepage1")
    public void user_is_on_saucedemo_homepage() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\WTEAutomation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.manage().window().maximize();
    }
    
}
