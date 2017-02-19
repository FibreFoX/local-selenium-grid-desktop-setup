package de.dynamicfiles.projects.testproject;

import cucumber.api.CucumberOptions;
import cucumber.runtime.arquillian.ArquillianCucumber;
import cucumber.runtime.arquillian.api.Glues;
import de.dynamicfiles.projects.testproject.cucumberglue.WebsiteTest;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.junit.runner.RunWith;

/**
 *
 * @author Danny Althoff
 */
@RunWith(ArquillianCucumber.class)
@RunAsClient
@CucumberOptions(
        glue = "de.dynamicfiles.projects.testproject.cucumberglue",
        features = "src/test/resources/cucumber/visitWebsite.feature",
        plugin = {"html:target/cucumber"}
)
@Glues(WebsiteTest.class)
public class SimpleCucumberWebsiteTest {

}
