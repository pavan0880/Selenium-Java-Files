package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook {
	WebDriver driver;
		@Given("user navigates to Facebook")
		public void user_navigates_to_Facebook() throws Exception {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
		    
		}

		@When("I enter Username as {string} and Password as {string}")
		public void i_enter_Username_as_and_Password_as(String string, String string2) {
			CharSequence arg1 = null;
			driver.findElement(By.id("email")).sendKeys(arg1);
		      CharSequence arg2 = null;
			driver.findElement(By.id("pass")).sendKeys(arg2);
		      driver.findElement(By.id("u_0_v")).click(); 
		   
		}

		@Then("login should be unsuccessful")
		public void login_should_be_unsuccessful() {
			 if(driver.getCurrentUrl().equalsIgnoreCase(
				      "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
				         System.out.println("Test Pass"); 
				      } else { 
				         System.out.println("Test Failed"); 
				      } 
				      driver.close(); 
				    
		   
		}



	}


