package org.sbolstandard.core.option2.oriented.generic;

import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;

import org.sbolstandard.core.Orientation;
import org.sbolstandard.core.option2.oriented.OrientedAnnotation;

/**
 * 
 * @author Ernst Oberortner
 */
public class GenericOrientedAnnotation 
	extends OrientedAnnotation {

	private Collection<GenericOrientedAnnotation> precedes;
	private GenericOrientedComponent instantiates;
	
	public GenericOrientedAnnotation(URI identity, String displayId, Orientation orientation, GenericOrientedComponent instantiates) {
		super(identity, displayId, orientation);

		this.instantiates = instantiates;
		this.precedes = new LinkedList<GenericOrientedAnnotation>();
	}

	/**
	 * 
	 */
	@Override
	public GenericOrientedComponent getInstantiates() {
		return this.instantiates;
	}
	
	/**
	 * 
	 * @return the collection of preceding generic oriented annotations
	 */
	public Collection<GenericOrientedAnnotation> getPrecedes() {
		// for the time being, we only return the collection of 
		// preceding generic oriented annotations
		return this.precedes;
//		/*
//		 * iterate (recursively) over all predecessors and build the array
//		 * here, we utilize the Apache Commons Lang library... 
//		 */
//		Collection<GenericOrientedAnnotation> annos = new LinkedList<GenericOrientedAnnotation>();
//		if(null != this.precedes && !this.precedes.isEmpty()) {
//			for(GenericOrientedAnnotation da : this.precedes) {
//				annos.addAll(da.getPrecedes());
//			}
//		}
//		return annos;
	}
	
	/**
	 * 
	 * @param precedes is a collection of generic oriented annotations 
	 */
	public void setPrecedes(Collection<GenericOrientedAnnotation> precedes) {
		this.precedes = precedes;
	}

}
