package org.sbolstandard.core.component_option2.sequence.generic;

import java.net.URI;

import org.sbolstandard.core.component_option2.sequence.Sequence;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class GenericSequence extends Sequence {

	/**
	 * 
	 * @param identity an identity for the generic sequence
	 * @param elements an element string for the generic sequence
	 */
	public GenericSequence(URI identity, String elements) {
		super(identity, elements);
	}
	
	
}
