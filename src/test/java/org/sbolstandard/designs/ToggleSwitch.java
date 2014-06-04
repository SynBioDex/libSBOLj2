package org.sbolstandard.designs;

import java.net.URI;

import org.sbolstandard.core.component_option1.sequence.SequenceComponent;
import org.sbolstandard.core.component_option1.Component;
import org.sbolstandard.core.module_option1.Module;

public class ToggleSwitch {

	/**
	 * that's the module which 
	 * combines the entire Toggle-Switch design
	 * 
	 */
	private Module m;
	
	public ToggleSwitch() {
		this.m = new Module(
				URI.create("http://sbolstandard.org/toggle-switch/p1"), 
				"Toggle-Switch");
	}
	
	public static void main(String[] args) {
		ToggleSwitch ts = new ToggleSwitch();
		
		ts.design();
		ts.serialize();
		
	}
	
	
	private void design() {
		
		// we have 5 components:
		// 2 promoters
		SequenceComponent p1 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/p1"), 
				"Promoter p1",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0000167"));
		p1.addSequenceType(URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		SequenceComponent p2 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/p2"), 
				"Promoter p2",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0000167"));
		p2.addSequenceType(URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		// 2 repressors
		SequenceComponent c1 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/c1"), 
				"Coding Sequence c1 (Repressor)",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0001580"));
		c1.addSequenceType(URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		SequenceComponent c2 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/c2"), 
				"Coding Sequence c2 (Repressor)",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0001580"));
		c2.addSequenceType(URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		// 1 reporter (e.g. GFP)
		SequenceComponent gfp = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/gfp"), 
				"Reporting Gene GFP",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0000123"));
		gfp.addSequenceType(URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));

		// how do I add the components to the module?
	}
	
	private void serialize() {
		// TODO:
	}
	

}
