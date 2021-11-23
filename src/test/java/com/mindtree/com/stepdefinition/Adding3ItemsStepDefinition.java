package com.mindtree.com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;

import com.mindtree.com.pageobjects.CartPage;
import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.*;

public class Adding3ItemsStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@When("enters friends bobbleheads in search box")
	public void enters_friends_bobbleheads_in_search_box() {
		HomePage h=new HomePage(driver);
		h.Search().sendKeys("friends bobbleheads");
		h.Search().sendKeys(Keys.ENTER);
		log.info("Search page is opened");
	}

	@Then("user click on gift item")
	public void user_click_on_gift_item() {
		SearchPage s=new SearchPage(driver);
		s.Bobbleheads().click();
		log.info("Product description page is opened");
	}

	@Then("clicks on continue shopping")
	public void clicks_on_continue_shopping() {
		CartPage c=new CartPage(driver);
		c.Cont().click();
		log.info("Shopping can be continued");
	}

	@Then("clicks on another item")
	public void clicks_on_another_item() {
		ProductPage p=new ProductPage(driver);
		p.Monica().click();
		log.info("Another product can be selected");
	}

	@Then("click on third item")
	public void click_on_third_item() {
		ProductPage p=new ProductPage(driver);
		p.Joey().click();
		log.info("Another product can be selected");
	}

}
