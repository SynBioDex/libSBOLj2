package org.sbolstandard.core.option2.oriented.dna;

import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;

import org.sbolstandard.core.Orientation;
import org.sbolstandard.core.option2.oriented.OrientedAnnotation;

/**
 * 
 * @author Ernst Oberortner
 */
public class DnaAnnotation 
	extends OrientedAnnotation {

	private Collection<DnaAnnotation> precedes;
	private DnaComponent instantiates;
	
	public DnaAnnotation(URI identity, String displayId, Orientation orientation, DnaComponent instantiates) {
		super(identity, displayId, orientation);

		this.instantiates = instantiates;
		this.precedes = new LinkedList<DnaAnnotation>();
	}

	/**
	 * 
	 */
	@Override
	public DnaComponent getInstantiates() {
		return this.instantiates;
	}
	
	/**
	 * 
	 * @return the collection of preceding DNA annotations
	 */
	public Collection<DnaAnnotation> getPrecedes() {
		// for the time being, we only return the collection of 
		// preceding DNA annotations
		return this.precedes;
//		/*
//		 * iterate (recursively) over all predecessors and build the array
//		 * here, we utilize the Apache Commons Lang library... 
//		 */
//		Collection<DnaAnnotation> annos = new LinkedList<DnaAnnotation>();
//		if(null != this.precedes && !this.precedes.isEmpty()) {
//			for(DnaAnnotation da : this.precedes) {
//				annos.addAll(da.getPrecedes());
//			}
//		}
//		return annos;
	}
	
	/**
	 * 
	 * @param precedes is a collection of preceding DNA annotations
	 */
	public void setPrecedes(Collection<DnaAnnotation> precedes) {
		this.precedes = precedes;
	}

}
