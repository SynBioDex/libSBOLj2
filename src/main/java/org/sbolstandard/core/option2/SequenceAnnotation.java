package org.sbolstandard.core.option2;

import java.net.URI;
import java.util.Collection;

import main.java.org.sbolstandard.core.Component;

import org.sbolstandard.core.ComponentInstantiation;

/**
 * 
 * @author Ernst Oberortner
 *
 * @param <SA>
 * how can we do tell that SA must extend SequenceAnnotation?
 * 
 * using "SA extends SequenceAnnotation" is recursive ...
 * 
 * removing <SA> causes to remove the getPrecedes() method ...
 * 
 * any suggestions?
 */

public abstract class SequenceAnnotation extends ComponentInstantiation {

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
	
	@Override
	public abstract SequenceComponent getInstantiates();
}
