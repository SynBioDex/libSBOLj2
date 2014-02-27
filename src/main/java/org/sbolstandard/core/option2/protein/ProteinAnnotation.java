package org.sbolstandard.core.option2.protein;

import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;

import org.sbolstandard.core.Orientation;
import org.sbolstandard.core.option2.oriented.OrientedAnnotation;

/**
 * 
 * @author Ernst Oberortner
 */
public class ProteinAnnotation 
	extends OrientedAnnotation {

	private Collection<ProteinAnnotation> precedes;
	private ProteinComponent instantiates;
	
	public ProteinAnnotation(URI identity, String displayId, Orientation orientation, ProteinComponent instantiates) {
		super(identity, displayId, orientation);

		this.instantiates = instantiates;
		this.precedes = new LinkedList<ProteinAnnotation>();
	}

	/**
	 * 
	 */
	@Override
	public ProteinComponent getInstantiated() {
		return this.instantiates;
	}
	
	/**
	 * 
	 * @return
	 */
	public Collection<ProteinAnnotation> getPreceded() {
		/*
		 * iterate (recursively) over all predecessors and build the array
		 * here, we utilize the Apache Commons Lang library... 
		 */
		Collection<ProteinAnnotation> annos = new LinkedList<ProteinAnnotation>();
		if(null != this.precedes && !this.precedes.isEmpty()) {
			for(ProteinAnnotation da : this.precedes) {
				annos.addAll(da.getPreceded());
			}
		}
		return annos;
	}

}
