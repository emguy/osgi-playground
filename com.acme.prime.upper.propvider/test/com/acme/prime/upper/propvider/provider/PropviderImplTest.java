package com.acme.prime.upper.propvider.provider;

import org.junit.Test;

import com.acme.prime.upper.propvider.api.Propvider;

/*
 * Example JUNit test case
 * 
 */

public class PropviderImplTest {

	/*
	 * Example test method
	 */

	@Test
	public void simple() {
		Propvider impl = new PropviderImpl();
		
		impl.say("Hello World");
	}

}
