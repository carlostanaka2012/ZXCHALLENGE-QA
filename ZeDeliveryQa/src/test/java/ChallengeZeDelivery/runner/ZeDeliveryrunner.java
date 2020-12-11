package ChallengeZeDelivery.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

public class ZeDeliveryrunner {
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src//test//resources//Feature//ChallengeDeliveryQa",
			glue="src//test//resources",
			plugin="pretty", monochrome=true, snippets=SnippetType.CAMELCASE, dryRun=true,strict=true)
	public class Runner {
		
		
		

	}

}
