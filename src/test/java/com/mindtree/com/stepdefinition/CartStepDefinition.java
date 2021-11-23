package com.mindtree.com.stepdefinition;

import io.cucumber.java.en.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

public class CartStepDefinition extends ReadConfig {

	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());

    @When("^enters product name in search box$")
    public void enters_product_name_in_search_box() {
    	HomePage h=new HomePage(driver);
		h.Search().sendKeys("scratch world map");
		h.Search().sendKeys(Keys.ENTER);
		log.info("Search page is opened");
	}

    @Then("^select the required item$")
    public void select_the_required_item() {
    	SearchPage s=new SearchPage(driver);
		s.Map().click();
		log.info("Required item is selected");
    }

    @And("^clicks on add to cart$")
    public void clicks_on_add_to_cart() {
    	ProductPage p=new ProductPage(driver);
		p.Add().click();
		log.info("Product is added to the cart");
    }

}