package aRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
	//BDD BEAHVIROL DRIVEN DVELOPMENT
@RunWith(Cucumber.class)
@CucumberOptions(
		//the path of the feature file
		features = { "src/test/resources" },
		//to generate different types of reporting
		plugin = { "pretty","html:out","junit:junit_xml/cucumber.xml" }, 
		snippets = SnippetType.CAMELCASE,
		//the path of the step definition files
		glue ={ "nmktstepsdefination"} 
		//display the console output in a proper readable format
		//monochrome = true,
		//it will check if any steps are not defined in step definition file(true)
		//strict = false,
		//to map feature file with step definition file(true==mapping not running)
		//dryRun = false
		//tags = {"~@SmokeTest","~@RegressionTest","~@End2End"}
		
		)

public class RunCukesTest {

}
//,"junit:junit_xml/cucumber.xml"
//json:json_output/cucmber.json ==to generate json reporting format

	//excute all tests tagged as @SmokeTest OR RegressionTest
//OR ; tags = {"@Smokeatest,@RegressionTest"}

//excute all testd tagged as @SmokeTest and @REgressionTest
//AND ; tags = {"@SmokeTest","@RegressionTest"}

// ignore operator (~) insert ~ before A tag iy will ignore it