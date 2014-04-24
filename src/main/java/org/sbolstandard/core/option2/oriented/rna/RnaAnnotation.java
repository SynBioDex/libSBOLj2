package org.sbolstandard.core.option2.oriented.rna;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

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
		this.precedes = new HashSet<RnaAnnotation>();
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
		return this.precedes;
	}
	
	/**
	 * 
	 * @param precedes is a collection of preceding RNA annotations
	 */
	public void setPrecedes(Collection<RnaAnnotation> precedes) {
		this.precedes = precedes;
	}

}
