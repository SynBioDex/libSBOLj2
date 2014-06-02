package src.test.java.org.sbolstandard.designs;

import java.net.URI;

import src.main.java.org.sbolstandard.core.Component;
import src.main.java.org.sbolstandard.core.Module;
import src.main.java.org.sbolstandard.core.option1.SequenceComponent;

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
		Component p1 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/p1"), 
				"Promoter p1",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0000167"),
				URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		Component p2 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/p2"), 
				"Promoter p2",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0000167"),
				URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		
		// 2 repressors
		Component c1 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/c1"), 
				"Coding Sequence c1 (Repressor)",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0001580"),
				URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
		Component c2 = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/c2"), 
				"Coding Sequence c2 (Repressor)",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0001580"),
				URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));

		// 1 reporter (e.g. GFP)
		Component gfp = new SequenceComponent(
				URI.create("http://sbolstandard.org/toggle-switch/gfp"), 
				"Reporting Gene GFP",
				URI.create("http://www.sequenceontology.org/miso/current_release/term/SO:0000123"),
				URI.create("http://www.sequenceontology.org/browser/current_release/term/SO:0000352"));
	

		// how do I add the components to the module?
	}
	
	private void serialize() {
		// TODO:
	}
	

}
