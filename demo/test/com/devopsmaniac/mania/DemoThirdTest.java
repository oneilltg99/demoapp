package com.devopsmaniac.mania;

// real test test 333

import static org.junit.Assert.*;
import org.junit.Test;

public class DemoThirdTest {

	@Test
	public void somethingRandom() {
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
	public void anotherTest() {
		assertEquals( Demo.somethingRandom(), 1 );
	}

	@Test
	public void yetAnotherTest() {
		assertEquals( Demo.somethingRandom(), 1 ); 
	}
}
