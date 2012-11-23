package example;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Тесты для Hello world
 */
public class HelloWorldTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSayHelloWorldFrom() throws Exception {
        HelloWorld hw = new HelloWorld();
        Assert.assertEquals("Hello world from Denis!", hw.sayHelloWorldFrom("Denis"));
    }
}
