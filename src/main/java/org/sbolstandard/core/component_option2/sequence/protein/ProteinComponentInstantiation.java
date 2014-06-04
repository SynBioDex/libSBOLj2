package org.sbolstandard.core.component_option2.sequence.protein;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class ProteinComponentInstantiation extends ComponentInstantiation {

	/**
	 * 
	 * @param identity an identity for the protein component instantiation
	 * @param displayId a display ID for the protein component instantiation
	 * @param instantiatedComponent the protein component to be instantiated
	 */
	public ProteinComponentInstantiation(URI identity, String displayId, 
			ProteinComponent instantiatedComponent) {
		super(identity, displayId, instantiatedComponent);
	}

	/**
	 * 
	 * @return the instantiated protein component
	 */
	public ProteinComponent getInstantiatedComponent() {
		return (ProteinComponent) instantiatedComponent;
	}
	
}
