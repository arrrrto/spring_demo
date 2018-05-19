package com.arto.demo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DemoApplicationTests {
private Demo demo = new Demo();
@Test
public void testSum() {
assertEquals(5, demo.sum(2, 3));
}
}
