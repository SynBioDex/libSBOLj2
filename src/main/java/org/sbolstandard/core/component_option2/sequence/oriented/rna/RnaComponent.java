package org.sbolstandard.core.component_option2.sequence.oriented.rna;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.oriented.OrientedSequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class RnaComponent extends OrientedSequenceComponent<RnaComponentInstantiation, 
		RnaSequence, RnaSequenceAnnotation> {

	/**
	 * 
	 * @param identity an identity for the RNA component
	 * @param displayId a display ID for the RNA component
	 * @param type a type for the RNA component
	 */
	public RnaComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}
	
}
