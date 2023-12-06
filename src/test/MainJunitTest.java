package test;

import com.sun.tools.javac.Main;
import firstProject.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainJunitTest {

    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        String message = helloWorld.getMessage();
        assertEquals("Hello, World!", message);
    }
}
