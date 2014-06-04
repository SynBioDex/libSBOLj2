package org.sbolstandard.designs;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

import org.sbolstandard.core.component_option2.ComponentInstantiation;
import org.sbolstandard.core.component_option2.generic.GenericComponent;
import org.sbolstandard.core.component_option2.generic.GenericComponentInstantiation;
import org.sbolstandard.core.component_option2.sequence.oriented.dna.DnaComponent;
import org.sbolstandard.core.component_option2.sequence.oriented.dna.DnaComponentInstantiation;
import org.sbolstandard.core.component_option2.sequence.protein.ProteinComponent;
import org.sbolstandard.core.component_option2.sequence.protein.ProteinComponentInstantiation;
import org.sbolstandard.core.interaction_option2.Interaction;
import org.sbolstandard.core.interaction_option2.Participation;
import org.sbolstandard.core.module_option2.Module;
import org.sbolstandard.core.module_option2.ModuleInstantiation;
import org.sbolstandard.core.port_option2.Port;
import org.sbolstandard.core.port_option2.PortMap;

public class SubtilinReceiver {
	
	ProteinComponent spaKProteinComp = new ProteinComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaK_protein"), 
			"SpaK_protein",
			URI.create("http://purl.obolibrary.org/obo/GO_0000155")); // kinase activity

	DnaComponent spaKCDSComp = new DnaComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaK_CDS"),
			"spaK_CDS", 
			URI.create("http://purl.obolibrary.org/obo/SO_0000316"));// so:CDS
			
	ProteinComponent spaRProteinComp = new ProteinComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaR_protein"), 
			"SpaR_protein",
			URI.create("http://purl.obolibrary.org/obo/GO_0000156")); // response regulator activity
			
	DnaComponent spaRCDSComp = new DnaComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaR_CDS"),
			"SpaR_CDS", 
			URI.create("http://purl.obolibrary.org/obo/SO_0000316")); // CDS
			
	ProteinComponent gfpProteinComp = new ProteinComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#GFP_protein"),
		    "GFP_protein",
		    URI.create("http://purl.obolibrary.org/obo/MI_0367")); // GFP
		    
	DnaComponent gfpCDSComp = new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#GFP_CDS"),
		    "GFP_CDS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000316")); // CDS
			
	DnaComponent pspaSPromoterComp = new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#pspaS_promoter"),
		    "pspaS_promoter",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000167")); // Promoter
		    
	DnaComponent pspaRKPromoterComp = new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#pspaRK_promoter"),
		    "pspaRK_promoter",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000167")); // Promoter

	GenericComponent subtilinComp =new GenericComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#subtilin"),
		    "subtilin",
		    URI.create("http://purl.obolibrary.org/obo/CHEBI_71644"));//Lantibiotic
				  
	DnaComponent spaK_RBS_Comp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#spaK_RBS_Comp"),
		    "spaK RBS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000552")); // Promoter
		    

	DnaComponent spaR_RBS_Comp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#spaR_RBS_Comp"),
		    "spaR RBS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000552")); // Promoter
		    

	DnaComponent gfp_RBS_Comp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#gfp_RBS_Comp"),
		    "gfp RBS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000552")); // Promoter
		    
 
	DnaComponent spaRKTerminatorComp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#spaRKTerminatorComp"),
		    "spaRK Terminator",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000614")); // Terminator
		    


	DnaComponent gfpTerminatorComp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#gfpTerminatorComp"),
		    "gfp Terminator",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000614")); // Terminator
		    
	
	  DnaComponent spaRKOperon=new DnaComponent(
			    URI.create("http://turingatemyhamter.co.uk/example#spaRKOperon"),
			    "spaRK Operon",
			    URI.create("http://purl.obolibrary.org/obo/SO_0000178")); // Operon
			    
	  
	  public SubtilinReceiver() {
		  spaKProteinComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/Protein"));
		  spaKCDSComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  spaRProteinComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/Protein"));
		  spaRCDSComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  gfpProteinComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/Protein"));
		  gfpCDSComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  pspaSPromoterComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  pspaRKPromoterComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  spaK_RBS_Comp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  spaR_RBS_Comp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  gfp_RBS_Comp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  spaRKTerminatorComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  gfpTerminatorComp.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
		  spaRKOperon.addSequenceType(URI.create("http://turingatemyhamter.co.uk/DNA"));
	  }
	  				    			    
	 
	  private ProteinEncodingCdsModule getProteinEncodingCDSModule(String moduleName, String CDSName, String proteinName)
		 {
			 ComponentInstantiation proteinComp_sig = new ProteinComponentInstantiation(
				      URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/%s",moduleName,proteinName)),
				      proteinName,
				      spaKProteinComp
				    );

			 Port proteinComp_port= new Port(
				      URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/%s_port",moduleName,proteinName)),
				      proteinName + "_port",
				      proteinComp_sig);
				      

			 ComponentInstantiation CDSComp_sig = new DnaComponentInstantiation(
				      URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/%s",moduleName,CDSName)),
				      CDSName,
				      spaKCDSComp);
			 
			
			 Port CDSComp_port= new Port(
				      URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/%s_port",moduleName,CDSName)),
				      CDSName + "_port",
				      CDSComp_sig);
			
			 Participation participationCDS =new Participation(
		              URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/protein_encoding/cds",moduleName)),
		              URI.create("http://purl.obolibrary.org/obo/SO_0000316"),
		              CDSComp_sig);
			 Participation participationProtein=new  Participation(
		              URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/protein_encoding/gene_product",moduleName)),
		              URI.create("http://www.ebi.ac.uk/sbo/main/SBO:0000011"), // SBO:Product
		              proteinComp_sig);           
		     Interaction interaction=new Interaction( 
		     		URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/protein_encoding",moduleName)),
		     		"protein_encoding",
		     		URI.create("protein_encoding"),
		     		new ArrayList<Participation>(Arrays.asList(participationCDS,participationProtein)));
		     
		     Module module=new Module(
		    	     URI.create(String.format("http://turingatemyhamter.co.uk/example#%s",moduleName)),
				      "SpaK module");
		     for (Port port : new ArrayList<Port>(Arrays.asList(CDSComp_port,proteinComp_port)))
		    	 module.addPort(port);
		     for (ComponentInstantiation signal : new ArrayList<ComponentInstantiation>(Arrays.asList(CDSComp_sig,proteinComp_sig)))
		    	 module.addComponentInstantiation(signal);
		     for (Interaction inter : new ArrayList<Interaction>(Arrays.asList(interaction)))
		    	 module.addInteraction(inter);	     	     

			return new ProteinEncodingCdsModule(module,CDSComp_port,proteinComp_port);
		 }
	  
	  private Module gfpProductionModule()
		 {
		  ComponentInstantiation pspaSPromoterComp_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaS_promoter"),
				      "pspaS_promoter",
				      pspaSPromoterComp
				    );

			 Port pspaSPromoterComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaS_promoter_port"),
				      "pspaS_promoter_port",
				      pspaSPromoterComp_sig);
			
			 ProteinEncodingCdsModule gfpTranslationModule=getProteinEncodingCDSModule("GFP_module", "GFP_CDS", "GFP_Protein");
				

			 ComponentInstantiation gfpCDS_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/gfp_cds"),
				      "gfp_cds",
				      gfpCDSComp);
			 
			 Participation participationPromoter =new Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/promoter"),
		              URI.create("http://purl.obolibrary.org/obo/SO_0000167"),
		              pspaSPromoterComp_sig);
			 Participation participationCDS=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/cds"),
		              URI.create("http://www.ebi.ac.uk/sbo/main/SBO:0000310"), // SBO:CDS
		              gfpCDS_sig);           
		     Interaction interaction=new Interaction( 
		     		URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription"),
		     		"transcription",
		     		URI.create("transcription"),
		     		new ArrayList<Participation>(Arrays.asList(participationPromoter,participationCDS)));
		     
		     ModuleInstantiation subModule=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/gfp_translation_module"),
		    	        "gfp_translation_module",
		    	        gfpTranslationModule.getModule());
		     PortMap portMap=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/cds:cds"),
		             gfpTranslationModule.CDSport,
		             gfpCDS_sig);		           
		     		     
		     Module module=new Module(
		    	     URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module"),
				      "GFP_production_module");
		     for (ComponentInstantiation signal : new ArrayList<ComponentInstantiation>(Arrays.asList(pspaSPromoterComp_sig,gfpCDS_sig)))
		    	 module.addComponentInstantiation(signal);
		     for (Port port : new ArrayList<Port>(Arrays.asList(pspaSPromoterComp_port)))
		    	 module.addPort(port);
		     for (Interaction inter : new ArrayList<Interaction>(Arrays.asList(interaction)))
		    	 module.addInteraction(inter);
		     for (ModuleInstantiation modi : new ArrayList<ModuleInstantiation>(Arrays.asList(subModule)))
		    	 module.addSubModuleInstantiation(modi);	
		   
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMap)))
		    	 subModule.addPortMap(pmap);
		     //module.setPortMaps(new ArrayList<PortMap>(Arrays.asList(portMap)));		     
			return module;									
		 }

	  private Module spaKspaRProductionModule()
		 {
		  ComponentInstantiation pspaRKPromoterComp_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaRK_promoter"),
				      "pspaRK_promoter",
				      pspaRKPromoterComp
				    );

			 Port pspaRKPromoterComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaRK_promoter_port"),
				      "pspaS_promoter_port",
				      pspaRKPromoterComp_sig);
			
			 ProteinEncodingCdsModule spaKTranslationModule=getProteinEncodingCDSModule("SpaK_module", "SpaK_CDS", "SpaK_Protein");		

			 ComponentInstantiation spaKCDS_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/SpaK_CDS"),
				      "SpaK_CDS",
				      spaKCDSComp);
			 
			 ProteinEncodingCdsModule spaRTranslationModule=getProteinEncodingCDSModule("SpaR_module", "SpaR_CDS", "SpaR_Protein");		

			 ComponentInstantiation spaRCDS_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/SpaR_CDS"),
				      "SpaR_CDS",
				      spaRCDSComp);
			 
			 
			 Participation participationPromoter =new Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/promoter"),
		              URI.create("http://purl.obolibrary.org/obo/SO_0000167"),
		              pspaRKPromoterComp_sig);
			 Participation participationSpaKCDS=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/cds"),
		              URI.create("http://www.ebi.ac.uk/sbo/main/SBO:0000310"), // SBO:CDS
		              spaKCDS_sig);   
			 
			 Participation participationSpaRCDS=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/cds"),
		              URI.create("http://www.ebi.ac.uk/sbo/main/SBO:0000310"), // SBO:CDS
		              spaRCDS_sig);   
			 
		     Interaction interaction=new Interaction( 
		     		URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription"),
		     		"transcription",
		     		URI.create("transcription"),
		     		new ArrayList<Participation>(Arrays.asList(participationPromoter,participationSpaKCDS,participationSpaRCDS)));
		     
		     ModuleInstantiation subModuleSpaK=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/gfp_translation_module"),
		    	        "gfp_translation_module",
		    	        spaKTranslationModule.getModule());
		    
		     ModuleInstantiation subModuleSpaR=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/gfp_translation_module"),
		    	        "gfp_translation_module",
		    	        spaRTranslationModule.getModule());
		    
		     PortMap portMapSpaK=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/cds:cds"),
		             spaKTranslationModule.CDSport,
		             spaKCDS_sig);
		     
		     PortMap portMapSpaR=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/transcription/cds:cds"),
		             spaRTranslationModule.CDSport,
		             spaRCDS_sig);
		           
		     		     
		     Module module=new Module(
		    	     URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module"),
				      "GFP_production_module");
		     for (ComponentInstantiation signal : new ArrayList<ComponentInstantiation>(Arrays.asList(pspaRKPromoterComp_sig,spaKCDS_sig,spaRCDS_sig)))
		    	 module.addComponentInstantiation(signal);
		     for (Port port : new ArrayList<Port>(Arrays.asList(pspaRKPromoterComp_port)))
		    	 module.addPort(port);
		     for (Interaction inter : new ArrayList<Interaction>(Arrays.asList(interaction)))
		    	 module.addInteraction(inter);
		     for (ModuleInstantiation modi : new ArrayList<ModuleInstantiation>(Arrays.asList(subModuleSpaK,subModuleSpaR)))
		    	 module.addSubModuleInstantiation(modi);
		     
		     //TODO module.setPortMaps(new ArrayList<PortMap>(Arrays.asList(portMapSpaK,portMapSpaR)));	     	     
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapSpaK)))
		    	 subModuleSpaK.addPortMap(pmap);
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapSpaR)))
		    	 subModuleSpaR.addPortMap(pmap);   	     
		     
			return module;									
		 }

	 
	  private Module pspaSActivationModule()
		 {
		  	ComponentInstantiation pspaSPromoterComp_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/pspaS_promoter"),
				      "pspaS_promoter",
				      pspaSPromoterComp
				    );

			 Port pspaSPromoterComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/pspaS_promoter_port"),
				      "pspaS_promoter_port",
				      pspaSPromoterComp_sig);
			
			 ComponentInstantiation spaRProteinComp_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/SpaR_protein"),
				      "SpaR_protein",
				      spaRProteinComp);
			 

			 Port spaRProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/spaR_protein_port"),
				      "spaR_protein_port",
				      spaRProteinComp_sig);
			 			 			 
			 Participation participationTF =new Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/transcription/TF"),
		              URI.create("http://purl.obolibrary.org/obo/SO_0000459"),//stimulator
		              spaRProteinComp_sig);
			 Participation participationPromoter=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/transcription/promoter"),
		              URI.create("http://purl.obolibrary.org/obo/SO_0000167"), // SBO:Promoter
		              pspaSPromoterComp_sig);           
		     Interaction interaction=new Interaction( 
		     		URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/transcriptional_activation"),
		     		"transcription_activation",
		     		URI.create("transcription_activation"),
		     		new ArrayList<Participation>(Arrays.asList(participationTF,participationPromoter)));
		     
		     		     
		     Module module=new Module(
		    	     URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module"),
				      "pspaS_activation_module");
		     for (ComponentInstantiation signal : new ArrayList<ComponentInstantiation>(Arrays.asList(pspaSPromoterComp_sig, spaRProteinComp_sig)))
		    	 module.addComponentInstantiation(signal);
		     for (Port port : new ArrayList<Port>(Arrays.asList(pspaSPromoterComp_port,spaRProteinComp_port)))
		    	 module.addPort(port);
		     for (Interaction inter : new ArrayList<Interaction>(Arrays.asList(interaction)))
		    	 module.addInteraction(inter);
		  
			return module;									
		 }

	  private Module spaRActivationModule()
		 {
			
		  ComponentInstantiation spaRProteinComp_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_protein"),
				      "SpaR_protein",
				      spaRProteinComp);
			 

			 Port spaRProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_protein_port"),
				      "spaR_protein_port",
				      spaRProteinComp_sig);
			 
			 ComponentInstantiation spaR_P_ProteinComp_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_P_protein"),
				      "SpaR_protein",
				      spaRProteinComp);
			 

			 Port spaR_P_ProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_P_protein_port"),
				      "spaR_P_protein_port",
				      spaR_P_ProteinComp_sig);
			 
			 ComponentInstantiation spaKProteinComp_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_protein"),
				      "SpaK_protein",
				      spaKProteinComp);
			 

			 Port spaKProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_protein_port"),
				      "spaK_protein_port",
				      spaKProteinComp_sig);
			 
			 ComponentInstantiation spaK_P_ProteinComp_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_P_protein"),
				      "SpaK_protein",
				      spaKProteinComp);
			 

			 Port spaK_P_ProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_P_protein_port"),
				      "spaK_P_protein_port",
				      spaK_P_ProteinComp_sig);
			 
			 ComponentInstantiation subtilinComp_sig = new GenericComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/subtilin"),
				      "subtilin",
				      subtilinComp);
			 

			 Port subtilinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/subtilin_port"),
				      "subtilin_port",
				      subtilinComp_sig);
							    
			 Participation participationSpaK =new Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_activation/SpaK"),
		              URI.create("http://purl.obolibrary.org/obo/MI_0843"),//phosphate acceptor
		              spaKProteinComp_sig);
			 Participation participationSpaK_P=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_activation/SpaK_P"),
		              URI.create("http://purl.obolibrary.org/obo/SBO_0000011"), // SBO:Product
		              spaK_P_ProteinComp_sig);   
			 Participation participationSubtilin=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_activation/Subtilin"),
		              URI.create("http://purl.obolibrary.org/obo/SBO_0000019"), // modifier
		              subtilinComp_sig);   
			 			 
		     Interaction interactionSpaKActivation=new Interaction( 
		     		URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_activation"),
		     		"SpaK_activation",
		     		URI.create("Phosphorylation"),
		     		new ArrayList<Participation>(Arrays.asList(participationSpaK,participationSpaK_P,participationSubtilin)));
		     
		     Participation participationSpaK_SpaRActivation =new Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_activation/SpaK"),
		              URI.create("http://purl.obolibrary.org/obo/SBO_0000011"), // product
		              spaKProteinComp_sig);
			 Participation participationSpaK_P_SpaRActivation=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_activation/SpaK_P"),
		              URI.create("http://purl.obolibrary.org/obo/MI_0842"),//phosphate donor
		              spaK_P_ProteinComp_sig);   
		     Participation participationSpaR_SpaRActivation =new Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_activation/SpaR"),
		              URI.create("http://purl.obolibrary.org/obo/MI_0843"), // phosphate acceptor
		              spaRProteinComp_sig);
			 Participation participationSpaR_P_SpaRActivation=new  Participation(
		              URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_activation/SpaR_P"),
		              URI.create("http://purl.obolibrary.org/obo/SBO_0000011"), // product
		              spaR_P_ProteinComp_sig); 
			 
			 			 
		     Interaction interactionSpaRActivation=new Interaction( 
		     		URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_activation"),
		     		"SpaR_activation",
		     		URI.create("Phosphorylation"),
		     		new ArrayList<Participation>(Arrays.asList(participationSpaK_P_SpaRActivation,participationSpaR_SpaRActivation,participationSpaK_SpaRActivation,participationSpaR_P_SpaRActivation)));
		     
		     		     		     		     
		     Module module=new Module(
		    	     URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module"),
				      "pspaS_activation_module");
		 for (ComponentInstantiation signal : new ArrayList<ComponentInstantiation>(Arrays.asList(spaRProteinComp_sig, spaR_P_ProteinComp_sig,spaKProteinComp_sig,spaK_P_ProteinComp_sig,subtilinComp_sig)))
	    	 module.addComponentInstantiation(signal);
	     for (Port port : new ArrayList<Port>(Arrays.asList(spaRProteinComp_port,spaR_P_ProteinComp_port, spaKProteinComp_port,spaK_P_ProteinComp_port,subtilinComp_port)))
	    	 module.addPort(port);
	     for (Interaction inter : new ArrayList<Interaction>(Arrays.asList(interactionSpaKActivation,interactionSpaRActivation)))
	    	 module.addInteraction(inter);
		 
			return module;									
		 }

	  
	  private Module spaKspaRTwoComponentSystemModule()
		 {
		  	Module spaKSpaRProductionModule=spaKspaRProductionModule();
		  	ModuleInstantiation spaKModule=(ModuleInstantiation)spaKSpaRProductionModule.getSubModuleInstantiations().toArray()[0];
		  	ModuleInstantiation spaRModule=(ModuleInstantiation)spaKSpaRProductionModule.getSubModuleInstantiations().toArray()[0];
		  	Port spaKSpaRProduction_SpaK_port=(Port)spaKModule.getInstantiatedModule().getPorts().toArray()[1];
		  	Port spaKSpaRProduction_SpaR_port=(Port)spaRModule.getInstantiatedModule().getPorts().toArray()[1];

		    Module spaRActivation=spaRActivationModule();
		    Port spaRActivation_spaRProteinComp_port=(Port)spaRActivation.getPorts().toArray()[0];		    		    
		    Port spaRActivation_spaR_P_ProteinComp_port=(Port)spaRActivation.getPorts().toArray()[1];		    
		    Port spaRActivation_spaKProteinComp_port=(Port)spaRActivation.getPorts().toArray()[2];		    
		    		
		    Module pspaSActivation=pspaSActivationModule();
		    Port pspaSActivation_pspaS_port=(Port)pspaSActivation.getPorts().toArray()[0];		    		    
		    Port pspaSActivation_SpaR_port=(Port)pspaSActivation.getPorts().toArray()[1];	
		    
		    
		     
		     ModuleInstantiation subModuleSpaKSpaRProduction=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/spaK_spaK_production_module"),
		    	        "spaK_spaK_production_module",
		    	        spaKSpaRProductionModule);
		    
		     ModuleInstantiation subModuleSpaRActivation=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/spaR_activation_module"),
		    	        "spaR_activation_module",
		    	        spaRActivation);
		
		     ModuleInstantiation subModulepspaSActivation=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/pspaS_activation_module"),
		    	        "pspaS_activation_module",
		    	        pspaSActivation);
		     
		     /*PortMap portMapSpaR=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/production_SpaR_protein:SpaRActivation_SpaR_protein"),
		             spaKSpaRProduction_SpaR_port,
		             spaRActivation_spaRProteinComp_port.getExposes());		           
		    
		     PortMap portMapSpaK=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/production_SpaK_protein:SpaRActivation_SpaK_protein"),
		             spaKSpaRProduction_SpaK_port,
		             spaRActivation_spaKProteinComp_port.getExposes());		           
		     
		     PortMap portMapSpaR_P=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/SpaRActivation_SpaR__P_protein:pspaSActivation_SpaR"),
		             spaRActivation_spaR_P_ProteinComp_port,
		             pspaSActivation_SpaR_port.getExposes());*/	
		     
		     ComponentInstantiation spaR_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaKspaRTwoComponentSystemModule/SpaR"),
				      "SpaR_protein",
				      spaRProteinComp); 
		     ComponentInstantiation spaR_P_ProteinComp_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaKspaRTwoComponentSystemModule/SpaR_P_protein"),
				      "SpaR_P_protein",
				      spaRProteinComp);
		     ComponentInstantiation spaK_sig = new ProteinComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#spaKspaRTwoComponentSystemModule/SpaK"),
				      "SpaK_protein",
				      spaKProteinComp); 
		     
		     
		     PortMap portMapSpaR=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/production_SpaR_protein:SpaR"),
		             spaKSpaRProduction_SpaR_port,
		             spaR_sig);
		     PortMap portMapSpaK=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/production_SpaR_protein:SpaR"),
		             spaKSpaRProduction_SpaK_port,
		             spaK_sig);
		     
		     PortMap portMapSpaRForSpaRActivation=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/spaRActivation_SpaR_protein:SpaR"),
		             spaRActivation_spaRProteinComp_port,
		             spaR_sig);
		     PortMap portMapSpaKForSpaRActivation=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/spaRActivation_SpaK_protein:SpaK"),
		             spaRActivation_spaKProteinComp_port,
		             spaK_sig);
		     PortMap portMapSpaR_P_ForSpaRActivation=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/spaRActivation_SpaR_P_protein:SpaR_P"),
		             spaRActivation_spaR_P_ProteinComp_port,
		             spaR_P_ProteinComp_sig);
		     
		     PortMap portMapSpaR_P_For_pSpaS_Activation=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#spaKspaR_two_component_system_module/pspaSActivation_SpaR_P_protein:SpaR_P"),
		             pspaSActivation_SpaR_port,
		             spaR_P_ProteinComp_sig);
		     
		     
		     
		     Module module=new Module(
		    	     URI.create("http://turingatemyhamter.co.uk/example#"),
				      "spaKspaR_two_component_system_module");
		     for (ModuleInstantiation subMod : new ArrayList<ModuleInstantiation>(Arrays.asList(subModuleSpaKSpaRProduction,subModuleSpaRActivation,subModulepspaSActivation)))
		     	module.addSubModuleInstantiation(subMod);
		     //TODOmodule.setPortMaps(new ArrayList<PortMap>(Arrays.asList(portMapSpaR,portMapSpaK,portMapSpaR_P)));
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapSpaR,portMapSpaK)))
		    	 subModuleSpaKSpaRProduction.addPortMap(pmap);
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapSpaRForSpaRActivation,portMapSpaKForSpaRActivation,portMapSpaR_P_ForSpaRActivation)))
		    	 subModuleSpaRActivation.addPortMap(pmap);
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapSpaR_P_For_pSpaS_Activation)))
		    	 subModulepspaSActivation.addPortMap(pmap);
		     
		     return module;									
		 }

	  public Module subtilinReporterSystemModule()
		 {
		  	Module spaKspaRTwoComponentSystem=spaKspaRTwoComponentSystemModule();
		  	ModuleInstantiation subModulepspaSActivation=(ModuleInstantiation)spaKspaRTwoComponentSystem.getSubModuleInstantiations().toArray()[2];
		  			  	
		  	Port spaKspaRTwoComponentSystem_pspaS_port=(Port)subModulepspaSActivation.getInstantiatedModule().getPorts().toArray()[0];
		  	
		  	
		  	 Module gfpProduction=gfpProductionModule();
		  	 Port gfpProduction_pspaS_port=(Port)gfpProduction.getPorts().toArray()[0];
		  		    
		     
		     ModuleInstantiation subModuleSpaKSpaRTwoComponentSystem=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#subtilin_reporter_module/spaKspaR_two_component_System_module"),
		    	        "spaKspaR_two_component_System_module",
		    	        spaKspaRTwoComponentSystem);
		    
		     ModuleInstantiation subModuleSpaRActivation=new ModuleInstantiation(
		    	        URI.create("http://turingatemyhamter.co.uk/example#subtilin_reporter_module/gfp_production_module"),
		    	        "gfp_production_module",
		    	        gfpProduction);
		
           		    		    
		     
		     Module module=new Module(
		    	     URI.create("http://turingatemyhamter.co.uk/example#subtilin_reporter_module"),
				      "subtilin_reporter_module");
		     for (ModuleInstantiation subMod : new ArrayList<ModuleInstantiation>(Arrays.asList(subModuleSpaKSpaRTwoComponentSystem,subModuleSpaRActivation)))
		    	 module.addSubModuleInstantiation(subMod);
		     
		     /*  PortMap portMapPspaS=new PortMap(
             URI.create("http://turingatemyhamter.co.uk/example#subtilin_reporter_module/tcs_pspaS_promoter:gfp_production_pspaS_promoter"),
             spaKspaRTwoComponentSystem_pspaS_port,
             gfpProduction_pspaS_port.getExposes());	*/	
		     //module.setPortMaps(new ArrayList<PortMap>(Arrays.asList(portMapPspaS)));
		     
		     ComponentInstantiation pSpaS_sig = new DnaComponentInstantiation(
				      URI.create("http://turingatemyhamter.co.uk/example#subtilinReporterSystemModule/pSpaS"),
				      "pspaSPromoter",
				      pspaSPromoterComp); 
		     
		     PortMap portMapPspaS_TCS=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#subtilin_reporter_module/tcs_pspaS_promoter:gfp_production_pspaS_promoter"),
		             spaKspaRTwoComponentSystem_pspaS_port,
		             pSpaS_sig);	
		     
		     PortMap portMapPspaS_Reporter=new PortMap(
		             URI.create("http://turingatemyhamter.co.uk/example#subtilin_reporter_module/tcs_pspaS_promoter:gfp_production_pspaS_promoter"),
		             gfpProduction_pspaS_port,
		             pSpaS_sig);	
		     
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapPspaS_TCS)))
		    	 subModuleSpaKSpaRTwoComponentSystem.addPortMap(pmap);
		     for (PortMap pmap : new ArrayList<PortMap>(Arrays.asList(portMapPspaS_Reporter)))
		    	 subModuleSpaRActivation.addPortMap(pmap);
		     		     		     		     		     
			return module;									
		 }

	private class ProteinEncodingCdsModule {

		public Module getModule() {
			return module;
		}

		public void setModule(Module module) {
			this.module = module;
		}

		public Port getCDSport() {
			return CDSport;
		}

		public void setCDSport(Port cDSport) {
			CDSport = cDSport;
		}

		public Port getProteinPort() {
			return proteinPort;
		}

		public void setProteinPort(Port proteinPort) {
			this.proteinPort = proteinPort;
		}

		private Module module;
		private Port CDSport;
		private Port proteinPort;

		public ProteinEncodingCdsModule(Module module, Port CDSport, Port proteinPort) {
			this.module = module;
			this.CDSport = CDSport;
			this.proteinPort = proteinPort;
		}

	}
	
	

	public static void main(String[] args) {
		SubtilinReceiver sr = new SubtilinReceiver();
		Module systemDesign=sr.subtilinReporterSystemModule();
		
		//sr.design();

	}

}
