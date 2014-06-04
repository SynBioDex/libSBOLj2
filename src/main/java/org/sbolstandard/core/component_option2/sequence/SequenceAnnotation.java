package org.sbolstandard.core.component_option2.sequence;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import org.sbolstandard.core.Documented;
import org.sbolstandard.core.component_option2.ComponentInstantiation;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public abstract class SequenceAnnotation<CI extends ComponentInstantiation> extends Documented {

	private int start;
	private int end;
	private CI subComponentInstantiation;
	private Collection<SequenceAnnotation<CI>> precededAnnotations;

	/**
	 * 
	 * @param identity an identity for the sequence annotation
	 * @param displayId a display ID for the sequence annotation
	 */
	public SequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
		precededAnnotations = new HashSet<SequenceAnnotation<CI>>();
	}
	
	/**
	 * 
	 * @param identity an identity for the sequence annotation
	 * @param displayId a display ID for the sequence annotation
	 * @param a starting position for the sequence annotation
	 * @param an ending position for the sequence annotation
	 */
	public SequenceAnnotation(URI identity, String displayId, int start, int end) {
		this(identity, displayId);
		this.start = start;
		this.end = end;
	}
	
	/**
	 * 
	 * @return the sequence annotation's starting position
	 */
	public int getStart() {
		return start;
	}

	/**
	 * 
	 * @return the sequence annotation's ending position
	 */
	public int getEnd() {
		return end;
	}
	
	/**
	 * 
	 * @return the sequence annotation's subcomponent instantiation
	 */
	public CI getSubComponentInstantiation() {
		return subComponentInstantiation;
	}
	
	/**
	 * 
	 * @param subComponentInstantiation a subcomponent instantiation for the sequence annotation
	 */
	public void setSubComponentInstantiation(CI subComponentInstantiation) {
		this.subComponentInstantiation = subComponentInstantiation;
	}
	
	/**
	 * 
	 * @return a collection of sequence annotations preceded by this sequence annotation
	 */
	public Collection<SequenceAnnotation<CI>> getPrecededAnnotations() {
		return precededAnnotations;
	}

	/**
	 * 
	 * @param precededAnnotation a preceded sequence annotations for this 
	 * 		  sequence annotation
	 */
	public void addPrecededAnnotation(SequenceAnnotation<CI> precededAnnotation) {
		precededAnnotations.add(precededAnnotation);
	}
	
}
