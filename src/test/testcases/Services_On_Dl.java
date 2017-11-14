package test.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Services_On_Dl extends UserLibrary {
	
public static void DL_servces_withoutlogin() {
	try {
		boolean status;
		enableHighlight();
		enableTakingScreenshots();
		//SetImplicitWait(5);
		status =Login(getData("URL"));//,getData("UserName"),getData("Password"));
		
		plog = "Able to clik on Apply Online";
		flog = "Unable to click on Apply Online";
		ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
		
		plog = "Able to eclik on Apply Online under DL_Services_On_TAB";
		flog = "Unable to click on Apply Online under Dl_Services_On_TAB";
		ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[5]/a");
		
		plog = "Able to click on countinue button";
		flog =  "UnAble to click on countinue button";
		ClickElement("//input[@type='button']");
		
		plog= "able to set data into dl_number field";
		flog= "Unable to set dta into dl_Number field";
		SetText("//input[@id='dlno']", getData("Dl_Num"));
		
		plog= "able to set data into dl_date field";
		flog= "Unable to set dta into dl_date field";
		SetText("//input[@id='dob']", getData("Date"));
		wait(5);

		
		plog = "Able to click on go button";
		flog =  "UnAble to click on go button";
		ClickElement("//input[@type='button']");
		
		wait(5);
		plog = "Able to click on State Drop_Down field";
		flog =  "UnAble to click on State Drop_Down field ";
		ClickElement(".//*[@id='stateCodeDLTr']");
		wait(5);

		plog = "Able to click on name of state field";
		flog =  "UnAble to click on name of state Field";
		ClickElement(".//*[@id='stateCodeDLTr']/option[3]");
		
		wait(5);

		plog = "Able to click on rto D_D field";
		flog =  "UnAble to click on rto D_D field";
		ClickElement(".//*[@id='rtoCodeDLTr']");
		
		wait(5);

		plog = "Able to click on Value Of Rto";
		flog =  "UnAble to click on value Of Rto"; 
		ClickElement(".//*[@id='rtoCodeDLTr']/option[2]");
		wait(5);

		plog = "Able to click on confirm button";
		flog =  "UnAble to click on confirm button";
		ClickElement(".//*[@id='dlconfirm']");
		
		wait(5);
//		plog = "Able to click on bloodGroup d_d";
//		flog = "Unable to click on bloodGroup d_d";
//		ClickElement(".//*[@id='bloodGroup']");
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='bloodGroup']"));
		Select object=new Select(element);
		object.selectByVisibleText("A+");
		driver.findElement(By.xpath(".//*[@id='bloodGroup']/option[5]")).click();
		
//		wait(7);
//		plog = " able to select on bloodGroup value";
//		flog = " unable to click on bloodGroup value";
//		ClickElement(".//*[@id='bloodGroup']]/option[5]");
//		ClickElement("html/body/div/div/div[3]/form/div/div[2]/div[4]/div[2]/fieldset/div/div/div[2]/select/option[5]");
//		
//		wait(7);
		
		plog = " able to click on envaction_enve_confirm button";
		flog = "Unable to click on envaction_enve_confirm button";
		ClickElement(".//*[@id='envaction_enve_confirm']");
		wait(5);

			plog = " Able to click on Services check box";
			flog = " UnAble to click on Services check box";
			ClickElement(".//input[@id='dlc1-1']");
			
			plog = " able to click on proceed button";
			flog= " unable to click on proceed button";
			ClickElement(".//*[@id='trsaction_enve_proceed']");

			
			plog = " Able to click on present address radio Button";
			flog = " UnAble to click on present address radio Button";
			ClickElement(".//*[@id='coaradiobuttonPresent']");
			 wait(9);
			plog = " Able to click on present distict dd ";
			flog = " UnAble to click on present distict dd ";

			WebElement element1=driver.findElement(By.xpath(".//*[@id='tmpDistCoa']"));
			Select object1=new Select(element1);
			object1.selectByVisibleText("Bara Banki");
			driver.findElement(By.xpath(".//*[@id='tmpDistCoa']/option[46]")).click();
			
			/*plog = " Able to click on present distict dd Button";
			flog = " UnAble to click on present distict dd Button";
			ClickElement(".//*[@id='tmpDistCoa']");
			
			plog = " Able to click on present distict dd Value";
			flog = " UnAble to click on present distict dd Value";
			ClickElement(".//*[@id='tmpDistCoa']/option[46]"); */
			
			plog = " Able to click on present distict dd Button";
			flog = " UnAble to click on present distict dd Button";
			ClickElement(".//*[@id='tmpMandalCoa']");
			
			plog = " Able to click on present distict dd Button";
			flog = " UnAble to click on present distict dd Button";
			ClickElement(".//*[@id='tmpMandalCoa']/option[3]");
			
			plog= " able setvalue of Location";
			flog= " unqable to set value of Location";
			SetText(".//*[@id='tmpLocationCoa']", getData("Location"));
			
			 plog = " able to set value of pincode";
			 flog = " Unable to set value of pincode";
			 
			 SetText(".//*[@id='tmpPincodeCoa']", getData("Pincode"));
			
			
			
			
			plog = " Able to click on Services Proceed Button";
			flog = " UnAble to click on Services Proceed Button";
			//ClickElement(".//*[@id='coaconfirm']");
			
			/*plog = " able to click on reson Field";
			flog= "Unable to click on Reson Field";
			ClickElement(".//*[@id='dupreasoncd']");
			
			plog = " Able to click on reson value";
			flog = " Unable tp click on Reason Value";
			ClickElement(".//*[@id='dupreasoncd']/option[4]");
			
			plog = " able to click on LL No Check box";
			flog=" Unable to click on LL No Check Box";
			ClickElement(".//*[@id='addcovdet']");
			
			plog = " able to click on confirm button";
			flog= " Unable to click on Confirm Button";
			ClickElement(".//*[@id='dupconfirm']");*/
			
	
			
			

			
			
			

			
		//	plog = "able to click on "
		
		
		//driver.switchTo().alert().accept();

	
		
		
	} catch (Exception e) {

		System.out.println("Error Message "+e);
	}
	
}

}

