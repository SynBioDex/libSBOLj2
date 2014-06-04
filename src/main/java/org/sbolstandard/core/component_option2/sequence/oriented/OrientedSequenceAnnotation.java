package org.sbolstandard.core.component_option2.sequence.oriented;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;
import org.sbolstandard.core.component_option2.sequence.SequenceAnnotation;

public abstract class OrientedSequenceAnnotation<CI extends ComponentInstantiation> 
		extends SequenceAnnotation<CI> {

	private Orientation orientation;
	
	/**
	 * 
	 * @param identity an identity for the oriented sequence annotation
	 * @param displayId a display ID for the oriented sequence annotation
	 */
	public OrientedSequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * 
	 * @param identity an identity for the oriented sequence annotation
	 * @param displayId a display ID for the oriented sequence annotation
	 * @param a starting position for the oriented sequence annotation
	 * @param an ending position for the oriented sequence annotation
	 */
	public OrientedSequenceAnnotation(URI identity, String displayId, int start, int end) {
		super(identity, displayId, start, end);
	}

	/**
	 * 
	 * @return the oriented sequence annotation's orientation
	 */
	public Orientation getOrientation() {
		return orientation;
	}
	
	/**
	 * 
	 * @param an orientation for the oriented sequence annotation
	 */
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

}
