package de.dynamicfiles.projects.testproject.cucumberglue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.arquillian.extension.recorder.screenshooter.Screenshooter;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Danny Althoff
 */
public class WebsiteTest {

    @Drone
    private WebDriver browser;

    @ArquillianResource
    private Screenshooter screenshooter;

    @Given("^I go to (.*)$")
    public void visitUrl(String url) {
        browser.get(url);
    }

    @Then("^I take a screenshot$")
    public void takeScreenshot() {
        screenshooter.takeScreenshot();
    }
}
