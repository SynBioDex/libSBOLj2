package synbio.ncl.ac.uk.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFWriter;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.RDFS;

public class RDFHelper {
	
	private String baseURI=null;
	private Model rdfModel=null;
	public RDFHelper(String fileURI,String baseURI) throws  FileNotFoundException
    {
       this.baseURI=baseURI;
       this.rdfModel=BuildRdfModel(fileURI);
    }
	
	public RDFHelper(String baseURI) throws  FileNotFoundException
    {
       this.baseURI=baseURI;
       this.rdfModel=BuildRdfModel();
    }
	
	private Model BuildRdfModel() 
    {
       Model model=ModelFactory.createDefaultModel();
       model.setNsPrefix( "",this.baseURI);
       return model;
    }
	
	private Model BuildRdfModel(String fileURI) throws FileNotFoundException
     {
        Model model=ModelFactory.createDefaultModel();
        FileInputStream stream=new FileInputStream(new File(fileURI));
        model.read (stream, RDFS.getURI());
        model.setNsPrefix( "sbol",this.baseURI + "#");
        return model;
     }
	 
	public void AddNameSpace(String nameSpace, String nameSpacePrefix)
	{
		 this.rdfModel.setNsPrefix( nameSpacePrefix,nameSpace);
	}
	public Resource CreateResource(String id)
	    {
	        Resource resource = this.rdfModel.createResource(id );
	        return resource;
	    }
	   
	 public void AddProperty(Resource resource, String name, String value)
	    {
		Property property = this.rdfModel.createProperty( this.baseURI + name );
		this.rdfModel.add(resource, property, value);
	    }
	 
	 public void AddProperty(Resource resource, String name, Resource value)
	    {
		Property property = this.rdfModel.createProperty( this.baseURI + name );
		this.rdfModel.add(resource, property, value);
	    }
	 
	 public void AddProperty(Resource resource, Property property, String value)
	    {
		 Resource typeResource=this.rdfModel.createResource(value);
		 resource.addProperty (property, typeResource);
	    }
	 
	 private String GetString() throws Exception
		{
			String rdfData=null;
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			
			try
			{
				RDFWriter fasterWriter = this.rdfModel.getWriter("RDF/XML");				
				fasterWriter.setProperty("allowBadURIs","true");
				fasterWriter.setProperty("relativeURIs","");
				fasterWriter.setProperty("tab","0");			   
				fasterWriter.write(this.rdfModel,stream,this.baseURI);
				rdfData = new String(stream.toString());			
						
			}
			catch (Exception exception)
			{
				System.out.println("------------ERROR IN JENA---------------------------------------------");
				exception.printStackTrace();
				throw exception;
			}
			finally
			{						
				if (stream!=null)
				{
					stream.close();
					stream=null;
				}
				
				
			}						
			return rdfData;
		}
	 
	 public String GetString(Lang lang) throws Exception
	{
		 //http://jena.apache.org/documentation/io/rdf-output.html#rdfformat		
		 String rdfData=null;
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			
			try
			{
				RDFDataMgr.write(stream, this.rdfModel, lang) ;				
				rdfData = new String(stream.toString());			
						
			}
			catch (Exception exception)
			{
				System.out.println("------------ERROR IN JENA---------------------------------------------");
				exception.printStackTrace();
				throw exception;
			}
			finally
			{						
				if (stream!=null)
				{
					stream.close();
					stream=null;
				}
				
				
			}						
			return rdfData;
		 
	}
	 
	 public String GetString(RDFFormat format) throws Exception
		{
			 //http://jena.apache.org/documentation/io/rdf-output.html#rdfformat
		// http://jena.apache.org/documentation/io/rdfxml_howto.html
		 //https://svn.apache.org/repos/asf/jena/trunk/jena-arq/src-examples/arq/examples/riot/
			
			 String rdfData=null;
				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				
				try
				{
					RDFDataMgr.write(stream, this.rdfModel, format) ;				
					rdfData = new String(stream.toString());			
							
				}
				catch (Exception exception)
				{
					System.out.println("------------ERROR IN JENA---------------------------------------------");
					exception.printStackTrace();
					throw exception;
				}
				finally
				{						
					if (stream!=null)
					{
						stream.close();
						stream=null;
					}
					
					
				}						
				return rdfData;
			 
		}
	 
	    //http://jena.apache.org/documentation/io/rdfxml_howto.html#advanced-rdfxml-output
	    public String GetString(String format,Resource[] topLevelResources) throws Exception
	    {
	    	String rdfData=null;
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			
			try
			{
				RDFWriter writer = this.rdfModel.getWriter(format);				
				//fasterWriter.setProperty("allowBadURIs","true");
				//fasterWriter.setProperty("relativeURIs","");
				writer.setProperty("tab","3");			 
				if (topLevelResources!=null && topLevelResources.length>0)
				{
					writer.setProperty("prettyTypes", topLevelResources);
				}
				writer.write(this.rdfModel,stream,this.baseURI);
				rdfData = new String(stream.toString());			
						
			}
			catch (Exception exception)
			{
				System.out.println("------------ERROR IN JENA---------------------------------------------");
				exception.printStackTrace();
				throw exception;
			}
			finally
			{						
				if (stream!=null)
				{
					stream.close();
					stream=null;
				}
				
				
			}						
			return rdfData;
	    }
	 
	    public void Write(RDFHelper rdfHelper, RDFFormat format, Resource[] topLevelResources,String baseDirectory, boolean debug) throws Exception
	    {
	    	String formatName=format.getLang().getName();
	    	String rdf=rdfHelper.GetString(formatName,topLevelResources);
	    	if (debug)
	    	{
	    		System.out.println(String.format("-----------------------------------------------%s-----------------------------------------------",formatName));	//*** Resources are embedded. The repeated resources are represented with URIs only
	    		System.out.print(rdf);			
	    	}
	    	String filePath=String.format("%s/%s.xml", baseDirectory,  formatName);
	    	FileHelper.WriteToFile(filePath, rdf);	    	
	    }
	    
	    public void Write(RDFHelper rdfHelper, String formatName, Resource[] topLevelResources,String filePath, boolean debug) throws Exception
	    {
	    	String rdf=rdfHelper.GetString(formatName,topLevelResources);
	    	if (debug)
	    	{
	    		System.out.println(String.format("-----------------------------------------------%s-----------------------------------------------",formatName));	//*** Resources are embedded. The repeated resources are represented with URIs only
	    		System.out.print(rdf);			
	    	}
	    	//String filePath=String.format("%s/%s.xml", baseDirectory,  formatName);
	    	FileHelper.WriteToFile(filePath, rdf);	    	
	    }
	    
	    public void Write(RDFHelper rdfHelper, RDFFormat format, String filePath, boolean debug) throws Exception
		{
			String rdf=rdfHelper.GetString(format);
			String formatName=format.getVariant().toString();
			FileHelper.WriteToFile(filePath, rdf);
			if (debug)
			{
				System.out.println(String.format("-----------------------------------------------%s-----------------------------------------------",formatName));	//*** Resources are embedded. The repeated resources are represented with URIs only
				System.out.print(rdf);			
			}
		}
	 
}
