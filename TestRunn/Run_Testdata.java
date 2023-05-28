package TestRunn;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rohim\\eclipse-workspace\\Cucumber_Project\\Features\\Testdata.feature", 
glue={"Step_definations","Hooks"},

monochrome=true,
dryRun=true,
plugin= {
		"pretty", "html:reports/myreport.html", 
		"json:reports/myreport.json"
})


public class Run_Testdata {

}
