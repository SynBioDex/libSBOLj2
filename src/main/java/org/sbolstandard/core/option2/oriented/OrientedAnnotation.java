package org.sbolstandard.core.option2.oriented;

import java.net.URI;

import org.sbolstandard.core.Orientation;
import org.sbolstandard.core.option2.SequenceAnnotation;

public abstract class OrientedAnnotation 
		extends SequenceAnnotation {

	private Orientation orientation;
	
	public OrientedAnnotation(URI identity, String displayId,
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
