package org.sbolstandard.core.option2.protein;

import java.net.URI;

import org.sbolstandard.core.option2.Sequence;

/**
 * 
 * @author Ernst Oberortner
 */
public class ProteinSequence 
		extends Sequence {

	/**
	 * 
	 * @param identity  ... the identity URI of the Sequence object
	 * @param elements  ... the elements (as String) of the Sequence object
	 */
	public ProteinSequence(URI identity, String elements) {
		super(identity, elements);
	}

}
