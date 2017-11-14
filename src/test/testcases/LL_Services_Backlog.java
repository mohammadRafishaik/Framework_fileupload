package test.testcases;

public class LL_Services_Backlog extends UserLibrary {
	
	public static void LL_BackLog() {
		try {
			boolean status;
			enableHighlight();
			enableTakingScreenshots();
			SetImplicitWait(5);
			status=Login(getData("URL"),getData("UserName"),getData("Password"));
			
			plog = "Able to click on Login button";
			flog ="Unable to click on Login Button";
			ClickElement("html/body/div/div/div[3]/form/nav/div/div/ul/li[3]/a");
			
			plog = "able to set value in to username field";
			flog = "Unable to set in to username field value";
			SetText(".//*[@id='username']", getData("UserName"));
			
			plog = "able to set value in to password field";
			flog = "Unable to set in to password field value";
			SetText(".//*[@id='password']", getData("Password"));
			
			plog = "able to click on login Button";
			flog = "Unable to Click  On login Button";
			ClickElement("html/body/div/div[4]/div/div[2]/div/div[1]/div/form/div[4]/div/input[5]");
			
			plog = " able to click on Dl_DD_field";
			flog = " Unable to click on DL_DD_Field";
			ClickElement(".//*[@id='navbar']/ul[1]/li[2]/a");
			
			plog = " able to click on DL_DD_Field Value";
			flog = " Unable to click on DL_DD_Field_Value";
			ClickElement(".//*[@id='navbar']/ul[1]/li[2]/ul/li[2]/a");
			
			plog= " able to set data on date field ";
			flog = " unable to set data on date field";
			SetText(".//*[@id='llIssueDate']", getData("Date"));
			
			plog= " able to set data on LL_Number Field";
			flog=" Unable to set data Into Ll_Number Field";
			SetText(".//*[@id='llNo']", getData("LL_Number"));
			
			
			plog= " able to set data on Numeric LL_Number Field";
			flog=" Unable to set data Into Numeric Ll_Number Field";
			SetText(".//*[@id='numLicNo']", getData("Numeric_L_No"));
			
			plog = " able  to set data in to first name field";
			flog = "Unable to set data in to first name field";
			SetText(".//*[@id='fname']", getData("FirstName"));
			
			plog = " able to click on Gender Radio button";
			flog = " Unable to click on Gender Radio button";
			ClickElement(".//*[@id='gender1']");
			
			plog = "Able to click on Relation D_D";
			flog = " Unable to click on Relation D_D";
			ClickElement(".//*[@id='relation']");
			
			plog = "Able to click on Relation Value";
			flog= " Unable to click pon Relation Value";
			ClickElement(".//*[@id='relation']/option[2]");
			
			plog = "Able to set data in to DOB Field";
			flog = "Unable to set Data Im to DOB Field";
			SetText(".//*[@id='dob']", getData("DOB"));
			
			plog = "Able to click on Qualification D_D";
			flog= " Unable to click pon Qualification D_D";
			ClickElement(".//*[@id='eduqua']");
			
			plog = "Able to click on Qualification D_D value";
			flog= " Unable to click pon Qualification D_D Value";
			ClickElement(".//*[@id='eduqua']/option[5]");
			
			
			plog = "Able to click on Distict D_D ";
			flog= " Unable to click pon Distict D_D ";
			ClickElement(".//*[@id='prDistrict']");

			plog = "Able to click on Distict D_D value";
			flog= " Unable to click pon Distict D_D Value";
			ClickElement(".//*[@id='prDistrict']/option[15]");

			plog = "Able to click on Taluka D_D ";
			flog= " Unable to click pon Tha;luka D_D ";
			ClickElement(".//*[@id='prSubDistrict']");

			plog = "Able to click on Thaluka D_D value";
			flog= " Unable to click pon Thaluka D_D Value";
			ClickElement(".//*[@id='prSubDistrict']/option[5]");

		
			plog = "Able to set data in to HouseNo Field";
			flog = "Unable to set Data Im to HouseNo Field";
			SetText(".//*[@id='prHouseNo']", getData("HouseNo"));
			
			plog = "Able to set data in to Street Name ";
			flog = " Unable to set data in to Street Name";
			SetText(".//*[@id='prStreet']", getData("Street_name"));
			
			plog = "Able to set data in to pincode ";
			flog = " Unable to set data in to pincode";
			SetText(".//*[@id='prPinCode']", getData("pincode"));
			
			plog = "Able to click on Thaluka D_D value";
			flog= " Unable to click pon Thaluka D_D Value";
			ClickElement(".//*[@id='copy']");
			
			plog = "Able to click on Covs field";
			flog= " Unable to click on covs Field";
			ClickElement(".//*[@id='selectCov']/option[1]");

			plog = "Able to click on Map_arrow";
			flog= " Unable to click pon Map_arrow";
			ClickElement(".//*[@id='LLbacklogForm']/div[2]/fieldset/div[2]/div[2]/div[1]/button");

			
			plog= " able to click on Submit Button";
			flog=" unable to click on Submit button";
			//ClickElement(".//*[@id='bdheight']/div[2]/div[2]");
			
			
			
		
			

		
		} catch (Exception e) {
		
			System.out.println("Error MessAGE" +e);
		}	
		
	}

}
