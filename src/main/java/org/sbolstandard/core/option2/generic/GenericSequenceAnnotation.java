package src.main.java.org.sbolstandard.core.option2.generic;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import src.main.java.org.sbolstandard.core.option2.SequenceAnnotation;

public class GenericSequenceAnnotation extends SequenceAnnotation {

	private GenericSequenceComponent instantiates;
	private Collection<GenericSequenceAnnotation> precedes;

	public GenericSequenceAnnotation(URI identity, String displayId, 
			GenericSequenceComponent instantiates) {
		
		super(identity, displayId);
		
		this.instantiates = instantiates;
		this.precedes = new HashSet<GenericSequenceAnnotation>();
	}
	
	@Override
	public GenericSequenceComponent getInstantiates() {
		return this.instantiates;
	}

	/**
	 * 
	 * @return a collection of generic sequence annotations preceded by this
	 */
	public Collection<GenericSequenceAnnotation> getPrecedes() {
		return this.precedes;
	}
	
	/**
	 * 
	 * @param precedes a collection of generic sequence annotations preceded by this
	 */
	public void setPrecedes(Collection<GenericSequenceAnnotation> precedes) {
		this.precedes = precedes;
	}

}
