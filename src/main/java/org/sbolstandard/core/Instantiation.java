package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;

/**
 * 
 * @author Ernst Oberortner
 */
public abstract class Instantiation 
	extends Documented {

	private Collection<PortMap> portMaps;
	
	public Instantiation(URI identity, String displayId) {
		super(identity, displayId);
	}

	public Collection<PortMap> getPortMaps() {
		return portMaps;
	}
	
	// abstract methods
	public abstract Documented getInstantiated();

}
