package de.dynamicfiles.projects.testproject;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Danny Althoff
 */
@RunWith(Arquillian.class)
@RunAsClient
public class SimpleWebsiteTest {

    @Drone
    private WebDriver browser;

    @Test
    public void firstSimpleTest() {
        browser.manage().window().setSize(new Dimension(1024, 768));
        browser.get("https://www.dynamicfiles.de");
    }
}
