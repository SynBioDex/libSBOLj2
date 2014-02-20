package org.sbolstandard.core;

import java.net.URI;
import java.util.List;

/**
 * 
 * @author Ernst Oberortner
 */
public abstract class Instantiation 
	extends Documented {

	private List<PortMap> portMaps;
	
	public Instantiation(URI identity, String displayId) {
		super(identity, displayId);
	}

	public List<PortMap> getPortMaps() {
		return portMaps;
	}
	
	// abstract methods
	public abstract Documented getInstantiated();

}
