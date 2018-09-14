package com.devopsmaniac.mania;


import static org.junit.Assert.*;

import org.junit.Test;

public class DemoThirdTest {

	@Test
	public void somethingRandom() {
		assertEquals( 1, 1);
	}

	@Test
	public void anotherTest() {
		assertEquals( 1, Demo.somethingRandom() );
	}

	@Test
	public void yetAnotherTest() {
		assertEquals( 1, Demo.somethingRandom() );
	}
}
