package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\resources\\FeatureFiles\\eConsentNavigations.feature", 
glue = "steps", 
tags = "{@tag11, @tag12}",
monochrome= true,
plugin = {"pretty","html:test-output/cucumber_result"}
)
public class RunCucumber {

	
}
