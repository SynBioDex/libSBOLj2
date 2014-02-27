package org.sbolstandard.core.option2.generic;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.option2.SequenceComponent;

public abstract class GenericSequenceComponent<OA extends GenericSequenceAnnotation, SEQ extends GenericSequence> 
	extends SequenceComponent<OA, SEQ> {

	public GenericSequenceComponent(URI identity, String displayId, 
			URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);
	}
	
	// abstract methods
	public abstract Collection<OA> getSequenceAnnotations();
	public abstract SEQ getSequence();
	

}
