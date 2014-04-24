package org.sbolstandard.core.option2.oriented.generic;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

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
		this.precedes = new HashSet<GenericOrientedAnnotation>();
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
		return this.precedes;
	}
	
	/**
	 * 
	 * @param precedes is a collection of generic oriented annotations 
	 */
	public void setPrecedes(Collection<GenericOrientedAnnotation> precedes) {
		this.precedes = precedes;
	}

}
