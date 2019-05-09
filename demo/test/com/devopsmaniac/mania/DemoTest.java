package com.devopsmaniac.mania;

import static org.junit.Assert.*;
import org.junit.Test;

// test 1234

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
