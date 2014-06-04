package org.sbolstandard.core.component_option2.sequence.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.SequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class GenericSequenceComponent extends SequenceComponent<GenericSequenceComponentInstantiation, 
		GenericSequence, GenericSequenceAnnotation> {
	
	/**
	 * 
	 * @param identity an identity for the generic sequence component
	 * @param displayId a display ID for the generic sequence component
	 * @param type a type for the generic sequence component
	 */
	public GenericSequenceComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}

}
