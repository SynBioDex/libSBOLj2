package org.sbolstandard.core.component_option2.sequence.oriented.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;

public class GenericOrientedComponentInstantiation extends ComponentInstantiation {

	/**
	 * 
	 * @param identity an identity for the generic oriented component instantiation
	 * @param displayId a display ID for the generic oriented component instantiation
	 * @param instantiatedComponent the generic oriented component to be instantiated
	 */
	public GenericOrientedComponentInstantiation(URI identity, String displayId, 
			GenericOrientedComponent instantiatedComponent) {
		super(identity, displayId, instantiatedComponent);
	}

	/**
	 * 
	 * @return the instantiated generic oriented component
	 */
	public GenericOrientedComponent getInstantiatedComponent() {
		return (GenericOrientedComponent) instantiatedComponent;
	}
	
}
