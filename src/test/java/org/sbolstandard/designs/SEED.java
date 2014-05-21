package src.test.java.org.sbolstandard.designs;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import src.main.java.org.sbolstandard.core.Component;
import src.main.java.org.sbolstandard.core.ComponentInstantiation;
import src.main.java.org.sbolstandard.core.GenericComponent;
import src.main.java.org.sbolstandard.core.Module;
import src.main.java.org.sbolstandard.core.Port;
import src.main.java.org.sbolstandard.core.PortMap;
import src.main.java.org.sbolstandard.core.Signal;
import src.main.java.org.sbolstandard.core.interaction.Interaction;
import src.main.java.org.sbolstandard.core.interaction.Participation;
import src.main.java.org.sbolstandard.core.ontology.SequenceOntology;
import src.main.java.org.sbolstandard.core.option1.SequenceAnnotation;
import src.main.java.org.sbolstandard.core.option1.SequenceComponent;

public class SEED {

	private static String URI_PREFIX = "http://www.async,ece.utah.edu/";
	
	/*
	 * the following sets are our ``universe''
	 */
	private Map<String, Component> components;
	private Map<String, Module> modules;
	
	public SEED() {
		this.components = new HashMap<String, Component>();
		this.modules = new HashMap<String, Module>();
	}
	
	public static void main(String[] args) {

		SEED seed = new SEED();
		seed.design();
	}
	
	public void design() {
		/*
		 * first, we need to create the
		 * Sequence Components
		 */
		this.createComponents();
		
		/*
		 * LacI Inverter Module
		 */
		this.createModules();
		
	}

	/**
	 * 
	 */
	private void createComponents() {
		this.createSequenceComponents();
		this.createGenericComponents();
		this.createCompositeComponents();
	}
	
	private void createSequenceComponents() {
		/* 
		 * SEQUENCE COMPONENTS 
		 * SequenceComponent(URI identity, String displayId, URI type, URI sequenceType);
		 */
		
		// pLac
		this.components.put("pLac", new SequenceComponent(
						URI.create(URI_PREFIX+"pLac"),         // identity
						"pLac",                                 // displayId
						SequenceOntology.getURI("DNA"),         // type URI
						SequenceOntology.getURI("PROMOTER")));  // sequence type URI
 
		// RBS
		this.components.put("RBS", new SequenceComponent(
				URI.create(URI_PREFIX+"rbs"),         // identity
				"RBS",                                 // displayId
				SequenceOntology.getURI("DNA"),        // type URI
				SequenceOntology.getURI("RBS")));      // sequence type URI

		// LacI
		this.components.put("LacI", new SequenceComponent(
				URI.create(URI_PREFIX+"LacI"),           // identity
				"LacI",                                   // displayId
				SequenceOntology.getURI("PROTEIN"),       // type URI
				SequenceOntology.getURI("TRANSCRIPT")));  // sequence type URI
	

		// TetR
		this.components.put("TetR", new SequenceComponent(
				URI.create(URI_PREFIX+"TetR"),           // identity
				"TetR",                                   // displayId
				SequenceOntology.getURI("PROTEIN"),       // type URI
				SequenceOntology.getURI("TRANSCRIPT")));  // sequence type URI

		// Double Terminator
		this.components.put("Double_Termintator", new SequenceComponent(
				URI.create(URI_PREFIX+"double_terminator"),           // identity
				"Double_Terminator",                                   // displayId
				SequenceOntology.getURI("DNA"),       // type URI
				SequenceOntology.getURI("Terminator")));  // sequence type URI

		// cTetR
		this.components.put("cTetR", new SequenceComponent(
				URI.create(URI_PREFIX+"cTetR"),           // identity
				"cTetR",                                   // displayId
				SequenceOntology.getURI("DNA"),       // type URI
				SequenceOntology.getURI("CDS")));  // sequence type URI

	}
	
	private void createGenericComponents() {
		/*
		 * GENERIC COMPONENTS
		 * GenericComponent(URI identity, String displayId, URI type)
		 */
		
		// IPTC		
		this.components.put("IPTG", new GenericComponent(
				URI.create(URI_PREFIX+"iptg"),               // identity
				"IPTG",                                       // displayId
				SequenceOntology.getURI("small molecule")));  // type URI

		// IPTG-LacI		
		this.components.put("IPTG-LacI", new GenericComponent(
				URI.create(URI_PREFIX+"iptg_lacI"),      // identity
				"IPTG-LacI",                              // displayId
				SequenceOntology.getURI("complex")));     // type URI
	}
	
