package org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public abstract class Documented 
	extends Identified {

	private String displayId;
	private String name;
	private String description;
	
	public Documented(URI identity, String displayId) {
		super(identity);
		this.displayId = displayId;
	}

	public String getDisplayId() {
		return displayId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
