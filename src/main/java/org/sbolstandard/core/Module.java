/**
 * 
 */
package org.sbolstandard.core;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import org.sbolstandard.core.context.Context;
import org.sbolstandard.core.interaction.Interaction;
import org.sbolstandard.core.model.Model;

/**
 * @author Ernst Oberortner
 *
 */
public class Module 
		extends Documented {

	private Collection<Signal> signals;
	private Collection<ModuleInstantiation> subModules;
	private Collection<Context> contexts;
	private Collection<Model> models;
	private Collection<Port> ports;
	private Collection<Interaction> interactions;
	
	public Module(URI identity, String displayId) {
		super(identity, displayId);
	}

	/**
	 * @return the signals
	 */
	public Collection<Signal> getSignals() {
		return signals;
	}

	/**
	 * @param signals the signals to set
	 */
	public void setSignals(Collection<Signal> signals) {
		this.signals = signals;
	}

	/**
	 * @return the subModules
	 */
	public Collection<ModuleInstantiation> getSubModules() {
		return subModules;
	}

	/**
	 * @param subModules the subModules to set
	 */
	public void setSubModules(Collection<ModuleInstantiation> subModules) {
		this.subModules = subModules;
	}

	/**
	 * @return the contexts
	 */
	public Collection<Context> getContexts() {
		return contexts;
	}

	/**
	 * @param contexts the contexts to set
	 */
	public void setContexts(Collection<Context> contexts) {
		this.contexts = contexts;
	}

	/**
	 * @return the models
	 */
	public Collection<Model> getModels() {
		return models;
	}

	/**
	 * @param models the models to set
	 */
	public void setModels(Collection<Model> models) {
		this.models = models;
	}

	/**
	 * @return the ports
	 */
	public Collection<Port> getPorts() {
		return ports;
	}

	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Collection<Port> ports) {
		this.ports = ports;
	}
	
	/**
	 * @return the interactions
	 */
	public Collection<Interaction> getInteractions() {
		return interactions;
	}

	/**
	 * @param interactions the interactions to set
	 */
	public void setInteractions(Collection<Interaction> interactions) {
		this.interactions = interactions;
	}

}
