package org.sbolstandard.core.option2.oriented.rna;

import java.net.URI;

import org.sbolstandard.core.option2.oriented.OrientedSequence;

/**
 * 
 * @author Ernst Oberortner
 */
public class RnaSequence 
		extends OrientedSequence {

	/**
	 * 
	 * @param identity  ... the identity URI of the Sequence object
	 * @param elements  ... the elements (as String) of the Sequence object
	 */
	public RnaSequence(URI identity, String elements) {
		super(identity, elements);
	}

}