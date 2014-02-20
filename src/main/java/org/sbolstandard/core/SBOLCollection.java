package org.sbolstandard.core;

import java.net.URI;
import java.util.Collection;

public class SBOLCollection 
	extends Documented {

	private Collection<Identified> elements;

	public SBOLCollection(URI identity, String displayId) {
		super(identity, displayId);
	}

	public Collection<Identified> getElements() {
		return this.elements;
	}
}
