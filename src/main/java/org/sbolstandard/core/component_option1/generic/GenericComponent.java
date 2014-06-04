package org.sbolstandard.core.component_option1.generic;

import java.net.URI;

import org.sbolstandard.core.component_option1.Component;

public class GenericComponent extends Component {

	/**
	 * 
	 * @param identity identity for the generic component
	 * @param displayId display ID for the generic component
	 * @param type type for the generic component
	 */
	public GenericComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}

}
