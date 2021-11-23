package com.mindtree.com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.TrackYourOrderPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class TrackYourOrderStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());

	
	@When("clicks on track your order")
	public void clicks_on_track_your_order() {
		HomePage h=new HomePage(driver);
		h.Track().click();
		log.info("Track order page is invoked");
	}

	@Then("enter details and click find order")
	public void enter_details_and_click_find_order() {
		TrackYourOrderPage t=new TrackYourOrderPage(driver);
		t.EmailAddress().sendKeys("surekutchishravani@gmail.com");
		log.info("email is entered");
		t.OrderNumber().sendKeys("TC0909056");
		log.info("order number is entered");
		t.FindOrder().click();
		log.info("status of the order is displayed");
	}

}
