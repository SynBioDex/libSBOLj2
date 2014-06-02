package src.main.java.org.sbolstandard.core.option1;

import java.net.URI;

import src.main.java.org.sbolstandard.core.Identified;

/**
 * 
 * @author Ernst Oberortner
 */
public class Sequence 
	extends Identified {

	private String elements;
	
	/**
	 * 
	 * @param identity  ... the identity URI of the Sequence object
	 * @param elements  ... the elements (as String) of the Sequence object
	 */
	public Sequence(URI identity, String elements) {
		super(identity);
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
