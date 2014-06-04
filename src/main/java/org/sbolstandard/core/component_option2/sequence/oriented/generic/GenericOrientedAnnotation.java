package org.sbolstandard.core.component_option2.sequence.oriented.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.oriented.OrientedSequenceAnnotation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class GenericOrientedAnnotation extends OrientedSequenceAnnotation<GenericOrientedComponentInstantiation> {
	
	/**
	 * 
	 * @param identity an identity for the generic oriented annotation
	 * @param displayId a display ID for the generic oriented annotation
	 */
	public GenericOrientedAnnotation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @param identity an identity for the generic oriented annotation
	 * @param displayId a display ID for the generic oriented annotation
	 * @param a starting position for the generic oriented annotation
	 * @param an ending position for the generic oriented annotation
	 */
	public GenericOrientedAnnotation(URI identity, String displayId, int start, int end) {
		super(identity, displayId, start, end);
	}
	
}
