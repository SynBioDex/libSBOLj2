package org.sbolstandard.core.option2.oriented.rna;

import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;

import org.sbolstandard.core.Orientation;
import org.sbolstandard.core.option2.oriented.OrientedAnnotation;

/**
 * 
 * @author Ernst Oberortner
 */
public class RnaAnnotation 
	extends OrientedAnnotation {

	private Collection<RnaAnnotation> precedes;
	private RnaComponent instantiates;
	
	public RnaAnnotation(URI identity, String displayId, Orientation orientation, RnaComponent instantiates) {
		super(identity, displayId, orientation);

		this.instantiates = instantiates;
		this.precedes = new LinkedList<RnaAnnotation>();
	}

	/**
	 * 
	 */
	@Override
	public RnaComponent getInstantiates() {
		return this.instantiates;
	}
	
	/**
	 * 
	 * @return the collection of preceding RNA annotations
	 */
	public Collection<RnaAnnotation> getPrecedes() {
		// for the time being, we only return the collection
		// of RNA annotations
		return this.precedes;
//		/*
//		 * iterate (recursively) over all predecessors and build the array
//		 * here, we utilize the Apache Commons Lang library... 
//		 */
//		Collection<RnaAnnotation> annos = new LinkedList<RnaAnnotation>();
//		if(null != this.precedes && !this.precedes.isEmpty()) {
//			for(RnaAnnotation da : this.precedes) {
//				annos.addAll(da.getPrecedes());
//			}
//		}
//		return annos;
	}
	
	/**
	 * 
	 * @param precedes is a collection of preceding RNA annotations
	 */
	public void setPrecedes(Collection<RnaAnnotation> precedes) {
		this.precedes = precedes;
	}

}
