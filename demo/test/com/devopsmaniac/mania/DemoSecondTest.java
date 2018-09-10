package com.devopsmaniac.mania;





import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

public class DemoSecondTest {

	@Test
	public void somethingRandom() {
		assertEquals( 1, Demo.somethingRandom() );
	}

	@Test
	@Ignore
	public void ignoreMePlease() {
		assertEquals( 1, Demo.somethingRandom() );
	}
}
