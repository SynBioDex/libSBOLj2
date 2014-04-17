package org.sbolstandard.core.option2.oriented;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.option2.Sequence;
import org.sbolstandard.core.option2.SequenceComponent;

public abstract class OrientedComponent<OA extends OrientedAnnotation, SEQ extends Sequence> 
	extends SequenceComponent<OA, SEQ> {

	public OrientedComponent(URI identity, String displayId, 
			URI type, URI sequenceType) {
		super(identity, displayId, type, sequenceType);
	}
	
	// abstract methods
	public abstract Collection<OA> getSequenceAnnotations();
	public abstract SEQ getSequence();
	

}
