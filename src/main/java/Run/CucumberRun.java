package Run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dell on 11.7.2017 г..
 */

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        tags = {"@Igor1"},
        features = "src/main/java/TestDefiniotions2/",
        glue = {"CalculatorSteps"})

public class CucumberRun {

}







/*
src/main/java/TestDefiniotions2
CalculatorSteps
src/main/java/TestDefinitions
MyStepdefs



        features = "src/main/resources/",
        glue = {"StepDefs"})
 */