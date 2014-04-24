package org.sbolstandard.core.option2.generic;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import org.sbolstandard.core.option2.SequenceComponent;

public class GenericSequenceComponent extends SequenceComponent<GenericSequenceAnnotation> {

	private GenericSequence sequence;
	private Collection<GenericSequenceAnnotation> sequenceAnnotations;
	
	public GenericSequenceComponent(URI identity, String displayId, 
			URI type) {
		super(identity, displayId, type);
		
		this.sequenceAnnotations = new ArrayList<GenericSequenceAnnotation>();
	}

	@Override
	public Collection<GenericSequenceAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<GenericSequenceAnnotation> sequenceAnnotations) {
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
