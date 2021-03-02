package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class vrbo {
	WebDriver driver;
	@Given("^launch vrbo website$")
	public void launch_vrbo_website() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	     driver.get("https://www.vrbo.com/");
	}

	@When("^i click on search field$")
	public void i_click_on_search_field() throws Throwable {
		driver.findElement(By.id("react-destination-typeahead")).sendKeys("United States of America");
		driver.findElement(By.xpath("//*[@data-suggestion-key='3']")).click();
		driver.findElement(By.id("input1-dates")).sendKeys("click");
		 driver.findElement(By.xpath("//*[@aria-label='June 18, 2020']")).click();
		 driver.findElement(By.id("input2-dates")).sendKeys("click");
		 driver.findElement(By.xpath("//*[@aria-label='June 21, 2020']")).click();
	}

	@Then("^it will show list of places$")
	public void it_will_show_list_of_places() throws Throwable {
	    
	}

	@When("^i click on arive and departure date fields$")
	public void i_click_on_arive_and_departure_date_fields() throws Throwable {
		 
	    
	}

	@Then("^it show the date$")
	public void it_show_the_date() throws Throwable {
	   
	}

	@When("^select the all feilds click on search$")
	public void select_the_all_feilds_click_on_search() throws Throwable {
	   
	}

	@Then("^it need to display according to our search places$")
	public void it_need_to_display_according_to_our_search_places() throws Throwable {
	   
	}

}
