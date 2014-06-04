package org.sbolstandard.core.component_option2.sequence.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class GenericSequenceComponentInstantiation extends ComponentInstantiation {

	/**
	 * 
	 * @param identity an identity for the generic sequence component instantiation
	 * @param displayId a display ID for the generic sequence component instantiation
	 * @param instantiatedComponent the generic sequence component to be instantiated
	 */
	public GenericSequenceComponentInstantiation(URI identity, String displayId, 
			GenericSequenceComponent instantiatedComponent) {
		super(identity, displayId, instantiatedComponent);
	}

	/**
	 * 
	 * @return the instantiated generic sequence component
	 */
	public GenericSequenceComponent getInstantiatedComponent() {
		return (GenericSequenceComponent) instantiatedComponent;
	}
	
}
