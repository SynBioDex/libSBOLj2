package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;


/**
 * 
 * @author Ernst Oberortner
 */
public class SequencedComponent 
		extends Component {

	private URI sequenceType;
	private Sequence sequence;
	private Collection<SequenceAnnotation> sequenceAnnotations;
	private Port[] ports;
	
	public SequencedComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type);
		
		this.sequenceType = sequenceType;
	}

	public URI getSequenceType() {
		return sequenceType;
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

	public Port[] getPorts() {
		return ports;
	}

	public void setPorts(Port[] ports) {
		this.ports = ports;
	}
	
}
