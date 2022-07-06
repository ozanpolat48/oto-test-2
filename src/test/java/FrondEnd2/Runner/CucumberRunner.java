package FrondEnd2.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/return.txt"
        },

        features = "src/test/resources/features",
        glue = "FrondEnd2/StepDefinitions",
        dryRun = false,
        tags = "@testing2"
)
public class CucumberRunner {
}
