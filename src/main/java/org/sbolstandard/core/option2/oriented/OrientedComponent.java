package org.sbolstandard.core.option2.oriented;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.option2.Sequence;
import org.sbolstandard.core.option2.SequenceComponent;

public abstract class OrientedComponent<OA extends OrientedAnnotation> extends SequenceComponent<OA> {

	public OrientedComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}
	
	// abstract methods
	@Override
	public abstract Collection<OA> getSequenceAnnotations();
	
	@Override
	public abstract void setSequenceAnnotations(Collection<OA> sequenceAnnotations);
	

}
