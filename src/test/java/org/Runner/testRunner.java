package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
glue="org.StepDefinition",dryRun=false, monochrome=true, snippets=SnippetType.CAMELCASE)

public class testRunner {

}
