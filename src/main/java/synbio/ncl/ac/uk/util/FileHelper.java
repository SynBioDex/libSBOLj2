package synbio.ncl.ac.uk.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHelper {
	public static void createDirectory(String filename)
			throws Exception {
		 Path p = Paths.get(filename);
		 if(p.getParent() != null) {
			 File f = new File(p.getParent().toString());
			 if(!f.exists()) {
				 f.mkdirs();
			 }
		 }
	}

	public static void WriteToFile(String filename, String content) throws Exception
	    {
		 
		 /*
		  * let's create first the directories 
		  * if they don't exist 
		  */
		 createDirectory(filename);
		 
	        BufferedWriter bufferedWriter = null;
	        try
	        {
	            //Construct the BufferedWriter object
	            bufferedWriter = new BufferedWriter(new java.io.FileWriter(filename));

	            //Start writing to the output stream
	            bufferedWriter.write(content);


	        }
	        catch (FileNotFoundException ex)
	        {
	            ex.printStackTrace();
	            throw ex;
	        }
	        catch (IOException ex)
	        {
	            ex.printStackTrace();
	            throw ex;
	        }
	        finally
	        {
	            //Close the BufferedWriter
	            try
	            {
	                if (bufferedWriter != null)
	                {
	                    bufferedWriter.flush();
	                    bufferedWriter.close();
	                }
	            }
	            catch (IOException ex)
	            {
	                ex.printStackTrace();
	            }
	        }
	    }
	 
	 public static String GetFileContent(File aFile) throws Exception
	    {
	        //...checks on aFile are elided
	        StringBuilder contents = new StringBuilder();
	        try
	        {
	            //use buffering, reading one line at a time
	            //FileReader always assumes default encoding is OK!
	            BufferedReader input = new BufferedReader(new java.io.FileReader(aFile));
	            try
	            {
	                String line = null; //not declared within while loop
	        /*
	                 * readLine is a bit quirky :
	                 * it returns the content of a line MINUS the newline.
	                 * it returns null only for the END of the stream.
	                 * it returns an empty String if two newlines appear in a row.
	                 */
	                while ((line = input.readLine()) != null)
	                {
	                    contents.append(line);
	                    contents.append(System.getProperty("line.separator"));
	                }
	            }
	            finally
	            {
	                input.close();
	            }
	        }
	        catch (IOException ex)
	        {
	            ex.printStackTrace();
	            throw ex;
	        }

	        return contents.toString();
	    }

}
