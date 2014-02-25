package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public class PortMap 
		extends Identified {

	private Port port;
	private ComponentInstantiation mapping;
	
	public PortMap(URI identity, Port port) {
		super(identity);
	}

	/**
	 * @return the port
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * @return the mapping
	 */
	public ComponentInstantiation getMapping() {
		return mapping;
	}

	/**
	 * @param mapping the mapping to set
	 */
	public void setMapping(ComponentInstantiation mapping) {
		this.mapping = mapping;
	}

}
