package org.sbolstandard.core.option2.oriented.dna;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class DnaComponent 
	extends OrientedComponent<DnaAnnotation, DnaSequence> {

	private Collection<DnaAnnotation> annotations;
	private DnaSequence sequence;
	
	public DnaComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);

		this.annotations = new ArrayList<DnaAnnotation>();
	}

	@Override
	public Collection<DnaAnnotation> getSequenceAnnotations() {
		return this.annotations;
	}

	@Override
	public DnaSequence getSequence() {
		return this.sequence;
	}

}
