package src.main.java.org.sbolstandard.core.option2.protein;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import src.main.java.org.sbolstandard.core.option2.Sequence;
import src.main.java.org.sbolstandard.core.option2.SequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class ProteinComponent extends SequenceComponent<ProteinAnnotation> {

	private Collection<ProteinAnnotation> sequenceAnnotations;
	private ProteinSequence sequence;
	
	public ProteinComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<ProteinAnnotation>();
	}
	
	//TODO SubtilinReceiver.java calls this constructor. Make note that the parameter is incorrect. To 
	//remove the errors, this temporary structure was set. 
	public ProteinComponent(URI identity, String displayId, URI type, URI type2) {
		super(identity, displayId, type);
	}

	@Override
	public Collection<ProteinAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<ProteinAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public ProteinSequence getSequence() {
		return this.sequence;
	}
	
	//@Override
	public void setProteinSequence(ProteinSequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public void setSequence(Sequence sequence) {
		setProteinSequence((ProteinSequence)sequence);
		
	}

}
