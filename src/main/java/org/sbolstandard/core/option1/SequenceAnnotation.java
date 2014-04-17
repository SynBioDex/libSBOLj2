package org.sbolstandard.core.option1;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

import org.apache.commons.lang.ArrayUtils;
import org.sbolstandard.core.ComponentInstantiation;
import org.sbolstandard.core.Orientation;


public class SequenceAnnotation 
		extends ComponentInstantiation {

	private int start;
	private int end;
	private Orientation orientation;
	private Collection<SequenceAnnotation> precedes;
	private SequenceComponent instantiates;
	
	/**
	 * 
	 * @param identity
	 * @param displayId
	 */
	public SequenceAnnotation(URI identity, String displayId, SequenceComponent instantiates) {
		super(identity, displayId);
		
		this.instantiates = instantiates;
		this.precedes = new HashSet<SequenceAnnotation>();
	}

	@Override
	public SequenceComponent getInstantiates() {
		return this.instantiates;
	}

	/**
	 * getStart
	 * 
	 * @return
	 */
	public int getStart() {
		return start;
	}

	/**
	 * setStart
	 * 
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * getEnd
	 * 
	 * @return
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * setEnd
	 * 
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * getOrientation
	 * 
	 * @return
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * setOrientation
	 * 
	 */
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	/**
	 * getPrecedes
	 * 
	 * @return a list of all predecessors of this sequence annotation
	 */
	public Collection<SequenceAnnotation> getPrecedes() {
		
		return this.precedes;
		
//		/*
//		 * iterate (recursively) over all predecessors and build the array
//		 * here, we utilize the Apache Commons Lang library... 
//		 */
//		SequenceAnnotation[] sa = null;
//		if(null != this.precedes) {
//			sa = (SequenceAnnotation[])ArrayUtils.add(
//					this.precedes.getPrecedes(), 
//					this.precedes);
//		} else {
//			sa = new SequenceAnnotation[1];
//			sa[0] = this.precedes;
//			return sa;
//		}
//		return sa;
	}

	/**
	 * setPrecedes
	 * 
	 */
	public void setPrecedes(Collection<SequenceAnnotation> precedes) {
		this.precedes = precedes;
	}
	
}
