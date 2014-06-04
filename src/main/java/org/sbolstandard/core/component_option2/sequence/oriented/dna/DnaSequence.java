package org.sbolstandard.core.component_option2.sequence.oriented.dna;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.Sequence;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class DnaSequence extends Sequence {

	/**
	 * 
	 * @param identity an identity for the DNA sequence
	 * @param elements an element string for the DNA sequence
	 */
	public DnaSequence(URI identity, String elements) {
		super(identity, elements);
	}

}
