package org.sbolstandard.core.interaction;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.Documented;
import org.sbolstandard.core.Signal;

/**
 * 
 * @author Ernst Oberortner
 */
public class Interaction 
	extends Documented {

	private URI type;
	private Collection<Participation> participations;
	private Signal participant;
	
	public Interaction(
			URI identity, String displayId, 
			URI type, Collection<Participation> participations, Signal participant) {
		super(identity, displayId);
		
		this.setType(type);
	}

	/**
	 * @return the type
	 */
	public URI getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(URI type) {
		this.type = type;
	}

	/**
	 * @return the participations
	 */
	public Collection<Participation> getParticipations() {
		return participations;
	}

	/**
	 * @param participations the participations to set
	 */
	public void setParticipations(Collection<Participation> participations) {
		this.participations = participations;
	}

	/**
	 * @return the participant
	 */
	public Signal getParticipant() {
		return participant;
	}

	/**
	 * @param participant the participant to set
	 */
	public void setParticipant(Signal participant) {
		this.participant = participant;
	}
	
	

}
