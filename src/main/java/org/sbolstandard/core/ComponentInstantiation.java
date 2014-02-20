package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public abstract class ComponentInstantiation 
	extends Instantiation {

	public ComponentInstantiation(URI identity, String displayId) {
		super(identity, displayId);
	}

	// abstract methods
	public abstract Component getInstantiated();

}
