package org.sbolstandard.core;

import java.net.URI;

public class SequenceAnnotation 
		extends ComponentInstantiation {

	private int start;
	private int end;
	private Orientation orientation;
	private SequenceAnnotation precedes;
	private SequenceComponent instantiates;
	
	/**
	 * 
	 * @param identity
	 * @param displayId
	 */
	public SequenceAnnotation(URI identity, String displayId, SequenceComponent instantiates) {
		super(identity, displayId);
		
		this.setInstantiates(instantiates);
	}

	@Override
	public Component getInstantiated() {
		// TODO Auto-generated method stub
		return null;
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
	 * @return
	 */
	public SequenceAnnotation getPrecedes() {
		return precedes;
	}

	/**
	 * setPrecedes
	 * 
	 */
	public void setPrecedes(SequenceAnnotation precedes) {
		this.precedes = precedes;
	}

	
	/**
	 * setPrecedes
	 * 
	 * @return
	 */
	public SequenceComponent getInstantiates() {
		return instantiates;
	}

	/**
	 * setInstantiates
	 * 
	 */
	public void setInstantiates(SequenceComponent instantiates) {
		this.instantiates = instantiates;
	}

}
