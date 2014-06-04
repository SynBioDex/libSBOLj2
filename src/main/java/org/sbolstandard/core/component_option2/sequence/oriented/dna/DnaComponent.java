package org.sbolstandard.core.component_option2.sequence.oriented.dna;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.oriented.OrientedSequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class DnaComponent extends OrientedSequenceComponent<DnaComponentInstantiation, 
		DnaSequence, DnaSequenceAnnotation> {
	
	/**
	 * 
	 * @param identity an identity for the DNA component
	 * @param displayId a display ID for the DNA component
	 * @param type a type for the DNA component
	 */
	public DnaComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}
	
}
