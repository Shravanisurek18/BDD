package com.mindtree.com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.com.pageobjects.CartPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.Then;

public class GiftCardStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());

	
	@Then("click on check box and enter details")
	public void click_on_check_box_and_enter_details() throws InterruptedException {
		Thread.sleep(5000);
		CartPage c=new CartPage(driver);
		c.CheckBox().click();
		log.info("Gift card is selected successfully");
		c.From().sendKeys("Shravani");
		log.info("Name of sender is entered");
		c.To().sendKeys("Kavya");
		log.info("Name of receiver is entered");
		c.Message().sendKeys("Happy Birthday");
		log.info("message is entered successfully");
	}

}
