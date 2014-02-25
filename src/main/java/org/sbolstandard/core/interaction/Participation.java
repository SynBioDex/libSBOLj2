package org.sbolstandard.core.interaction;

import java.net.URI;

import org.sbolstandard.core.Identified;
import org.sbolstandard.core.Signal;

public class Participation 
	extends Identified {

	private URI role;
	private Signal participant;
	
	public Participation(URI identity, URI role, Signal participant) {
		super(identity);
		this.role = role;
		this.participant = participant;
	}

	/**
	 * @return the role
	 */
	public URI getRole() {
		return this.role;
	}

	/**
	 * 
	 */
	public Signal getParticipant() {
		return this.participant;
	}
}
