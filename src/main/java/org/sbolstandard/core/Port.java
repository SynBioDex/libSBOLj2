package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public class Port 
		extends Documented {

	private URI directionality;
	private ComponentInstantiation exposes;
	
	public Port(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * @return the directionality
	 */
	public URI getDirectionality() {
		return directionality;
	}

	/**
	 * @param directionality the directionality to set
	 */
	public void setDirectionality(URI directionality) {
		this.directionality = directionality;
	}

	/**
	 * @return the exposes
	 */
	public ComponentInstantiation getExposes() {
		return exposes;
	}

	/**
	 * @param exposes the exposes to set
	 */
	public void setExposes(ComponentInstantiation exposes) {
		this.exposes = exposes;
	}

}
