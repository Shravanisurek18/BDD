package com.mindtree.com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.com.pageobjects.BirthdayGiftPage;
import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.KidsGifts;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class GiftsDropDownStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	
	@When("Hovers on gifts main menu, sub menu and clicks birthday gifts")
	public void hovers_on_gifts_main_menu_sub_menu_and_clicks_birthday_gifts() {
		HomePage h=new HomePage(driver);
		h.dropDown();
		log.info("birthday gifts is selected from dropdown");
	}

	@Then("click on birthday gifts for kids")
	public void click_on_birthday_gifts_for_kids() {
		BirthdayGiftPage bp=new BirthdayGiftPage(driver);
		bp.KidGift().click();
		log.info("gifts for kids is selected from birthday gifts");
	}

	@Then("clicks on product")
	public void clicks_on_product() {
		KidsGifts kg = new KidsGifts(driver);
		kg.Gift().click();
		log.info("Gift description page is displayed");
	}

}
