package de.dynamicfiles.projects.testproject.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jboss.arquillian.drone.api.annotation.Qualifier;

/**
 *
 * @author Danny Althoff
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Qualifier
public @interface Firefox {

}
