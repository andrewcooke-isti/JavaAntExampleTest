
package com.isti.cats;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void testValue() {
	Example e = new Example("foo");
	assert e.getValue().equals("foo");
    }

}
