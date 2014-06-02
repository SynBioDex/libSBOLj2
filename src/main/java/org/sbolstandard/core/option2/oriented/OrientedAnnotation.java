package src.main.java.org.sbolstandard.core.option2.oriented;

import java.net.URI;

import src.main.java.org.sbolstandard.core.option2.SequenceComponent;

import src.main.java.org.sbolstandard.core.Orientation;
import src.main.java.org.sbolstandard.core.option2.SequenceAnnotation;

public abstract class OrientedAnnotation 
		extends SequenceAnnotation {

	private Orientation orientation;
	
	public OrientedAnnotation(URI identity, String displayId,
			Orientation orientation) {
		super(identity, displayId);
		this.orientation = orientation;
	}
	
	@Override
	public abstract OrientedComponent getInstantiates();

	/**
	 * 
	 * @return the orientation of the oriented sequence annotation
	 */
	public String getOrientation() {
		return this.orientation.toString();
	}

}
