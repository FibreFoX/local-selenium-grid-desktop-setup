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
        glue = "de.dynamicfiles.projects.testproject.cucumberglue.german",
        features = "src/test/resources/cucumber/besucheWebsite.feature",
        plugin = {"pretty", "html:target/cucumber"}
)
public class SimpleGermanCucumberWebsiteTest {

}
