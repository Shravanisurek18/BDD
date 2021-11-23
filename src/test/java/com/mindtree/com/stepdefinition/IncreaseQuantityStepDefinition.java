package com.mindtree.com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.MinionGiftsPage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class IncreaseQuantityStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@When("hovers on shop by category main menu, shop by person sub menu and click on minion lover")
	public void hovers_on_shop_by_category_main_menu_shop_by_person_sub_menu_and_click_on_minion_lover() {
		HomePage h=new HomePage(driver);
		h.dropDown2();
		log.info("minion lover is selected from dropdown");
	}

	@Then("click on minion product")
	public void click_on_minion_product() {
		MinionGiftsPage m=new MinionGiftsPage(driver);
		m.Figure().click();
		log.info("Product is selected");
	}

	@Then("Increase the quantity and click on add to cart")
	public void increase_the_quantity_and_click_on_add_to_cart() {
		ProductPage p=new ProductPage(driver);
		p.Increase().click();
		p.Add().click();
		log.info("Quantity is increased and added to cart");
	}

}
