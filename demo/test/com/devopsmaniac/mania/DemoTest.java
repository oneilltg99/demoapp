package com.devopsmaniac.mania;

// a change

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void somethingRandom() {
		
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
	public void somethingRandomAgain() {
		
		assertEquals( Demo.somethingRandom(), 1 );
	}
}
