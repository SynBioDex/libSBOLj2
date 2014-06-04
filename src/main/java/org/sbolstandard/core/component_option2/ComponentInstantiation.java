package org.sbolstandard.core.component_option2;

import java.net.URI;

import org.sbolstandard.core.Instantiation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public abstract class ComponentInstantiation extends Instantiation {

	protected Component instantiatedComponent;
	
	/**
	 * 
	 * @param identity an identity for the component instantiation
	 * @param displayId a display ID for the component instantiation
	 * @param instantiatedComponent the component to be instantiated
	 */
	public ComponentInstantiation(URI identity, String displayId, 
			Component instantiatedComponent) {
		super(identity, displayId);
		this.instantiatedComponent = instantiatedComponent;
	}
	
	/**
	 * 
	 * @return the instantiated component
	 */
	public Component getInstantiatedComponent() {
		return instantiatedComponent;
	}

}
