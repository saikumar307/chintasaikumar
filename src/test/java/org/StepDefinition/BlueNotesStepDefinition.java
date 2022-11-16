package org.StepDefinition;

import org.utilities.BaseClass;
import org.utilities.pojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlueNotesStepDefinition extends BaseClass {
	public static pojoclass pc;
	@Given("User should launch the chrome and load the url and maximize the window")
	public void user_should_launch_the_chrome_and_load_the_url_and_maximize_the_window() {
	   browserLaunch();
	   get("https://blnts.com/");
	   driver.manage().window().maximize();
	}

	@When("User should type the invalid username and invalid password")
	public void user_should_type_the_invalid_username_and_invalid_password() {
	   pojoclass pc=new pojoclass();
		pc.getBtnlogin().click();
		pc.getTxtuser().sendKeys("98745632");
		pc.getTxtpass().sendKeys("875455");
		
		
		
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		   pojoclass pc=new pojoclass();
		   pc.getClickbtn().click();
		   Thread.sleep(2000);
	   
	}

	@Then("User should navigate to incorrect credential page and close  browser")
	public void user_should_navigate_to_incorrect_credential_page_and_close_browser() {
	   closeBrowser();
	   System.out.println("test case is passed");
	}

	@When("User should type the valid username and invalid password")
	public void user_should_type_the_valid_username_and_invalid_password() {
		   pojoclass pc=new pojoclass();
			pc.getBtnlogin().click();
		pc.getTxtuser().sendKeys("greens@gmail.com");
	   pc.getTxtpass().sendKeys("123456789");
	}

	@Then("User should navigate to incorrect credential page and close the browser")
	public void user_should_navigate_to_incorrect_credential_page_and_close_the_browser() {
		   closeBrowser();
	}
	pojoclass c=new pojoclass();
	@When("User should type the valid username and valid password")
	public void user_should_type_the_valid_username_and_valid_password() {
		   pojoclass pc=new pojoclass();
			pc.getBtnlogin().click();
	    pc.getTxtuser().sendKeys("greens@gmail.com");
	    pc.getTxtpass().sendKeys("98745632");
	}

	@Then("User should navigate to correct credential page and close the browser")
	public void user_should_navigate_to_correct_credential_page_and_close_the_browser() {
	   System.out.println("test case is passed");
	   closeBrowser();
	}

	@When("User should not type the  username and  password")
	public void user_should_not_type_the_username_and_password() {
		   pojoclass pc=new pojoclass();
			pc.getBtnlogin().click();
	    pc.getTxtuser().sendKeys("");
	    pc.getTxtpass().sendKeys("");
	}

	@When("User should click the men shopping button")
	public void user_should_click_the_men_shopping_button() {
		   pojoclass pc=new pojoclass();
		click(pc.getGetMen());
	}

	@Then("User should navigate to mens clothing page and close the browser")
	public void user_should_navigate_to_mens_clothing_page_and_close_the_browser() {
	   System.out.println("new page is opened which contains only mens clothing");
	   closeBrowser();
	}

	@When("User should click the women shopping button")
	public void user_should_click_the_women_shopping_button() {
		   pojoclass pc=new pojoclass();
		click(pc.getGetWomen());
	}

	@Then("User should navigate to women clothing page and close the browser")
	public void user_should_navigate_to_women_clothing_page_and_close_the_browser() {
		System.out.println("new page is opened which contains only Womens clothing");
		  closeBrowser();
	}

	@When("User should click the men shopping button and select one and add it to bag")
	public void user_should_click_the_men_shopping_button_and_select_one_and_add_it_to_bag() {
		   pojoclass pc=new pojoclass();
		click(pc.getGetMen());
	   click(pc.getGetMenShirt());
	   click(pc.getGetBag());
	}

	@Then("User should close the browser")
	public void user_should_close_the_browser() {
	   System.out.println("item is added to bag successfully");
	   closeBrowser();
	}

	@When("User should click the women shopping button and select one and add it to bag")
	public void user_should_click_the_women_shopping_button_and_select_one_and_add_it_to_bag() {
		   pojoclass pc=new pojoclass();
		click(pc.getGetWomen());
			click(pc.getGetwomanshirt());
			click(pc.getGetBag());
	}

	@When("User should type the invalid username{string} and valid password{string}")
	public void user_should_type_the_invalid_username_and_valid_password(String s1, String s2) {
		   pojoclass pc=new pojoclass();
			pc.getBtnlogin().click();
	    pc.getTxtuser().sendKeys(s1);
	    pc.getTxtpass().sendKeys(s2);
	}


	
}