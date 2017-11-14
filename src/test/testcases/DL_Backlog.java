package test.testcases;

import org.openqa.selenium.By;

public class DL_Backlog extends UserLibrary {
	public static void DL_Backlog_services() {
		try {
			boolean status;
			enableHighlight();
			//enableTakingScreenshots();
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
			ClickElement(".//*[@id='navbar']/ul[1]/li[4]/a");
			
			plog = " able to click on DL_DD_Field Value";
			flog = " Unable to click on DL_DD_Field_Value";
			ClickElement(".//*[@id='navbar']/ul[1]/li[4]/ul/li[19]/a");
			
			wait(5);
			plog = " Able to click on Numeric L_N";
			flog= " Unable to set On Numeric l_N";
			driver.findElement(By.id("ndlNo")).sendKeys("122334");
			//SetText("//input[@type='text']", getData("Numeric_L_No"));
			
			plog =" able to enter data in to Name field";
			flog=" Unable to enter data in to name field";
			SetText(".//*[@id='fname']", getData("Name"));
			
			plog = " Able to click on relation dd";
			flog= " unable to click on relation dd";
			ClickElement(".//*[@id='relation']");
			
			plog = " Able to click on relation dd";
			flog= " unable to click on relation dd";
			ClickElement(".//*[@id='relation']/option[2]");

			plog = " able to click on radio button";
			flog = " Unable to click on Radio button";
			ClickElement(".//*[@id='gender1']");
			
			plog =" able to enter data in to date of birth field";
			flog=" Unable to enter data in to date of birth field";
			SetText(".//*[@id='dob']", getData("date"));
			
			plog =" able to click on qualification dd_ field";
			flog=" Unable to click on qualificaton DD_field";
			ClickElement(".//*[@id='eduqua']");

			plog=" able to click on Quali value field";
			flog=" Unable to click on Quali value field";
			ClickElement(".//*[@id='eduqua']/option[5]");	
			
			plog =" able to enter data in to Name field";
			flog=" Unable to enter data in to name field";
			SetText(".//*[@id='fname']", getData("Name"));
			
			//driver.quit();
			//driver.close();
			
		} catch (Exception e) {

		System.out.println("Error Message "+e);
		}


		
	}

}
