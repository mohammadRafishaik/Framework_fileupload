package test.testcases;

public class File_Upload extends UserLibrary {
	public static void Upload_File()
	{try
	{
		boolean status;
		enableHighlight();
		enableTakingScreenshots();
		status = Login(getData("URL"), getData("UserName"), getData("Password"));
		
	    plog = "click on file upload link";
	    flog = "nable to click on plosd link";
	    ClickElement(".//*[@id='uploadifive-file_upload']/input[2]");
	    
	    Runtime.getRuntime().exec("C:\\Users\\Supriya\\Desktop\\AutoUpload.exe");
	    System.out.println("Sucessfully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	    
	}
	
	

}
