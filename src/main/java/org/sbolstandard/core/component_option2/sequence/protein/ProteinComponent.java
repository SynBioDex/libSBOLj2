package org.sbolstandard.core.component_option2.sequence.protein;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.SequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class ProteinComponent extends SequenceComponent<ProteinComponentInstantiation, 
		ProteinSequence, ProteinSequenceAnnotation> {
	
	/**
	 * 
	 * @param identity an identity for the protein component
	 * @param displayId a display ID for the protein component
	 * @param type a type for the protein component
	 */
	public ProteinComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}

}
