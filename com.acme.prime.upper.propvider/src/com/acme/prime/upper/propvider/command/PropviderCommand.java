package com.acme.prime.upper.propvider.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.acme.prime.upper.propvider.api.Propvider;
import osgi.enroute.debug.api.Debug;

/**
 * This is the implementation. It registers the Propvider interface and calls it
 * through a Gogo command.
 * 
 */
@Component(service=PropviderCommand.class, property = { Debug.COMMAND_SCOPE + "=propvdr",
		Debug.COMMAND_FUNCTION + "=propvdr" }, name="com.acme.prime.upper.propvider.command")
public class PropviderCommand {
	private Propvider target;

	public void propvdr(String message) {
		target.say(message);
	}

	@Reference
	void setPropvider(Propvider service) {
		this.target = service;
	}

}
