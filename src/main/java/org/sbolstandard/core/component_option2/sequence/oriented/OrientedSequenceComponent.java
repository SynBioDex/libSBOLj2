package org.sbolstandard.core.component_option2.sequence.oriented;

import java.net.URI;

import org.sbolstandard.core.component_option2.ComponentInstantiation;
import org.sbolstandard.core.component_option2.sequence.Sequence;
import org.sbolstandard.core.component_option2.sequence.SequenceComponent;

/**
 * 
 * @author Ernst Oberortner
 * @author Nicholas Roehner
 */
public abstract class OrientedSequenceComponent<CI extends ComponentInstantiation, SE extends Sequence, 
		OA extends OrientedSequenceAnnotation<CI>> extends SequenceComponent<CI, SE, OA> {

	/**
	 * 
	 * @param identity an identity for the oriented component
	 * @param displayId a display ID for the oriented component
	 * @param type a type for the oriented component
	 */
	public OrientedSequenceComponent(URI identity, String displayId, URI type) {
		super(identity, displayId, type);
	}
	
}
