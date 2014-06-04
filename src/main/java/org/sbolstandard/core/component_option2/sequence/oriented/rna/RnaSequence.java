package org.sbolstandard.core.component_option2.sequence.oriented.rna;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.Sequence;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class RnaSequence extends Sequence {

	/**
	 * 
	 * @param identity an identity for the RNA sequence
	 * @param elements an element string for the RNA sequence
	 */
	public RnaSequence(URI identity, String elements) {
		super(identity, elements);
	}

}
