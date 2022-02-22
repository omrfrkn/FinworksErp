package com.test.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author ybilgin
 * @project Template
 */

@RunWith(Cucumber.class) //in order to run with junit
@CucumberOptions(
        plugin = {"html:target/default-html-reports"},
        features = "@target/rerun.txt",
        glue = "com/test/step_definitions"
)
public class FailedTestRunner {
}
