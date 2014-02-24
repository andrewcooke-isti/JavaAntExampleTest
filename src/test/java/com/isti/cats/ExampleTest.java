
package com.isti.cats;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void testValue() {
	Example e = new Example("foo");
	assert e.getValue().equals("foo");
    }

    @Test
    public void testValue2() {
	Example e = new Example("foo");
	assert e.getValue().equals("bar");
    }

}
