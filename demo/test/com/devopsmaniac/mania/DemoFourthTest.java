package com.devopsmaniac.mania;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

/**
* Tests, one of which is ignored.
*/
public class DemoFourthTest {

	@Test 
	public void betterName() {
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
	@Ignore
	public void skippingMe() {
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
        public void hello() {
                assertEquals( Demo.somethingRandom(), 1);
        }

	@Test
        public void goodBye() {
                assertEquals( Demo.somethingRandom(), 1);
        }
}
