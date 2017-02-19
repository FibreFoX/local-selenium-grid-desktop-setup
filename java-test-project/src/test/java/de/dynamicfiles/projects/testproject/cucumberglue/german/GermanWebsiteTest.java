package de.dynamicfiles.projects.testproject.cucumberglue.german;

import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import org.arquillian.extension.recorder.screenshooter.Screenshooter;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Danny Althoff
 */
public class GermanWebsiteTest {

    @Drone
    private WebDriver browser;

    @ArquillianResource
    private Screenshooter screenshooter;

    @Angenommen("^ich gehe auf die Website mit URL (.*)$")
    public void visitUrl(String url) {
        browser.get(url);
    }

    @Dann("^mache ich einen Screenshot$")
    public void takeScreenshot() {
        screenshooter.takeScreenshot();
    }
}
