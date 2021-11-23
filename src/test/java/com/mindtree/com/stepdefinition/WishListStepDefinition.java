package com.mindtree.com.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.ProductPage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDefinition extends ReadConfig{
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@Given("^lands on home page")
    public void lands_on_home_page() throws IOException {
        driver=initializeDriver();
        log.info("Driver is initialized");
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("E:\\EndToEndFramework\\BDDFramework\\Configuration\\config.properties");
		prop.load(fis);
        driver.get(prop.getProperty("webSiteURL"));
		driver.manage().window().maximize();
		log.info("Website is initialized");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
    }
	
	 @When("^enters item name in search box$")
	    public void enters_item_name_in_search_box() {
	    	HomePage h=new HomePage(driver);
			h.Search().sendKeys("Personalized Friends Caricature Wooden Portrait");
			h.Search().sendKeys(Keys.ENTER);
			log.info("Search page is opened");
		}
	 
	 @Then("^select required item$")
	    public void select_required_item() {
		 	SearchPage s=new SearchPage(driver);
			s.Portrait().click();
			log.info("Required item is selected");
	    }
	 
	 @And("^clicks on add to wishlist$")
	    public void clicks_on_add_to_wishlist() {
		 	ProductPage p=new ProductPage(driver);
			p.Click().click();
			log.info("Product is added to wishlist");
	 }
}
