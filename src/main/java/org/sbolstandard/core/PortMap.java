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
		this.setPort(port);
	}

	/**
	 * @return the port
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(Port port) {
		this.port = port;
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
