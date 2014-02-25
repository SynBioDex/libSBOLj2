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
	
	/**
	 * 
	 * @param identity
	 * @param displayId
	 * @param type
	 * @param participations
	 * @param participant
	 */
	public Interaction(
			URI identity, String displayId, URI type, 
			Collection<Participation> participations) {
		super(identity, displayId);

		this.type = type;
		this.participations = participations;
	}

	/**
	 * @return the type
	 */
	public URI getType() {
		return type;
	}


	/**
	 * @return the participations
	 */
	public Collection<Participation> getParticipations() {
		return participations;
	}


}
