package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;

/**
 * 
 * @author Ernst Oberortner
 */
public class ModuleInstantiation 
	extends Instantiation {

	private Module instantiates;
	
	public ModuleInstantiation(URI identity, String displayId, Module instantiates) {
		super(identity, displayId);
		this.instantiates = instantiates;
	}

	@Override
	public Module getInstantiates() {
		return instantiates;
	}
	
	private Collection<PortMap> portMaps;
	
	/**
	 * @param portMaps the portMaps to set
	 */
	public void setPortMaps(Collection<PortMap> portMaps) {
		this.portMaps = portMaps;
	}


}
