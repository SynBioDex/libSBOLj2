package org.sbolstandard.core.component_option1.sequence;

import java.net.URI;

import org.sbolstandard.core.Identified;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public class Sequence extends Identified {

	private String elements;
	
	/**
	 * 
	 * @param identity an identity for the sequence
	 * @param elements an element string for the sequence
	 */
	public Sequence(URI identity, String elements) {
		super(identity);
		this.elements = elements;
	}
	
	
	/**
	 * 
	 * @return the sequence's element string
	 */
	public String getElements() {
		return elements;
	}

}
