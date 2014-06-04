package org.sbolstandard.core.component_option2.sequence.oriented.rna;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class RnaComponentInstantiation extends ComponentInstantiation {

	/**
	 * 
	 * @param identity an identity for the RNA component instantiation
	 * @param displayId a display ID for the RNA component instantiation
	 * @param instantiatedComponent the RNA component to be instantiated
	 */
	public RnaComponentInstantiation(URI identity, String displayId, 
			RnaComponent instantiatedComponent) {
		super(identity, displayId, instantiatedComponent);
	}

	/**
	 * 
	 * @return the instantiated RNA component
	 */
	public RnaComponent getInstantiatedComponent() {
		return (RnaComponent) instantiatedComponent;
	}
	
}
