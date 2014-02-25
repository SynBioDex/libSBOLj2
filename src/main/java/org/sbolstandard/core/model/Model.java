/**
 * 
 */
package org.sbolstandard.core.model;

import java.net.URI;

import org.sbolstandard.core.Documented;


/**
 * @author Ernst Oberortner
 *
 */
public class Model 
	extends Documented {

	private URI source;
	private URI language;
	private URI framework;
	private URI role;
	
	/**
	 * 
	 * @param identity   ... the identity URI of the model
	 * @param displayId  ... the displayId as String of the model
	 * @param source     ... the source's URI of the model
	 * @param language   ... the language's URI of the model
	 * @param framework  ... the framework's URI of the model
	 * @param role       ... the role's URI of the model
	 */
	public Model(URI identity, String displayId, 
			URI source, URI language, URI framework, URI role) {
		super(identity, displayId);
		
		this.source = source;
		this.language = language;
		this.framework = framework;
		this.role = role;
	}

	/**
	 * @return the source's URI
	 */
	public URI getSource() {
		return source;
	}

	/**
	 * @return the language's URI
	 */
	public URI getLanguage() {
		return language;
	}

	/**
	 * @return the framework's URI
	 */
	public URI getFramework() {
		return framework;
	}

	/**
	 * @return the role's URI
	 */
	public URI getRole() {
		return role;
	}

}
