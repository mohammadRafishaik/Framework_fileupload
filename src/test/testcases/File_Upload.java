package test.testcases;

import org.openqa.selenium.By;

public class File_Upload extends UserLibrary {
	public static void Upload_File()
	{
		try
	{
			enableHighlight();
			enableTakingScreenshots();
			int age=16;
		boolean status;
		status = Login(getData("URL"), getData("UserName"), getData("Password"));
		
		OpenUrl("https://s4rnd.nic.in:8443/sarathiservice/sarathiHomePublic.do");
		//OpenUrl(URL);
		
		plog = "Able to enter username";
		flog = "Uable to enter username";
		ClickElement(".//*[@id='cssmenu']/ul/li[2]/a");
		
		plog = "Able to enter password";
		flog = "Unable to enter password";
		//SetText("//input[@id='txtPassword']", "tmasters5150");
		ClickElement(".//*[@id='cssmenu']/ul/li[2]/ul/li[1]/a");
		
		plog = "able to set value";
		flog = "Unable to set value";
		driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div/div[2]/div/div/form/div[2]/div/div[2]/input")).sendKeys("75861117");
		driver.findElement(By.xpath(".//*[@id='dateOfBirth']")).sendKeys("01-02-1994");
		
		
		plog = "able to click on submit button";
		flog = "unable to click on submit button";
		ClickElement(".//*[@id='submitbtn']");
		
		plog = "able to click on ok";
		flog = "unable to click on ok";
		ClickElement(".//*[@id='ok']");
		
		plog = "Able to click Doc ment field";
		flog = "Unable to click on doc ment field";
		ClickElement(".//*[@id='documentType']");
		
		wait(2);
		plog = "Able to click Doc ment field value";
		flog = "Unable to click on doc ment field Value";
		ClickElement(".//*[@id='documentType']/option[2]");
		
		//SelectOPtionByValue(".//*[@value='1']", "1");
		//ClickElement(".//*[@value='1']");
		plog = "Able to click Related Doc ment field";
		flog = "Unable to click on  Related doc ment field";
		ClickElement(".//*[@id='relatedDocuments']");
		
		plog = "Able to click Related Doc ment field value";
		flog = "Unable to click on  Related doc ment field value";
		ClickElement(".//*[@id='relatedDocuments']/option[2]");
		
		plog = "Able to set  Doc ment number field value";
		flog = "Unable to set    doc ment number field value";
		SetText(".//*[@id='certificateNumber']", "DOCNo");
		
		plog = "Able to set  Doc ment issue date field value";
		flog = "Unable to set    doc ment issyes date field value";
		SetText(".//*[@id='issuedAuthDesg']", "IssueNo");
		
		plog = "able set date ";
		flog = "Unable to set date";
		SetText(".//*[@id='issuedDate']", "Date");
		wait(5);
		ClickElement(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[1]/a");

		plog = "able to click on Upload file field";
		flog = "unable to click on Upload file field";
		ClickElement(".//*[@id='uploadedFile']");
		//Thread.sleep(5000);
	    plog = "able send files ";
	    flog = "Unable to send files";
	    Runtime.getRuntime().exec("D:\\AutoIt.exe");
	    System.out.println("Sucessfully");
	    
	    plog = "Able to click on uplod option";
	    flog = "Unable to set on upload file action";
	    ClickElement(".//*[@id='upload']");
	    
//	    plog = "able to set click on confirm button";
//	    flog = "Unable to click on confirm button";
	   // ClickElement(".//*[@id='confirm']");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	    
	}
	
	

}
