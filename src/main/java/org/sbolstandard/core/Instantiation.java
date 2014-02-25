package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public abstract class Instantiation 
	extends Documented {

	private PortMap[] portMaps;
	
	public Instantiation(URI identity, String displayId) {
		super(identity, displayId);
	}

	public PortMap[] getPortMaps() {
		return portMaps;
	}
	
	// abstract methods
	public abstract Documented getInstantiated();

}
