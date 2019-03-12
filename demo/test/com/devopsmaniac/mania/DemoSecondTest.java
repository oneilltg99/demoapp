package com.devopsmaniac.mania;


// pushing when the repo was not discovered but the tool was connected worked fine
// now I've disconnected the tool. repo exists. going to push again
// that correctly created the payload and marked it as not connected
// now I'll reconnect and push again

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
