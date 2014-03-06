package org.sbolstandard.designs;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sbolstandard.core.GenericComponent;
import org.sbolstandard.core.Module;
import org.sbolstandard.core.ModuleInstantiation;
import org.sbolstandard.core.Port;
import org.sbolstandard.core.PortMap;
import org.sbolstandard.core.Signal;
import org.sbolstandard.core.interaction.Interaction;
import org.sbolstandard.core.interaction.Participation;
import org.sbolstandard.core.option2.oriented.dna.DnaComponent;
import org.sbolstandard.core.option2.protein.ProteinComponent;

public class SubtilinReceiver {
	ProteinComponent spaKProteinComp = new ProteinComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaK_protein"), 
			"SpaK_protein",
			URI.create("http://purl.obolibrary.org/obo/GO_0000155"),// kinase activity
			URI.create("http://turingatemyhamter.co.uk/Protein"));

	DnaComponent spaKCDSComp = new DnaComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaK_CDS"),
			"spaK_CDS", 
			URI.create("http://purl.obolibrary.org/obo/SO_0000316"),// so:CDS
			URI.create("http://turingatemyhamter.co.uk/DNA"));

	ProteinComponent spaRProteinComp = new ProteinComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaR_protein"), 
			"SpaR_protein",
			URI.create("http://purl.obolibrary.org/obo/GO_0000156"), // response regulator activity
			URI.create("http://turingatemyhamter.co.uk/Protein"));

	DnaComponent spaRCDSComp = new DnaComponent(
			URI.create("http://turingatemyhamter.co.uk/example#SpaR_CDS"),
			"SpaR_CDS", 
			URI.create("http://purl.obolibrary.org/obo/SO_0000316"), // CDS
			URI.create("http://turingatemyhamter.co.uk/DNA"));

	
	ProteinComponent gfpProteinComp = new ProteinComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#GFP_protein"),
		    "GFP_protein",
		    URI.create("http://purl.obolibrary.org/obo/MI_0367"), // GFP
		    URI.create("http://turingatemyhamter.co.uk/Protein"));
		  

	DnaComponent gfpCDSComp = new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#GFP_CDS"),
		    "GFP_CDS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000316"), // CDS
			URI.create("http://turingatemyhamter.co.uk/DNA"));
		  
	DnaComponent pspaSPromoterComp = new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#pspaS_promoter"),
		    "pspaS_promoter",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000167"), // Promoter
		    URI.create("http://turingatemyhamter.co.uk/DNA"));
		
	DnaComponent pspaRKPromoterComp = new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#pspaRK_promoter"),
		    "pspaRK_promoter",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000167"), // Promoter
		    URI.create("http://turingatemyhamter.co.uk/DNA"));

	GenericComponent subtilinComp =new GenericComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#subtilin"),
		    "subtilin",
		    URI.create("http://purl.obolibrary.org/obo/CHEBI_71644"));//Lantibiotic
				  
	DnaComponent spaK_RBS_Comp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#spaK_RBS_Comp"),
		    "spaK RBS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000552"), // Promoter
		    URI.create("http://turingatemyhamter.co.uk/DNA"));

	DnaComponent spaR_RBS_Comp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#spaR_RBS_Comp"),
		    "spaR RBS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000552"), // Promoter
		    URI.create("http://turingatemyhamter.co.uk/DNA"));

	DnaComponent gfp_RBS_Comp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#gfp_RBS_Comp"),
		    "gfp RBS",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000552"), // Promoter
		    URI.create("http://turingatemyhamter.co.uk/DNA"));
 
	DnaComponent spaRKTerminatorComp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#spaRKTerminatorComp"),
		    "spaRK Terminator",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000614"), // Terminator
		    URI.create("http://turingatemyhamter.co.uk/DNA"));


	DnaComponent gfpTerminatorComp= new DnaComponent(
		    URI.create("http://turingatemyhamter.co.uk/example#gfpTerminatorComp"),
		    "gfp Terminator",
		    URI.create("http://purl.obolibrary.org/obo/SO_0000614"), // Terminator
		    URI.create("http://turingatemyhamter.co.uk/DNA"));
	
	  DnaComponent spaRKOperon=new DnaComponent(
			    URI.create("http://turingatemyhamter.co.uk/example#spaRKOperon"),
			    "spaRK Operon",
			    URI.create("http://purl.obolibrary.org/obo/SO_0000178"), // Operon
			    URI.create("http://turingatemyhamter.co.uk/DNA"));
	  				    			    
	 
	  private ProteinEncodingCdsModule getProteinEncodingCDSModule(String moduleName, String CDSName, String proteinName)
		 {
			 Signal proteinComp_sig = new Signal(
				      URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/%s",moduleName,proteinName)),
				      proteinName,
				      spaKProteinComp
				    );

			 Port proteinComp_port= new Port(
				      URI.create(String.format("http://turingatemyhamter.co.uk/example#%s/%s_port",moduleName,proteinName)),
				      proteinName + "_port",
				      proteinComp_sig);
				      

			 Signal CDSComp_sig = new Signal(
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
		     module.setPorts(new ArrayList<Port>(Arrays.asList(CDSComp_port,proteinComp_port)));
		     module.setSignals(new ArrayList<Signal>(Arrays.asList(CDSComp_sig,proteinComp_sig)));
		     module.setInteractions(new ArrayList<Interaction>(Arrays.asList(interaction)));	     	     

			return new ProteinEncodingCdsModule(module,CDSComp_port,proteinComp_port);
		 }
	  
	  private Module gfpProduction_module()
		 {
			 Signal pspaSPromoterComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaS_promoter"),
				      "pspaS_promoter",
				      pspaSPromoterComp
				    );

			 Port pspaSPromoterComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaS_promoter_port"),
				      "pspaS_promoter_port",
				      pspaSPromoterComp_sig);
			
			 ProteinEncodingCdsModule gfpTranslationModule=getProteinEncodingCDSModule("GFP_module", "GFP_CDS", "GFP_Protein");
				

			 Signal gfpCDS_sig = new Signal(
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
		     module.setSignals(new ArrayList<Signal>(Arrays.asList(pspaSPromoterComp_sig,gfpCDS_sig)));
		     module.setPorts(new ArrayList<Port>(Arrays.asList(pspaSPromoterComp_port)));
		     module.setInteractions(new ArrayList<Interaction>(Arrays.asList(interaction)));	     	     
		     module.setSubModules(new ArrayList<ModuleInstantiation>(Arrays.asList(subModule)));	     	     
		     //TODO Add PortMaps
		     
			return module;									
		 }

	  private Module spaKspaRProductionModule()
		 {
			 Signal pspaRKPromoterComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaRK_promoter"),
				      "pspaRK_promoter",
				      pspaRKPromoterComp
				    );

			 Port pspaRKPromoterComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/pspaRK_promoter_port"),
				      "pspaS_promoter_port",
				      pspaRKPromoterComp_sig);
			
			 ProteinEncodingCdsModule spaKTranslationModule=getProteinEncodingCDSModule("SpaK_module", "SpaK_CDS", "SpaK_Protein");		

			 Signal spaKCDS_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#GFP_production_module/SpaK_CDS"),
				      "SpaK_CDS",
				      spaKCDSComp);
			 
			 ProteinEncodingCdsModule spaRTranslationModule=getProteinEncodingCDSModule("SpaR_module", "SpaR_CDS", "SpaR_Protein");		

			 Signal spaRCDS_sig = new Signal(
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
		     module.setSignals(new ArrayList<Signal>(Arrays.asList(pspaRKPromoterComp_sig,spaKCDS_sig,spaRCDS_sig)));
		     module.setPorts(new ArrayList<Port>(Arrays.asList(pspaRKPromoterComp_port)));
		     module.setInteractions(new ArrayList<Interaction>(Arrays.asList(interaction)));	     	     
		     module.setSubModules(new ArrayList<ModuleInstantiation>(Arrays.asList(subModuleSpaK,subModuleSpaR)));	     	     
		     //TODO Add PortMaps
		     
			return module;									
		 }

	 
	  private Module pspaSActivationModule()
		 {
			 Signal pspaSPromoterComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/pspaS_promoter"),
				      "pspaS_promoter",
				      pspaSPromoterComp
				    );

			 Port pspaSPromoterComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#pspaS_activation_module/pspaS_promoter_port"),
				      "pspaS_promoter_port",
				      pspaSPromoterComp_sig);
			
			 Signal spaRProteinComp_sig = new Signal(
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
		     module.setSignals(new ArrayList<Signal>(Arrays.asList(pspaSPromoterComp_sig, spaRProteinComp_sig)));
		     module.setPorts(new ArrayList<Port>(Arrays.asList(pspaSPromoterComp_port,spaRProteinComp_port)));
		     module.setInteractions(new ArrayList<Interaction>(Arrays.asList(interaction)));	     	     
		     
			return module;									
		 }

	  private Module spaRActivationModule()
		 {
			
			 Signal spaRProteinComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_protein"),
				      "SpaR_protein",
				      spaRProteinComp);
			 

			 Port spaRProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_protein_port"),
				      "spaR_protein_port",
				      spaRProteinComp_sig);
			 
			 Signal spaR_P_ProteinComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_P_protein"),
				      "SpaR_protein",
				      spaRProteinComp);
			 

			 Port spaR_P_ProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaR_P_protein_port"),
				      "spaR_P_protein_port",
				      spaR_P_ProteinComp_sig);
			 
			 Signal spaKProteinComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_protein"),
				      "SpaK_protein",
				      spaKProteinComp);
			 

			 Port spaKProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_protein_port"),
				      "spaK_protein_port",
				      spaKProteinComp_sig);
			 
			 Signal spaK_P_ProteinComp_sig = new Signal(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_P_protein"),
				      "SpaK_protein",
				      spaKProteinComp);
			 

			 Port spaK_P_ProteinComp_port= new Port(
				      URI.create("http://turingatemyhamter.co.uk/example#spaR_activation_module/SpaK_P_protein_port"),
				      "spaK_P_protein_port",
				      spaK_P_ProteinComp_sig);
			 
			 Signal subtilinComp_sig = new Signal(
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
		     module.setSignals(new ArrayList<Signal>(Arrays.asList(spaRProteinComp_sig, spaR_P_ProteinComp_sig,spaKProteinComp_sig,spaK_P_ProteinComp_sig,subtilinComp_sig)));
		     module.setPorts(new ArrayList<Port>(Arrays.asList(spaRProteinComp_port,spaR_P_ProteinComp_port, spaKProteinComp_port,spaK_P_ProteinComp_port,subtilinComp_port)));
		     module.setInteractions(new ArrayList<Interaction>(Arrays.asList(interactionSpaKActivation,interactionSpaRActivation)));	     	     
		     
			return module;									
		 }

	  

	 
	 private void design()
	 {
		 /*ProteinEncodingCdsModule spaKTranslationModule=getProteinEncodingCDSModule("SpaK_module", "SpaK_CDS", "SpaK_Protein");
		 ProteinEncodingCdsModule spaRTranslationModule=getProteinEncodingCDSModule("SpaR_module", "SpaR_CDS", "SpaR_Protein");
		 ProteinEncodingCdsModule gfpTranslationModule=getProteinEncodingCDSModule("GFP_module", "GFP_CDS", "GFP_Protein");
		*/		 
			 
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

		//sr.design();

	}

}
