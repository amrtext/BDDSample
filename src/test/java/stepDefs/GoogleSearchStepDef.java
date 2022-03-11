package stepDefs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchStepDef {
	
	WebDriver driver;

	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
		}
	    
	
	@When("User enters Java Tutorial")
	public void user_enters_java_tutorial() {
	
		WebElement searchbox =   driver.findElement(By.cssSelector(".gLFyf.gsfi"));
  
        searchbox.sendKeys("Java Tutorial");
        searchbox.submit();
  
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
	    
		org.junit.Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}

	@When("User enters Selenium Tutorial")
	public void user_enters_Selenium_tutorial() {
	
		WebElement searchbox =   driver.findElement(By.cssSelector(".gLFyf.gsfi"));
  
        searchbox.sendKeys("Selenium Tutorial");
        searchbox.submit();
  
	}
	@Then("Should display Selenium result page")
	public void should_display_Selenium_result_page() {
	    
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google  ");
	}

    @After
    public void generateScreenshot(Scenario scenario) throws IOException {
    	
    	if(scenario.isFailed()) {
    		TakesScreenshot screen = (TakesScreenshot)driver;
    		File file = screen.getScreenshotAs(OutputType.FILE);
    		byte[] imgByte = FileUtils.readFileToByteArray(file);
    		scenario.attach(imgByte, "image/png", "image1");
    	}
    
    	
    }

}
