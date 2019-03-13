package com.devopsmaniac.mania;
/con

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

public class DemoSecondTest {

	@Test
	public void somethingRandom() {
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
	@Ignore
	public void ignoreMePlease() {
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
        public void yetAnother() {
                assertEquals( Demo.somethingRandom(), 1);
        }

	@Test
        public void evenAnother() {
                assertEquals( Demo.somethingRandom(), 1);
        }
}
