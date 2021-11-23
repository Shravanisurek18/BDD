package com.mindtree.com.stepdefinition;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mindtree.com.pageobjects.BirthdayGiftPage;
import com.mindtree.com.utilities.ReadConfig;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class ValidateTitleStepDefinition extends ReadConfig{
	
	public static Logger log = LogManager.getLogger(ReadConfig.class.getName());
	
	@And("validate the title")
	public void validate_the_title() {
		BirthdayGiftPage bp=new BirthdayGiftPage(driver);
		String text;
		text=bp.Title().getText();
		log.info("Got the title");
		try{
			Assert.assertEquals(text, "Birthday Gifts For Kids");
		}catch(AssertionError e){
			System.out.println("not equal");
			throw e;
		}
			log.info("Title validation done");
			System.out.println("Equal");
	}
}
