package org.sbolstandard.core.component_option2.sequence.protein;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.Sequence;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class ProteinSequence extends Sequence {

	/**
	 * 
	 * @param identity an identity for the protein sequence
	 * @param elements an element string for the protein sequence
	 */
	public ProteinSequence(URI identity, String elements) {
		super(identity, elements);
	}

}
