package org.sbolstandard.core.component_option2.sequence.oriented.dna;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.oriented.OrientedSequenceAnnotation;

/**
 * 
 * @author Ernst Oberortner
 */
public class DnaSequenceAnnotation extends OrientedSequenceAnnotation<DnaComponentInstantiation> {
	
	/**
	 * 
	 * @param identity an identity for the DNA sequence annotation
	 * @param displayId a display ID for the DNA sequence annotation
	 */
	public DnaSequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @param identity an identity for the DNA sequence annotation
	 * @param displayId a display ID for the DNA sequence annotation
	 * @param a starting position for the DNA sequence annotation
	 * @param an ending position for the DNA sequence annotation
	 */
	public DnaSequenceAnnotation(URI identity, String displayId, int start, int end) {
		super(identity, displayId, start, end);
	}

}
