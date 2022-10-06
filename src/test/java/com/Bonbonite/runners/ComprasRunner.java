package com.Bonbonite.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/compras.feature",
        glue = "com.Bonbonite",
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")

public class ComprasRunner {


}
