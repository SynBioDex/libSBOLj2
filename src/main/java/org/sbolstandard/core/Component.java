package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public class Component 
	extends Documented {

	private URI type;
	
	public Component(URI identity, String displayId, URI type) {
		super(identity, displayId);
		this.type = type;
	}
	
	/**
	 * getType
	 * 
	 * @return the URI of the type
	 */
	public URI getType() {
		return this.type;
	}

}
