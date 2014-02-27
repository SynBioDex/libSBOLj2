package org.sbolstandard.core.option2.generic;

import java.net.URI;

import org.sbolstandard.core.Orientation;
import org.sbolstandard.core.option2.SequenceAnnotation;

public abstract class GenericSequenceAnnotation 
		extends SequenceAnnotation {

	private Orientation orientation;
	
	public GenericSequenceAnnotation(URI identity, String displayId,
			Orientation orientation) {
		super(identity, displayId);
		this.orientation = orientation;
	}

	/**
	 * 
	 * @return the orientation of the oriented sequence annotation
	 */
	public String getOrientation() {
		return this.orientation.toString();
	}

}
