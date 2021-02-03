package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Features"},
                glue={"StepDefinitions"},
                tags= "@Test1,@Test2,@Test3,@Test3" )

public class Runner {

}
