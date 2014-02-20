package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;


/**
 * 
 * @author Ernst Oberortner
 */
public class SequenceComponent 
		extends Component {

	private URI sequenceType;
	private Sequence sequence;
	private Collection<SequenceAnnotation> sequenceAnnotations;
	private Collection<Port> ports;
	
	public SequenceComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type);
		
		this.sequenceType = sequenceType;
	}

	public URI getSequenceType() {
		return sequenceType;
	}

	public void setSequenceType(URI sequenceType) {
		this.sequenceType = sequenceType;
	}

	public Sequence getSequence() {
		return sequence;
	}

	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public Collection<SequenceAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}

	public Collection<Port> getPorts() {
		return ports;
	}

	public void setPorts(Collection<Port> ports) {
		this.ports = ports;
	}
	
}
