package org.sbolstandard.core.option2;

import java.net.URI;
import java.util.Collection;

import org.sbolstandard.core.Component;
import org.sbolstandard.core.Port;
import org.sbolstandard.core.option2.Sequence;


/**
 * 
 * @author Ernst Oberortner
 */
public abstract class SequenceComponent<SA extends SequenceAnnotation, SEQ extends Sequence>
		extends Component {

	// in Option 2:
	// do we really need a sequence type?
	private URI sequenceType;
	
	private Collection<Port> ports;
	
	public SequenceComponent(URI identity, String displayId, URI type, URI sequenceType) {
		super(identity, displayId, type);
		
		this.sequenceType = sequenceType;
	}

	/**
	 * 
	 * @return
	 */
	public URI getSequenceType() {
		return sequenceType;
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
	public abstract SEQ getSequence();
}
