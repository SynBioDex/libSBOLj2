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

	/**
	 * 
	 * @return the displayId of the documented object
	 */
	public String getDisplayId() {
		return displayId;
	}

	/**
	 * 
	 * @return the name of the documented object
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name ... the indented name of the documented object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the description of the documented object
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description ... the description of the documented object
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
