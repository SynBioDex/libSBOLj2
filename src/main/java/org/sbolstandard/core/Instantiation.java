package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.port_option2.PortMap;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public abstract class Instantiation extends Documented {

	private Collection<PortMap> portMaps;
	
	/**
	 * 
	 * @param identity an identity for the instantiation
	 * @param displayId a display ID for the instantiation
	 */
	public Instantiation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @return a collection of the instantiation's port maps
	 */
	public Collection<PortMap> getPortMaps() {
		return portMaps;
	}
	
	/**
	 * 
	 * @param portMap a port map for the instantiation
	 */
	public void addPortMap(PortMap portMap) {
		portMaps.add(portMap);
	}

}
