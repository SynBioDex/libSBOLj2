package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public class Sequence 
	extends Documented {

	private String elements;
	
	public Sequence(URI identity, String displayId, String elements) {
		super(identity, displayId);
		this.elements = elements;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getElements() {
		return this.elements;
	}

}
