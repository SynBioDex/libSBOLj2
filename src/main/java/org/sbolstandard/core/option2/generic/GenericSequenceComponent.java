package org.sbolstandard.core.option2.generic;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import org.sbolstandard.core.option2.SequenceComponent;

public class GenericSequenceComponent 
	extends SequenceComponent<GenericSequenceAnnotation, GenericSequence> {

	private GenericSequence genericSequence;
	private Collection<GenericSequenceAnnotation> sequenceAnnotations;
	
	public GenericSequenceComponent(URI identity, String displayId, 
			URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);
		
		this.sequenceAnnotations = new HashSet<GenericSequenceAnnotation>();
	}

	@Override
	public Collection<GenericSequenceAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}

	@Override
	public GenericSequence getSequence() {
		return this.genericSequence;
	}
	
	public void setSequence(GenericSequence genericSequence) {
		this.genericSequence = genericSequence;
	}
	

}
