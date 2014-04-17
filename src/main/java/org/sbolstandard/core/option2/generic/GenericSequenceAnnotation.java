package org.sbolstandard.core.option2.generic;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import org.sbolstandard.core.option2.SequenceAnnotation;

public class GenericSequenceAnnotation 
		extends SequenceAnnotation<GenericSequenceAnnotation> {

	private GenericSequenceComponent instantiates;
	private Collection<GenericSequenceAnnotation> precedes;

	public GenericSequenceAnnotation(URI identity, String displayId, 
			GenericSequenceComponent instantiates) {
		
		super(identity, displayId);
		
		this.precedes = new HashSet<GenericSequenceAnnotation>();
		this.instantiates = instantiates;
	}

	/**
	 * 
	 * @return the collection of preceding generic sequence annotations
	 */
	public Collection<GenericSequenceAnnotation> getPrecedes() {
		// for the time being, we only return the collection of
		// preceding generic sequence annotations
		return this.precedes;
//		/*
//		 * iterate (recursively) over all predecessors and build the array
//		 * here, we utilize the Apache Commons Lang library... 
//		 */
//		Collection<GenericSequenceAnnotation> annos = new LinkedList<GenericSequenceAnnotation>();
//		if(null != this.precedes && !this.precedes.isEmpty()) {
//			for(GenericSequenceAnnotation da : this.precedes) {
//				annos.addAll(da.getPrecedes());
//			}
//		}
//		return annos;
	}
	/**
	 * 
	 * @param precedes a collection of preceding generic sequence annotations
	 */
	public void setPrecedes(Collection<GenericSequenceAnnotation> precedes) {
		this.precedes = precedes;
	}

	@Override
	public GenericSequenceComponent getInstantiates() {
		return this.instantiates;
	}

}
