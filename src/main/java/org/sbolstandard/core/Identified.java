package org.sbolstandard.core;

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
	
	public URI getIdentity() {
		return this.identity;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
}
