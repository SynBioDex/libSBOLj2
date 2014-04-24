package org.sbolstandard.core.option2.protein;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import org.sbolstandard.core.option2.SequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class ProteinComponent extends SequenceComponent<ProteinAnnotation> {

	private Collection<ProteinAnnotation> sequenceAnnotations;
	private ProteinSequence sequence;
	
	public ProteinComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<ProteinAnnotation>();
	}

	@Override
	public Collection<ProteinAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<ProteinAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public ProteinSequence getSequence() {
		return this.sequence;
	}
	
	@Override
	public void setSequence(ProteinSequence sequence) {
		this.sequence = sequence;
	}

}
