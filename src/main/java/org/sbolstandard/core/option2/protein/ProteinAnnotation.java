package src.main.java.org.sbolstandard.core.option2.protein;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import src.main.java.org.sbolstandard.core.option2.SequenceAnnotation;

/**
 * 
 * @author Ernst Oberortner
 */
public class ProteinAnnotation extends SequenceAnnotation {

	private Collection<ProteinAnnotation> precedes;
	private ProteinComponent instantiates;
	
	public ProteinAnnotation(URI identity, String displayId, ProteinComponent instantiates) {
		super(identity, displayId);

		this.instantiates = instantiates;
		this.precedes = new HashSet<ProteinAnnotation>();
	}

	/**
	 * 
	 */
	@Override
	public ProteinComponent getInstantiates() {
		return this.instantiates;
	}
	
	/**
	 * 
	 * @return a collection of protein annotations preceded by this
	 */
	public Collection<ProteinAnnotation> getPrecedes() {
		return this.precedes;
	}

	/**
	 * 
	 * @param precedes a collection of generic sequence annotations preceded by this
	 */
	public void setPrecedes(Collection<ProteinAnnotation> precedes) {
		this.precedes = precedes;
	}

}
