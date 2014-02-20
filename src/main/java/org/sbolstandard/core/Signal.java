package org.sbolstandard.core;

import java.net.URI;

public class Signal 
		extends ComponentInstantiation {

	private Component instantiates;
	
	public Signal(URI identity, String displayId, Component instantiates) {
		super(identity, displayId);
		this.instantiates = instantiates;
	}

	@Override
	public Component getInstantiated() {
		return this.instantiates;
	}

}
