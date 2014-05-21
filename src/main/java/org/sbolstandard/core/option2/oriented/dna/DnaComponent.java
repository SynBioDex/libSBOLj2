package src.main.java.org.sbolstandard.core.option2.oriented.dna;

import java.net.URI;
import java.util.Collection;
import java.util.ArrayList;

import src.main.java.org.sbolstandard.core.option2.Sequence;
import src.main.java.org.sbolstandard.core.option2.oriented.OrientedComponent;

/**
 * 
 * @author Ernst Oberortner
 *
 */
public class DnaComponent extends OrientedComponent<DnaAnnotation> {

	private Collection<DnaAnnotation> sequenceAnnotations;
	private DnaSequence sequence;
	
	public DnaComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<DnaAnnotation>();
	}
	
	//TODO SubtilinReceiver.java calls this constructor. Make note that the parameter is incorrect. To 
	//remove the errors, this temporary structure was set. 
	public DnaComponent(URI identity, String displayId, URI type, URI type2) {
		super(identity, displayId, type);

	}

	@Override
	public Collection<DnaAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<DnaAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public DnaSequence getSequence() {
		return this.sequence;
	}
	
	//@Override
	public void setDnaSequence(DnaSequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public void setSequence(Sequence sequence) {
		setDnaSequence((DnaSequence)sequence);
		
	}

}
