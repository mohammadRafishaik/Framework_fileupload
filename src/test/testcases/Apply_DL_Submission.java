package test.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Apply_DL_Submission extends UserLibrary{
	public static void DL_Submission() {
		
		try {
			boolean Status;
			enableHighlight();
			enableTakingScreenshots();
			SetImplicitWait(5);
			Status=Login(getData("URL"),getData("UserName"),getData("Password"));
			
			
			plog="able to click on login button";
			flog="Unable to click on login button";
			ClickElement("html/body/div/div/div[3]/form/nav/div/div/ul/li[3]/a");

			plog ="able to enter username";
			flog="unable to enter username";
			SetText(".//input[@id='username']", getData("UserName"));
			
			
			
			plog ="able to enter password";
			flog="unable to enter password";
			SetText(".//input[@id='password']", getData("Password"));
			
			plog="able to click on Login Button";
			flog="Unable to click on Login Button";
			ClickElement(".//input[@name='submit']");
			
			plog ="able to click on today radio button";
			flog ="unable to click on today radio button";
			ClickElement(".//input[@id='all2']");
			
			plog = "ab;le to click on D_Test Link";
			flog =" Unable to click on DL_Test Link";
			ClickElement(".//*[@id='tableId']/tbody/tr/td[5]");
			ClickElement(".//*[@id='tableId']/tbody/tr/td[5]");

			
			plog ="able to click on pass radio button";
			flog ="unable to click on pass radio button";
			ClickElement("//*[@id='testResult01']");
			
			///Fail Reason/////////////////
			
//			plog = " able to click on Fail Reason Drop_Down";
//			flog = " unable to click on Fail Reason Drop_Down";
//			ClickElement("//input[@id='reasonCd0']");
			
						
			
//			plog = " able to click on Fail Reason Drop_Down Text";
//			flog = " unable to click on Fail Reason Drop_Down Text ";
//			ClickElement("//input[@value='0']");
			
			
	
			plog = "able to set data in to vehical No field ";
			flog = " unable to set data in to vehicle no field";
			SetText(".//*[@id='vehno0']", getData("Vehicle Number"));		
			
			
			plog = "able to click on test Date field";
			flog = " unable to clcik on Test date Field";
			SetText(".//input[@id='testDate0']", getData("Date"));
			
			
			
			plog = " able to click on Time slot Drop_Down";
			flog = " unable to click on Time slot Drop_Down";
			ClickElement(".//input[@id='testSlot0']");
			
						
			
			plog = " able to click on time slot Drop_Down Text";
			flog = " unable to click on Fail Reason Drop_Down Text ";
			ClickElement(".//input[@value='2']");
			
			
			plog = " able to click on side menu";
			flog = "Unable to click on side menu";
			ClickElement(".//*[@id='dltestform']/div[5]/fieldset/div");
			
			plog = " able to click on confirm Check Box";
			flog = " Unable to click on Confirm Check Box";
			ClickElement(".//input[@id='confirmbox0']");
			
			plog= " Able to click on submit button";
			flog = " Unable click on Submit button";
			ClickElement(".//*[@id='dltestform_0']");

			
//			WebDriver driver = null;
//			List<WebElement> element=driver.findElements(By.tagName("fieldset "));
//		int size=	element.size();
//			String obj=driver.getTitle();
//			for(int i=0;i<=size;i++)
//			{
//				String obje1=element.get(i).getText();
//System.out.println("Link Name  "+obje1);
//			}
//			
			} catch (Exception e) {
			// TODO Auto-generated catch block
System.out.println("ErrorMessage  "+e);		}
		
		
	}

}
