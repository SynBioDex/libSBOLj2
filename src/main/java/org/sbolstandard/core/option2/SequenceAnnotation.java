package org.sbolstandard.core.option2;

import java.net.URI;

import org.apache.commons.lang.ArrayUtils;
import org.sbolstandard.core.ComponentInstantiation;
import org.sbolstandard.core.Orientation;


public abstract class SequenceAnnotation 
		extends ComponentInstantiation {

	private int start;
	private int end;
	
	/**
	 * 
	 * @param identity
	 * @param displayId
	 */
	public SequenceAnnotation(URI identity, String displayId) {
		super(identity, displayId);
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
	 * getPrecedes
	 * 
	 * @return a list of all predecessors of this sequence annotation
	 */
//	public SequenceAnnotation[] getPreceded() {
//		/*
//		 * iterate (recursively) over all predecessors and build the array
//		 * here, we utilize the Apache Commons Lang library... 
//		 */
//		SequenceAnnotation[] sa = null;
//		if(null != this.precedes) {
//			sa = (SequenceAnnotation[])ArrayUtils.add(
//					this.precedes.getPreceded(), 
//					this.precedes);
//		} else {
//			sa = new SequenceAnnotation[1];
//			sa[0] = this.precedes;
//			return sa;
//		}
//		return sa;
//	}

	/**
	 * setPrecedes
	 * 
	 */
//	public void setPrecedes(SequenceAnnotation precedes) {
//		this.precedes = precedes;
//	}
	
}
