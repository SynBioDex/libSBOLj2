package org.sbolstandard.core.option2.oriented.generic;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import org.sbolstandard.core.option2.generic.GenericSequence;
import org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class GenericOrientedComponent extends OrientedComponent<GenericOrientedAnnotation> {

	private Collection<GenericOrientedAnnotation> sequenceAnnotations;
	private GenericSequence sequence;
	
	public GenericOrientedComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<GenericOrientedAnnotation>();
	}

	@Override
	public Collection<GenericOrientedAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<GenericOrientedAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public GenericSequence getSequence() {
		return this.sequence;
	}
	
	@Override
	public void setSequence(GenericSequence sequence) {
		this.sequence = sequence;
	}

}
