package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;
import java.util.HashSet;

public class SBOLCollection 
	extends Documented {

	private Collection<Identified> elements;

	public SBOLCollection(URI identity, String displayId) {
		super(identity, displayId);
		elements = new HashSet<Identified>();
	}
	
	public void setElements(Collection<Identified> elements) {
		this.elements = elements;
	}

	public Collection<Identified> getElements() {
		return elements;
	}
}
