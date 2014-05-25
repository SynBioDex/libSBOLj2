package org.sbolstandard.core.option2;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import org.sbolstandard.core.Component;
import org.sbolstandard.core.Port;
import org.sbolstandard.core.option2.Sequence;


/**
 * 
 * @author Ernst Oberortner
 */
public abstract class SequenceComponent<SA extends SequenceAnnotation> extends Component {

	private Collection<URI> sequenceTypes;
	private Collection<Port> ports;
	
	public SequenceComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
		
		this.sequenceTypes = new HashSet<URI>();
	}

	/**
	 * 
	 * @return
	 */
	public Collection<URI> getSequenceTypes() {
		return sequenceTypes;
	}
	
	/**
	 * 
	 * @param sequenceTypes a Collection of URIs
	 */
	public void setSequenceTypes(Collection<URI> sequenceTypes) {
		this.sequenceTypes = sequenceTypes;
	}

	/**
	 * 
	 * @return
	 */
	public Collection<Port> getPorts() {
		return ports;
	}

	/**
	 * 
	 * @param ports
	 */
	public void setPorts(Collection<Port> ports) {
		this.ports = ports;
	}
	
	// abstract methods
	public abstract Collection<SA> getSequenceAnnotations();
	public abstract void setSequenceAnnotations(Collection<SA> sequenceAnnotations);
	public abstract Sequence getSequence();
	public abstract void setSequence(Sequence sequence);
}
