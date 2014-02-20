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
	
	public Model(URI identity, String displayId, 
			URI source, URI language, URI framework, URI role) {
		super(identity, displayId);
		
		this.setSource(source);
		this.setLanguage(language);
		this.setFramework(framework);
		this.setRole(role);				
	}

	/**
	 * @return the source
	 */
	public URI getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(URI source) {
		this.source = source;
	}

	/**
	 * @return the language
	 */
	public URI getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(URI language) {
		this.language = language;
	}

	/**
	 * @return the framework
	 */
	public URI getFramework() {
		return framework;
	}

	/**
	 * @param framework the framework to set
	 */
	public void setFramework(URI framework) {
		this.framework = framework;
	}

	/**
	 * @return the role
	 */
	public URI getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(URI role) {
		this.role = role;
	}

}
