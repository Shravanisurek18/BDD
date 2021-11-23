package com.mindtree.com.stepdefinition;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mindtree.com.pageobjects.HomePage;
import com.mindtree.com.pageobjects.SearchPage;
import com.mindtree.com.utilities.ReadConfig;

@RunWith(Cucumber.class)
public class SearchStepDefinition extends ReadConfig {
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());


    @Given("^User is on home page$")
    public void user_is_on_home_page() throws IOException {
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

    @When("^User types Adiyogi in search box and clicks enter$")
    public void user_enters_adiyogi_in_search_box() {
        HomePage h=new HomePage(driver);
        h.Search().sendKeys("adiyogi");
		h.Search().sendKeys(Keys.ENTER);
		log.info("Adiyogi is searched");
    }

    @Then("^he clicks on one of the products$")
    public void he_clicks_on_one_of_the_products() {
    	SearchPage s=new SearchPage(driver);
		s.Adiyogi().click();
		log.info("product description page is opened");
    }

   

}