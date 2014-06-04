package org.sbolstandard.core.test;

import org.apache.jena.riot.RDFFormat;

import synbio.ncl.ac.uk.util.RDFHelper;

import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDF;

public class RDFSerializerTry {
	
	private RDFHelper rdfHelper=null;
	private String sbolNameSpace="http://sbols.org/v1#";
	
	public void GenerateRDFExamples() throws Exception
		{
		
		String soNameSpace="http://purl.org/obo/owl/SO#";
		
		rdfHelper=new RDFHelper(sbolNameSpace);
		rdfHelper.AddNameSpace(soNameSpace,"so");
		Resource promoter=rdfHelper.CreateResource("http://fakeuri.org/part/prom1");
		CreateDnaComponent(promoter,soNameSpace + "SO_0000167","prom1","Promoter 1","An example promoter","aaa");
		
		Resource doublePromoter=rdfHelper.CreateResource("http://fakeuri.org/part/doubleprom1");
		
		Resource annotation1=CreateSequenceAnnotation("http://fakeuri.org/part/doubleprom1_1_3", "1", "3", "+", promoter);
		Resource annotation2=CreateSequenceAnnotation("http://fakeuri.org/part/doubleprom1_4_6", "4", "6", "+", promoter);
		rdfHelper.AddProperty(doublePromoter, "annotation", annotation1);
		rdfHelper.AddProperty(doublePromoter, "annotation", annotation2);
		
		CreateDnaComponent(doublePromoter,soNameSpace + "SO_0000167","doubleprom1","Double Promoter 1","A double promoter example","aaaaaa");
			
		
		Resource dnaComponentResource=rdfHelper.CreateResource("http://sbols.org/v1#DnaComponent");
		Resource dnaSequenceResource=rdfHelper.CreateResource("http://sbols.org/v1#DnaSequence");
		Resource[] topLevelResources=new Resource[]{dnaComponentResource,dnaSequenceResource};
		
		//rdfHelper.Write(rdfHelper,RDFFormat.RDFXML_ABBREV,topLevelResources,"RDFExamples",true);
		rdfHelper.Write(rdfHelper,"RDF/XML-ABBREV",topLevelResources,"RDFExamples/pretty.xml",true);
		rdfHelper.Write(rdfHelper,"RDF/XML",topLevelResources,"RDFExamples/plain.xml",true);
		rdfHelper.Write(rdfHelper,"Turtle",topLevelResources,"RDFExamples/turtle.xml",true);
		rdfHelper.Write(rdfHelper, RDFFormat.TRIG_BLOCKS,"RDFExamples/turtleblocks.xml",true);
		
		//SBOLDocument sbolDocument= SBOLHelper.Read("RDFExamples/pretty.xml");
		
		/*Write (rdfHelper, RDFFormat.RDFXML_ABBREV,true);
		Write (rdfHelper, RDFFormat.RDFXML_PLAIN,true);
		Write (rdfHelper, RDFFormat.TRIG_BLOCKS,true);*/
		
		}

	private Resource CreateDnaComponent(Resource resource,String type, String displayId, String name,String description, String nucleotideSequence)
	{
		Resource resourceNA=rdfHelper.CreateResource(resource.getURI() + "/NA");
		rdfHelper.AddProperty(resourceNA, RDF.type, sbolNameSpace +  "DnaSequence");		
		rdfHelper.AddProperty(resourceNA, "nucleotides", nucleotideSequence);
		
		rdfHelper.AddProperty(resource, "dnaSequence", resourceNA);
		
		rdfHelper.AddProperty(resource, "description", description);
		rdfHelper.AddProperty(resource, "name", name);
		rdfHelper.AddProperty(resource, "displayId", displayId);
		rdfHelper.AddProperty(resource, RDF.type, type);	
		rdfHelper.AddProperty(resource, RDF.type, sbolNameSpace +  "DnaComponent");	

		return resource;
	}

	private Resource CreateSequenceAnnotation(String uri, String start, String end,String strand, Resource subComponent)
	{
		Resource resource=rdfHelper.CreateResource(uri);
		rdfHelper.AddProperty(resource, "subComponent", subComponent);		
		rdfHelper.AddProperty(resource, "strand", strand);
		rdfHelper.AddProperty(resource, "bioEnd", end);
		rdfHelper.AddProperty(resource, "bioStart", start);
		rdfHelper.AddProperty(resource, RDF.type, sbolNameSpace +  "SequenceAnnotation");		
		return resource;
	}

	public static void main(String[] args) 
			throws Exception {
		new RDFSerializerTry().GenerateRDFExamples();
	}
}
