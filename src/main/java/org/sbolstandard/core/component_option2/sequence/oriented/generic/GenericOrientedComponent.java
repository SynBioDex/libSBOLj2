package org.sbolstandard.core.component_option2.sequence.oriented.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.generic.GenericSequence;
import org.sbolstandard.core.component_option2.sequence.oriented.OrientedSequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class GenericOrientedComponent extends OrientedSequenceComponent<GenericOrientedComponentInstantiation, 
		GenericSequence, GenericOrientedAnnotation> {
	
	/**
	 * 
	 * @param identity an identity for the generic oriented component
	 * @param displayId a display ID for the generic oriented component
	 * @param type a type for the generic oriented component
	 */
	public GenericOrientedComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}

}
