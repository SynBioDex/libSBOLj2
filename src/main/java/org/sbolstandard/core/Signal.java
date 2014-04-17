package org.sbolstandard.core;

import java.net.URI;

public class Signal 
		extends ComponentInstantiation {

	private Component instantiates;
	
	/**
	 * 
	 * @param identity     ... the identity URI of the component instantiation
	 * @param displayId    ... the displayId as String of the component instantiation
	 * @param instantiates ... the component the ComponentInstantiation object instantiates
	 */
	public Signal(URI identity, String displayId, Component instantiates) {
		super(identity, displayId);
		this.instantiates = instantiates;
		
	}

	@Override
	public Component getInstantiates() {
		return this.instantiates;
	}
	
}
