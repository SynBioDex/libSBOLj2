package org.sbolstandard.core.option2.oriented.dna;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class DnaComponent extends OrientedComponent<DnaAnnotation> {

	private Collection<DnaAnnotation> sequenceAnnotations;
	private DnaSequence sequence;
	
	public DnaComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<DnaAnnotation>();
	}

	@Override
	public Collection<DnaAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<DnaAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public DnaSequence getSequence() {
		return this.sequence;
	}
	
	@Override
	public void setSequence(DnaSequence sequence) {
		this.sequence = sequence;
	}

}
