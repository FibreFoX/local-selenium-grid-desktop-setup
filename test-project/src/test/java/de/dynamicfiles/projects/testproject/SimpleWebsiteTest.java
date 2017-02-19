package de.dynamicfiles.projects.testproject;

import java.util.concurrent.TimeUnit;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.Graphene;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
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
        browser.get("https://www.dynamicfiles.de");
        Graphene.waitGui().withTimeout(2, TimeUnit.SECONDS);
        Assert.fail();
    }
}
