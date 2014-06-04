package org.sbolstandard.core.component_option2.sequence.oriented.dna;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;

public class DnaComponentInstantiation extends ComponentInstantiation{

	/**
	 * 
	 * @param identity an identity for the DNA component instantiation
	 * @param displayId a display ID for the DNA component instantiation
	 * @param instantiatedComponent the DNA component to be instantiated
	 */
	public DnaComponentInstantiation(URI identity, String displayId, 
			DnaComponent instantiatedComponent) {
		super(identity, displayId, instantiatedComponent);
	}

	/**
	 * 
	 * @return the instantiated DNA component
	 */
	public DnaComponent getInstantiatedComponent() {
		return (DnaComponent) instantiatedComponent;
	}
	
}
