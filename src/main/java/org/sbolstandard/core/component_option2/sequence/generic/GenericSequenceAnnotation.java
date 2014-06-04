package org.sbolstandard.core.component_option2.sequence.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.SequenceAnnotation;

public class GenericSequenceAnnotation 
		extends SequenceAnnotation<GenericSequenceComponentInstantiation> {

	/**
	 * 
	 * @param identity an identity for the generic sequence annotation
	 * @param displayId a display ID for the generic sequence annotation
	 */
	public GenericSequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @param identity an identity for the generic sequence annotation
	 * @param displayId a display ID for the generic sequence annotation
	 * @param a starting position for the generic sequence annotation
	 * @param an ending position for the generic sequence annotation
	 */
	public GenericSequenceAnnotation(URI identity, String displayId, int start, int end) {
		super(identity, displayId, start, end);
	}

}
