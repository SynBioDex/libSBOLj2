package org.sbolstandard.core.component_option2.sequence;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.sbolstandard.core.component_option2.Component;
import org.sbolstandard.core.component_option2.ComponentInstantiation;
import org.sbolstandard.core.component_option2.sequence.Sequence;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public abstract class SequenceComponent<CI extends ComponentInstantiation, SE extends Sequence, 
		SA extends SequenceAnnotation<CI>> extends Component {

	private SE sequence;
	private Collection<URI> sequenceTypes;
	private Collection<SA> sequenceAnnotations;
	
	/**
	 * 
	 * @param identity an identity for the sequence component
	 * @param displayId a display ID for the sequence component
	 * @param type a type for the sequence component
	 */
	public SequenceComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
		sequenceTypes = new HashSet<URI>();
		sequenceAnnotations = new ArrayList<SA>();
	}
	
	/**
	 * 
	 * @return the sequence component's sequence
	 */
	public SE getSequence() {
		return sequence;
	}
	
	/**
	 * 
	 * @param sequence a sequence for the sequence component
	 */
	public void setSequence(SE sequence) {
		this.sequence = sequence;
	}

	/**
	 * 
	 * @return a collection of the sequence component's sequence types
	 */
	public Collection<URI> getSequenceTypes() {
		return sequenceTypes;
	}
	
	/**
	 * 
	 * @param sequenceType a sequence type for the sequence component
	 */
	public void addSequenceType(URI sequenceType) {
		sequenceTypes.add(sequenceType);
	}
	
	/**
	 * 
	 * @return a collection of the sequence component's sequence annotations
	 */
	public Collection<SA> getSequenceAnnotations() {
		return sequenceAnnotations;
	}
	
	/**
	 * 
	 * @param sequenceAnnotation a sequence annotation for the sequence component
	 */
	public void addSequenceAnnotation(SA sequenceAnnotation) {
		sequenceAnnotations.add(sequenceAnnotation);
	}
	
}
