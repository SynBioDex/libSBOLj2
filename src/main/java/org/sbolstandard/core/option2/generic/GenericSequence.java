package src.main.java.org.sbolstandard.core.option2.generic;

import java.net.URI;

import src.main.java.org.sbolstandard.core.option2.Sequence;

/**
 * 
 * @author Ernst Oberortner
 */
public class GenericSequence 
		extends Sequence {

	/**
	 * 
	 * @param identity  ... the identity URI of the Sequence object
	 * @param elements  ... the elements (as String) of the Sequence object
	 */
	public GenericSequence(URI identity, String elements) {
		super(identity, elements);
	}
	
	
}
