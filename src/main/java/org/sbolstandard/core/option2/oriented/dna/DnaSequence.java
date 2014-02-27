package org.sbolstandard.core.option2.oriented.dna;

import java.net.URI;

import org.sbolstandard.core.option2.oriented.OrientedSequence;

/**
 * 
 * @author Ernst Oberortner
 */
public class DnaSequence 
		extends OrientedSequence {

	/**
	 * 
	 * @param identity  ... the identity URI of the Sequence object
	 * @param elements  ... the elements (as String) of the Sequence object
	 */
	public DnaSequence(URI identity, String elements) {
		super(identity, elements);
	}

}
