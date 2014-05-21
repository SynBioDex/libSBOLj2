package src.main.java.org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public abstract class Identified {
	
	private URI identity;
	private String annotation;

	/**
	 * Constructor requires only identity
	 * 
	 * @param identity
	 */
	public Identified(URI identity) {
		this.identity = identity;
	}
	
	/**
	 * 
	 * @return the URI of the identified object
	 */
	public URI getIdentity() {
		return this.identity;
	}

	/**
	 * 
	 * @return the annotation (as String) of the identified object
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * 
	 * @param annotation ... the annotation (as String) of the identified object 
	 */
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
}
