package org.javaee7.cdi.beansxml.noversion;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import jakarta.inject.Inject;
import jakarta.enterprise.inject.Instance;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * @author Alexis Hassler
 */
@RunWith(Arquillian.class)
public class GreetingTest {
    @Deployment
    public static Archive<?> deploy() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClasses(AnnotatedBean.class, NotAnnotatedBean.class)
            .addAsManifestResource("beans.xml");
    }

    @Inject
    AnnotatedBean annotatedBean;
    @Inject
    Instance<NotAnnotatedBean> notAnnotatedBean;

    @Test
    public void should_bean_be_injected() throws Exception {
        assertThat(annotatedBean, is(notNullValue()));

        // notAnnotatedBean is not injected because CDI 4.0 acts as the mode was annotated
        assertFalse(notAnnotatedBean.isResolvable());
    }
}