package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

public class Test2Runner {
	 

	@RunWith(Cucumber.class) 
	@Cucumber.Options(features="features",glue={"StepDefinition"})

	public class runTest { }
}
