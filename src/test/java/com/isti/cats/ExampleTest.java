package com.isti.cats;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testValue() {
	Example e = new Example("foo");
	assertEquals(e.getValue(), "foo");
    }

    @Test
    public void testValue2() {
	Example e = new Example("barX");
	assertEquals(e.getValue(), "bar");
    }

}
