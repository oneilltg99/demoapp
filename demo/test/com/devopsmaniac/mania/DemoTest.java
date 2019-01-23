package com.devopsmaniac.mania;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

// tgo
	@Test
	public void somethingRandom() {
		
		assertEquals( Demo.somethingRandom(), 1);
	}

	@Test
	public void somethingRandomAgain() {
		
		assertEquals( Demo.somethingRandom(), 1 );
	}
}
