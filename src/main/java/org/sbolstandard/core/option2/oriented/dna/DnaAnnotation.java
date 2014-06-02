package src.main.java.org.sbolstandard.core.option2.oriented.dna;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import src.main.java.org.sbolstandard.core.Orientation;
import src.main.java.org.sbolstandard.core.option2.oriented.OrientedAnnotation;

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
		this.precedes = new HashSet<DnaAnnotation>();
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
	 * @return a collection of dna annotations preceded by this
	 */
	public Collection<DnaAnnotation> getPrecedes() {
		return this.precedes;
	}
	
	/**
	 * 
	 * @param precedes a collection of dna annotations preceded by this
	 */
	public void setPrecedes(Collection<DnaAnnotation> precedes) {
		this.precedes = precedes;
	}

}
