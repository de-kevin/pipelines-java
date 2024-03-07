import com.microsoft.demo.Demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void testHelloWolrdFunction() {
        Demo d = new Demo();
        String result = d.PrintHelloWorld();
        assertEquals("Hello World!", result);
    }

    @Test
    public void test_method_2() {
    }
}