package org.sbolstandard.core.interaction;

import java.net.URI;

import org.sbolstandard.core.Identified;

public class Participation 
	extends Identified {

	private URI role;
	
	public Participation(URI identity, URI role) {
		super(identity);
		
		this.setRole(role);
	}

	/**
	 * @return the role
	 */
	public URI getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(URI role) {
		this.role = role;
	}

}
