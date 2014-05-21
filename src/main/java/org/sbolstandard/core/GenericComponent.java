package src.main.java.org.sbolstandard.core;

import java.net.URI;

/**
 * 
 * @author Ernst Oberortner
 */
public class GenericComponent 
	extends Component {

	/**
	 * 
	 * @param identity  ... the identity URI of the Generic Component
	 * @param displayId ... the displayId as String of the Generic Component
	 * @param type      ... the type URI of the Generic Component (SequenceOntology)
	 */
	public GenericComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}

}
