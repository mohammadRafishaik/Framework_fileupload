package test.testcases;

import java.util.Set;

public class DL_Page_Submission extends UserLibrary {
	public static void DL_Page_Data_Filling() {
		
		try {
			boolean Status;
			enableHighlight();
			enableTakingScreenshots();
			//SetImplicitWait(5);
			Status=Login(getData("URL"),getData("UserName"),getData("Password"));
			
			plog = "Able to clik on Apply Online";
			flog = "Unable to click on Apply Online";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
			
			plog = "Able to eclik on Apply Online under LL TAB";
			flog = "Unable to click on Apply Online under LL TAB";
			ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[2]/a");

			plog = " able to click on countinue button";
			flog= "unable top click on Countinue button";
			ClickElement(".//*[@id='bdheight']/div/div/div[2]/div/div/div[4]/input[1]");
			
			plog = "able to set value in to LL_number";
			flog = "Unable to set value in to LL_Number";
			SetText("//input[@id='learningLicence']", getData("LL_Number"));
			// SetText("//input[@id='learningLicence']", getData("LL_NUMBER"));
			
			plog = "able to set value in to Date";
			flog = "Unable to set value in to Date";
			SetText("//input[@id='DOB']", getData("date"));
			//SetText("//input[@id='DOB']", getData("Date"));
			
			plog = "able to click on ok button";
			flog= " Unable to click on ok button";
			ClickElement("//input[@id='ok']");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
System.out.println("Error Message "+e);
		
		}
	}

}
