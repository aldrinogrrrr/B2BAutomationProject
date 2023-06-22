import io.cucumber.java.After;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue= {"stepDefinitions"},
        //change the tag for your targeted feature file/s to run
        //tags= "@Run",
        //to run solo use below tag
        tags = "@RunSolo",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "rerun:target/cucumber-reports/rerun.txt",
                "json:target/cucumber-reports/CucumberTestReport.json"
        })

public class TestRunner {


    //@Override
    //@DataProvider
    //public Object[][] scenarios() {return super.scenarios(); }

}