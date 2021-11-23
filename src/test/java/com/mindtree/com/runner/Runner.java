package com.mindtree.com.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\EndToEndFramework\\BDDFramework\\src\\test\\java\\com\\mindtree\\com\\features",
		glue={"com.mindtree.com.stepdefinition"},
		dryRun = false,
		monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

}
