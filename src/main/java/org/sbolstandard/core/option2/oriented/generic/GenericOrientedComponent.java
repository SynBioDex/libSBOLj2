package org.sbolstandard.core.option2.oriented.generic;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import org.sbolstandard.core.option2.generic.GenericSequence;
import org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class GenericOrientedComponent 
	extends OrientedComponent<GenericOrientedAnnotation, GenericSequence> {

	private Collection<GenericOrientedAnnotation> annotations;
	private GenericSequence sequence;
	
	public GenericOrientedComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);

		this.annotations = new ArrayList<GenericOrientedAnnotation>();
	}

	@Override
	public Collection<GenericOrientedAnnotation> getSequenceAnnotations() {
		return this.annotations;
	}

	@Override
	public GenericSequence getSequence() {
		return this.sequence;
	}

}
