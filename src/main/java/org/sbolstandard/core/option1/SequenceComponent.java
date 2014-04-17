package org.sbolstandard.core.option1;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

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
	
	/**
	 * 
	 * @param identity
	 * @param displayId
	 * @param type
	 * @param sequenceType
	 */
	public SequenceComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type);
		
		this.sequenceType = sequenceType;
		this.sequenceAnnotations = new HashSet<SequenceAnnotation>();
		this.ports = new HashSet<Port>();
	}

	/**
	 * 
	 * @return the URI of the sequence's type
	 */
	public URI getSequenceType() {
		return sequenceType;
	}

	/**
	 * 
	 * @return the sequence
	 */
	public Sequence getSequence() {
		return sequence;
	}

	/**
	 * 
	 * @param sequence the sequence
	 */
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
	
	/**
	 * 
	 * @param sequenceAnnotations a Collection of sequence annotations
	 */
	public void setSequenceAnnotations(Collection<SequenceAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	/**
	 * 
	 * @return  a collection of the sequence's ports
	 */
	public Collection<Port> getPorts() {
		return ports;
	}
	
	/**
	 * 
	 * @param ports the sequence's ports
	 */
	public void setPorts(Collection<Port> ports) {
		this.ports = ports;
	}
	
}
