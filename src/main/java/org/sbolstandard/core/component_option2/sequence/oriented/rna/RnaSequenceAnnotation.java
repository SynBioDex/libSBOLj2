package org.sbolstandard.core.component_option2.sequence.oriented.rna;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.oriented.OrientedSequenceAnnotation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class RnaSequenceAnnotation extends OrientedSequenceAnnotation<RnaComponentInstantiation> {
	
	/**
	 * 
	 * @param identity an identity for the RNA sequence annotation
	 * @param displayId a display ID for the RNA annotation
	 */
	public RnaSequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @param identity an identity for the RNA sequence annotation
	 * @param displayId a display ID for the RNA sequence annotation
	 * @param a starting position for the RNA sequence annotation
	 * @param an ending position for the RNA sequence annotation
	 */
	public RnaSequenceAnnotation(URI identity, String displayId, int start, int end) {
		super(identity, displayId, start, end);
	}

}
