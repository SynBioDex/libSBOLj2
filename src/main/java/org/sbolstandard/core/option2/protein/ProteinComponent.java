package org.sbolstandard.core.option2.protein;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import org.sbolstandard.core.option2.SequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class ProteinComponent 
	extends SequenceComponent<ProteinAnnotation,ProteinSequence> {

	private Collection<ProteinAnnotation> annotations;
	private ProteinSequence sequence;
	
	public ProteinComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);

		this.annotations = new ArrayList<ProteinAnnotation>();
	}

	@Override
	public Collection<ProteinAnnotation> getSequenceAnnotations() {
		return this.annotations;
	}

	@Override
	public ProteinSequence getSequence() {
		return this.sequence;
	}
	
	public ProteinSequence setSequence(ProteinSequence sequence) {
		return this.sequence;
	}

}
