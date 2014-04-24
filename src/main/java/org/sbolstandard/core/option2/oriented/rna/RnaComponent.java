package org.sbolstandard.core.option2.oriented.rna;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class RnaComponent extends OrientedComponent<RnaAnnotation> {

	private Collection<RnaAnnotation> sequenceAnnotations;
	private RnaSequence sequence;
	
	public RnaComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<RnaAnnotation>();
	}

	@Override
	public Collection<RnaAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<RnaAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public RnaSequence getSequence() {
		return this.sequence;
	}
	
	@Override
	public void getSequence(RnaSequence sequence) {
		this.sequence = sequence;
	}

}
