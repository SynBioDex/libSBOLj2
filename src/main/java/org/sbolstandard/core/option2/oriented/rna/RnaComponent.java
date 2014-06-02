package src.main.java.org.sbolstandard.core.option2.oriented.rna;

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
public class RnaComponent extends OrientedComponent<RnaAnnotation> {

	private Collection<RnaAnnotation> sequenceAnnotations;
	private RnaSequence sequence;
	
	public RnaComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);

		this.sequenceAnnotations = new ArrayList<RnaAnnotation>();
	}

	@Override
	public Collection<RnaAnnotation> getSequenceAnnotations() {
		return this.sequenceAnnotations;
	}
	
	@Override
	public void setSequenceAnnotations(Collection<RnaAnnotation> sequenceAnnotations) {
		this.sequenceAnnotations = sequenceAnnotations;
	}

	@Override
	public RnaSequence getSequence() {
		return this.sequence;
	}
	
	//@Override
	public void setRnaSequence(RnaSequence sequence) {
		this.sequence = sequence;
	}

	@Override
	public void setSequence(Sequence sequence) {
		setRnaSequence((RnaSequence)sequence);
		
	}

}