	private void createCompositeComponents() {
	
		/*
		 * TODO: 
		 * LacI-repressed TetR gene
		 * 
		 * SequenceComponent(URI identity, String displayId, URI type, URI sequenceType)
		 */
		SequenceComponent uu001 = new SequenceComponent(
				URI.create(URI_PREFIX+"UU_001"),          // identity
				"LacI-repressed_TetR_Gene",               // displayId
				SequenceOntology.getURI("Gene"),          // type URI
				SequenceOntology.getURI("Gene"));         // sequence type URI
		uu001.setName("LacI-repressed TetR Gene");
		
		/*
		 * SequenceAnnotations
		 * SequenceAnnotation(URI identity, String displayId, SequenceComponent instantiates)
		 */
		SequenceAnnotation anno1 = new SequenceAnnotation(
				URI.create(URI_PREFIX+"UU_001/anno1"),
				"LacI-repressed_TetR_Gene_anno1",
				(SequenceComponent)this.components.get("pLac"));		
		uu001.getSequenceAnnotations().add(anno1);
		
		SequenceAnnotation anno2 = new SequenceAnnotation(
				URI.create(URI_PREFIX+"UU_001/anno2"),
				"LacI-repressed_TetR_Gene_anno2",
				(SequenceComponent)this.components.get("RBS"));
		uu001.getSequenceAnnotations().add(anno2);

		SequenceAnnotation anno3 = new SequenceAnnotation(
						URI.create(URI_PREFIX+"UU_001/anno3"),
						"LacI-repressed_TetR_Gene_anno3",
						(SequenceComponent)this.components.get("Double_Terminator"));
		uu001.getSequenceAnnotations().add(anno3);
		
		SequenceAnnotation anno4 = new SequenceAnnotation(
						URI.create(URI_PREFIX+"UU_001/anno4"),
						"LacI-repressed_TetR_Gene_anno4",
						(SequenceComponent)this.components.get("cTetR"));
		uu001.getSequenceAnnotations().add(anno4);
		
		/*
		 * PORTS
		 * Port(URI identity, String displayId, ComponentInstantiation exposes)
		 */
		// here, we 
		Port port1 = new Port(
				URI.create(URI_PREFIX+"UU_001/port1"),
				"LacI-repressed_TetR_Gene_por1",
				anno1);
		uu001.getPorts().add(port1);
		
		Port port2 = new Port(
				URI.create(URI_PREFIX+"UU_001/port2"),
				"LacI-repressed_TetR_Gene_port2",
				anno2);
		uu001.getPorts().add(port2);

		Port port3 = new Port(
				URI.create(URI_PREFIX+"UU_001/port3"),
				"LacI-repressed_TetR_Gene_port3",
				anno3);
		uu001.getPorts().add(port3);

		Port port4 = new Port(
				URI.create(URI_PREFIX+"UU_001/port4"),
				"LacI-repressed_TetR_Gene_port4",
				anno4);
		uu001.getPorts().add(port4);

		// currently, we ``store'' the sequence annotation twice 
		// uu001.getSequenceAnnotations().add(anno1) + uu001.getPorts().add(port1)
		
		// finally, add the composite sequence component
		// into the set of components
		this.components.put("LacI-repressed TetR gene", uu001);
		
	}
	
	private void createModules() {
		// lacI inverter module
		this.modules.put("LacI Inverter", this.createLacIModule());
		
		// tetR inverter module
		
		// Toggle-Switch module
		// i.e. a composition of the lacI and tetR inverter modules
	}
	/**
	 * 
	 * @return the lacI inverter module
	 */	
	private Module createLacIModule() {

		// specify the LacI inverter
		Module lacIMod = new Module(
				URI.create(URI_PREFIX+"UU_001M"),
				"LacI_Inverter");
		lacIMod.setName("LacI Inverter");
		
		/**********
		 * SIGNALS
		 **********/
		
		/*
		 * 1. Signals that instantiate generic components
		 */

		// Signal that instantiates the pLac sequence component 
		Signal pLacSig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/pLac_sig"),
				"pLac_Signal",
				this.components.get("pLac"));
		// we need to add the signal to the module 
		lacIMod.getSignals().add(pLacSig);
		
