package org.StepDefinitionFile;

import java.io.IOException;

import org.Utilities.BaseClass;
import org.Utilities.Basepojo;
import org.Utilities.FBLoginPojo;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample extends Basepojo {
	@Given("User should launch the chrome browser and load the url")
	public void user_should_launch_the_chrome_browser_and_load_the_url() {
		launchChrome();
		loadURL("https://www.facebook.com");
		maxwindow();
	    
	}

	@When("User should type username")
	public void user_should_type_username() throws IOException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtuser(), getdata(1, 2));
	    
	}

	@When("User should type password")
	public void user_should_type_password() throws IOException {
		FBLoginPojo f = new FBLoginPojo();
		fill(f.getTxtpass(), getdata(2, 1));
	    
	}
	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		FBLoginPojo f = new FBLoginPojo();
		clickbutton(f.getBtnlogin());
		Thread.sleep(2000);
	   
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify the incorrect credential page", currentUrl.contains("privacy"));
		System.out.println("Invalid username and Invalid password test case is passed");
	   
	
	}


}
