package org.sbolstandard.core;

import java.net.URI;

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


}