		// Signal that instantiates the RBS sequence component 
		Signal rbsSig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/rbs_sig"),
				"RBS_Signal",
				this.components.get("RBS"));
		lacIMod.getSignals().add(rbsSig);
		
		// Signal that instantiates the LacI sequence component 
		Signal lacISig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/lacI_sig"),
				"LacI_Signal",
				this.components.get("LacI"));
		lacIMod.getSignals().add(lacISig);
		
		// Signal that instantiates the TetR sequence component 
		Signal tetRSig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/tetR_sig"),
				"TetR_Signal",
				this.components.get("TetR"));
		lacIMod.getSignals().add(tetRSig);

		// Signal that instantiates the Double_Terminator sequence component 
		Signal doubleTerminatorSig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/double_terminator_sig"),
				"Double_Terminator_Signal",
				this.components.get("Double_Termintator"));
		lacIMod.getSignals().add(doubleTerminatorSig);

		// Signal that instantiates the cTetR sequence component 
		Signal cTetRSig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/cTetR_sig"),
				"cTetR_Signal",
				this.components.get("cTetR"));
		lacIMod.getSignals().add(cTetRSig);

		/*
		 * 2. Signals that instantiate generic components
		 */
		Signal iptgSig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/iptgSig"),
				"IPTG",
				this.components.get("IPTG"));
		lacIMod.getSignals().add(iptgSig);

		Signal iptgLacISig = new Signal(
				URI.create(URI_PREFIX+"UU_001M/iptgLacISig"),
				"IPTG_LacI_Complex",
				this.components.get("IPTG-LacI"));
		lacIMod.getSignals().add(iptgLacISig);

		/*
		 * 3. Signal with port maps
		 */
		Signal portMapSignal = new Signal(
				URI.create(URI_PREFIX+"UU_001M/portMapSig"),
				"port_map_signal",
				this.components.get("LacI-repressed TetR gene"));

		// port maps
		// PortMap(URI identity, Port port, ComponentInstantiation mapping)
		PortMap pm1 = new PortMap(
				URI.create(URI_PREFIX+"UU_001M/portMapSig/portmap1"),
				null,
				null);
		
		// how can I get the port now?
		// first, we need to get the composite sequence component
		SequenceComponent sc = (SequenceComponent)this.components.get("LacI-repressed TetR gene");
		// then, we need to get the ports of the composite sequence components
		Collection<Port> ports = sc.getPorts();
		
		
		System.out.println(portMapSignal.getPortMaps());

		/***************
		 * INTERACTIONS
		 ***************/
		
		/*
		 * IPTG_Binding		
		 */
		Set<Participation> iptgBindingParticipations = new HashSet<Participation>();
		iptgBindingParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/iptg_binding/iptg"),
						URI.create(URI_PREFIX+"interaction/role/reactant"),
						iptgSig));
		iptgBindingParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/iptg_binding/iptg_lacI_complex"),
						URI.create(URI_PREFIX+"interaction/role/product"),
						iptgLacISig));
		iptgBindingParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/iptg_binding/lacI"),
						URI.create(URI_PREFIX+"interaction/role/reactant"),
						lacISig));

		Interaction iptg = new Interaction(
				URI.create(URI_PREFIX+"UU_001M/interaction/iptg_binding"), 
				"IPTG_Binding",
				URI.create(URI_PREFIX+"interaction/type/complexation"),
				iptgBindingParticipations);
		lacIMod.getInteractions().add(iptg);
		
		

		/*
		 * Repression by LacI
		 */
		Set<Participation> repressionLacIParticipations = new HashSet<Participation>();
		repressionLacIParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/repression_by_lacI/repressor"),
						URI.create(URI_PREFIX+"interaction/role/repressor"),
						lacISig));
		repressionLacIParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/repression_by_lacI/repressed"),
						URI.create(URI_PREFIX+"interaction/role/repressed"),
						pLacSig));
		
		Interaction repressionLacI = new Interaction(
				URI.create(URI_PREFIX+"UU_001M/interaction/repression_by_lacI"), 
				"Repression_by_LacI",
				URI.create(URI_PREFIX+"interaction/type/repression"),
				iptgBindingParticipations);
		lacIMod.getInteractions().add(repressionLacI);

		
		/*
		 * Transcription and Translation of TetR
		 */
		Set<Participation> tetRParticipations = new HashSet<Participation>();
		tetRParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/transcription_and_translation_of_TetR/tetR"),
						URI.create(URI_PREFIX+"interaction/role/product"),
						tetRSig));
		tetRParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/transcription_and_translation_of_TetR/tetR"),
						URI.create(URI_PREFIX+"interaction/role/transcribed"),
						cTetRSig));
		tetRParticipations.add(
				new Participation(
						URI.create(URI_PREFIX+"UU_001M/interaction/transcription_and_translation_of_TetR/tetR"),
						URI.create(URI_PREFIX+"interaction/role/initiator"),
						pLacSig));

		Interaction tetRTranscription = new Interaction(
				URI.create(URI_PREFIX+"UU_001M/interaction/transcription_and_translation_of_TetR"), 
				"Transcription_and_Translation_of_TetR",
				URI.create(URI_PREFIX+"interaction/type/gene_production"),
				iptgBindingParticipations);
		lacIMod.getInteractions().add(tetRTranscription);

		return lacIMod;
	}

}
