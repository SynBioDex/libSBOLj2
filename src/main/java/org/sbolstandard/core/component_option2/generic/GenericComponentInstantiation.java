package org.sbolstandard.core.component_option2.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;

public class GenericComponentInstantiation extends ComponentInstantiation {
	
	/**
	 * 
	 * @param identity an identity for the generic component instantiation
	 * @param displayId a display ID for the generic component instantiation
	 * @param instantiatedComponent the generic component to be instantiated
	 */
	public GenericComponentInstantiation(URI identity, String displayId, 
			GenericComponent instantiatedComponent) {
		super(identity, displayId, instantiatedComponent);
	}
	
	/**
	 * 
	 * @return the instantiated generic component
	 */
	public GenericComponent getInstantiatedComponent() {
		return (GenericComponent) instantiatedComponent;
	}
	
}
