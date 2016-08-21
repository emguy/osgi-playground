package com.acme.prime.upper.propvider.provider;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.acme.prime.upper.propvider.api.Propvider;

/**
 * This is the implementation.It registers a Propvider service.
 */
@Component(immediate=true, name="com.acme.prime.upper.propvider")
public class PropviderImpl implements Propvider {
	private String name;

	@Activate
	void activate(Map<String, Object> map) {
		name = map.containsKey("name") ? (String) map.get("name") : "World";
		say("Hello");
	}

	@Deactivate
	void deactivate(Map<String, Object> map) {
		say("Goodbye");
	}

	@Override
	public boolean say(String message) {
		System.out.println(name + ":"  + message);
		return false;
	}

}
