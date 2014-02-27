package org.sbolstandard.core.option1;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.Component;
import org.sbolstandard.core.Port;


/**
 * 
 * @author Ernst Oberortner
 */
public class SequenceComponent
		extends Component {

	private URI sequenceType;
	private Sequence sequence;
	protected Collection<SequenceAnnotation> sequenceAnnotations;
	private Collection<Port> ports;
	
	public SequenceComponent(URI identity, String displayId, URI type, URI sequenceType) {
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
	
	/**
	 * 
	 * @return 
	 * @return a collection of SequenceAnnotations
	 */
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
