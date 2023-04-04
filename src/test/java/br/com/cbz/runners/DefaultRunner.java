package br.com.cbz.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/br/com/cbz/features",
        glue = "br/com/cbz/steps",
        tags = "@wip",
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm", "pretty", "json:target/cucumber-report/report.json" },
        monochrome = true
)

public class DefaultRunner {
}