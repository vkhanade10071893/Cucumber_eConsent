package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base.POMBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class eConsentSteps extends POMBase{

	//public eConsentSteps() {
	//	super.launchBrowser();
	//}
	
	@Given("I navigate to the  Home Page {string} of Medidata website")
	public void i_navigate_to_the_Home_Page_of_Medidata_website(String string) {
		super.launchBrowser();
		driver.get(string);
	}

	@Given("I move to Products Services Menu")
	public void i_move_to_Products_Services_Menu() {
		driver.findElement(By.xpath("//li[@id='menu-item-160']//a[contains(text(),'Products & Services')]")).click();;
		
	}

	@Given("click on {string} link")
	public void click_on_link(String string) {
		 driver.findElement(By.linkText(string)).click();;
		
	}

	@Then("I should see eConsent page")
	public void i_should_see_eConsent_page() throws InterruptedException {
		Thread.sleep(5000);
		String actual = driver.getTitle();
		String expected = "Rave eConsent | Medidata Solutions";
		org.junit.Assert.assertEquals("Assert Failed", expected, actual);
	}
	
	///////////////////////////******************////////////////////////////
	
	@Given("I click on watch eConsent Webinar link")
	public void i_click_on_watch_eConsent_Webinar_link() {
	    driver.findElement(By.xpath("//a[contains(text(),'Watch eConsent Webinar')]")).click();
		
	}

	@Then("I should see Webinar registation page")
	public void i_should_see_Webinar_registation_page() throws InterruptedException {
		Thread.sleep(5000);
		String actual = driver.findElement(By.xpath("//h1[@class='text-headline']")).getText();
		String expected = "Watch the eConsent for Clinical Trials Webcast with Roche and Medidata";
		org.junit.Assert.assertEquals("Assert Failed-Webinar Registation page not found", expected, actual);
		
	}

	@When("I click on watch the webcast button")
	public void i_click_on_watch_the_webcast_button() {
	    driver.findElement(By.xpath("//input[@value='Watch the Webcast']")).click();
		
	}

	@Then("I should see error message.")
	public void i_should_see_error_message() throws InterruptedException {
	    
		
		String expected = "Please select that you've read our Privacy Policy.";
		WebElement ele = driver.findElement(By.xpath("//div[@class='msg']//span"));
		String actual = ele.getAttribute("data-privacy");
		
		org.junit.Assert.assertEquals("Assert Failed-Error Message not found", expected, actual);
	
	}
	
	/////////////////////////////***********************/////////////////////////
	
	@Given("I am on webinar registration page")
	public void i_am_on_webinar_registration_page() {
		String actual = driver.findElement(By.xpath("//h1[@class='text-headline']")).getText();
		String expected = "Watch the eConsent for Clinical Trials Webcast with Roche and Medidata";
		org.junit.Assert.assertEquals("Assert Failed-Webinar Registation page not found", expected, actual);
	}

	@Given("I enter First Name {string}")
	public void i_enter_First_Name(String string) {
	   driver.findElement(By.xpath("//input[@placeholder='First Name*']")).sendKeys(string);
	}

	@Given("I enter Last Name {string}")
	public void i_enter_Last_Name(String string) {
	    driver.findElement(By.xpath("//input[@placeholder='Last Name*']")).sendKeys(string);
	}

	@Given("I enter Business Email {string}")
	public void i_enter_Business_Email(String string) {
	   driver.findElement(By.xpath("//input[@placeholder='Business Email*']")).sendKeys(string);
	}

	@Given("I enter Phone Number {string}")
	public void i_enter_Phone_Number(String string) {
		driver.findElement(By.xpath("//input[@placeholder='Business Phone*']")).sendKeys(string);
	}

	@Given("I enter Title {string}")
	public void i_enter_Title(String string) {
		driver.findElement(By.xpath("//input[@placeholder='Title*']")).sendKeys(string);
	}

	@Given("I select Level {string}")
	public void i_select_Level(String string) {
		WebElement webel1 = driver.findElement(By.xpath("//span[contains(text(),'Level*')]"));
		WebElement webel2 = driver.findElement(By.xpath("(//input[@class='chosen-search-input'])[1]"));
		webel2.sendKeys(string + Keys.ENTER);
	}

	@Given("I select Functional Area {string}")
	public void i_select_Functional_Area(String string) {
		
		WebElement webel1 = driver.findElement(By.xpath("//span[contains(text(),'Functional Area*')]"));
		WebElement webel2 = driver.findElement(By.xpath("(//input[@class='chosen-search-input'])[2]"));	
		webel2.sendKeys(string + Keys.ENTER);
	}

	@Given("I enter Company {string}")
	public void i_enter_Company(String string) {
		driver.findElement(By.xpath("//input[@placeholder='Company*']")).sendKeys(string);
	}

	@Given("I select Country {string}")
	public void i_select_Country(String string) {
		
		WebElement webel1 = driver.findElement(By.xpath("//span[contains(text(),'Country*')]"));
		WebElement webel2 = driver.findElement(By.xpath("(//input[@class='chosen-search-input'])[3]"));
		webel2.sendKeys(string + Keys.ENTER);
	}

	@Given("I select the policy acceptance checkboxs")
	public void i_select_the_policy_acceptance_checkboxs() {
	
		//WebElement chkbox = driver.findElement(By.xpath("//input[@name='f-policy']"));
		WebElement chkbox = driver.findElement(By.xpath("//i[@class='form-icon']"));
		chkbox.click();
		
	}


}
