package com.mindtree.com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;


import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class EstimatedDeliveryStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@When("enters product name in the search box")
	public void enters_product_name_in_the_search_box() {
		HomePage h=new HomePage(driver);
		h.Search().sendKeys("Bonsai tree LED lamp");
		h.Search().sendKeys(Keys.ENTER);
		log.info("Search page is selected");
	}

	@Then("Selects the required item")
	public void selects_the_required_item() {
		SearchPage s=new SearchPage(driver);
		s.Product().click();
		log.info("Product description page is opened and item is selected");
	}

	@Then("Enters pincode and click on check button")
	public void enters_pincode_and_click_on_check_button() {
		ProductPage p=new ProductPage(driver);
		p.Pincode().sendKeys("500018");
		log.info("pincode is entered successfully");
		p.Check().click();
		log.info("Check button is clicked and delivery date is displayed");
	}
}
