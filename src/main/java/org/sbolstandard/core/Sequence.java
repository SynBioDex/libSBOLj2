package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public class Sequence 
	extends Documented {

	private String elements;
	
	/**
	 * 
	 * @param identity  ... the identity URI of the Sequence object
	 * @param displayId ... the displayId as String of the Sequence object
	 * @param elements  ... the elements (as String) of the Sequence object
	 */
	public Sequence(URI identity, String displayId, String elements) {
		super(identity, displayId);
		this.elements = elements;
	}
	
	
	/**
	 * 
	 * @return the sequence (as String)
	 */
	public String getElements() {
		return this.elements;
	}

}
