package org.sbolstandard.core.option2.oriented.rna;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class RnaComponent 
	extends OrientedComponent<RnaAnnotation,RnaSequence> {

	private Collection<RnaAnnotation> annotations;
	private RnaSequence sequence;
	
	public RnaComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);

		this.annotations = new ArrayList<RnaAnnotation>();
	}

	@Override
	public Collection<RnaAnnotation> getSequenceAnnotations() {
		return this.annotations;
	}

	@Override
	public RnaSequence getSequence() {
		return this.sequence;
	}

}
