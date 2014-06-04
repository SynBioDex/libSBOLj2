package org.sbolstandard.core.component_option2.sequence.protein;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.SequenceAnnotation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class ProteinSequenceAnnotation extends SequenceAnnotation<ProteinComponentInstantiation> {

	/**
	 * 
	 * @param identity an identity for the protein annotation
	 * @param displayId a display ID for the protein annotation
	 */
	public ProteinSequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @param identity an identity for the protein annotation
	 * @param displayId a display ID for the protein annotation
	 * @param a starting position for the protein annotation
	 * @param an ending position for the protein annotation
	 */
	public ProteinSequenceAnnotation(URI identity, String displayId, int start, int end) {
		super(identity, displayId, start, end);
	}

}
