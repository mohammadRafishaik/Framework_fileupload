package test.testcases;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

public class New_LLSubmission_slotbooking_fee_payment extends UserLibrary{
int Age=16;

	@Test
public static void ApplyLLApplication()  {
	try {
		boolean status;
		/// String age="null"; -----CCondition purpose
		enableTakingScreenshots();
		enableHighlight();
		SetImplicitWait(5);
		status = Login(getData("URL"),getData("UserName"), getData("Password"));
		//SwitchToWindowByTitle(ClassPath);
		plog = "Able to clik on Apply Online";
		flog = "Unable to click on Apply Online";
		ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
		
		plog = "Able to eclik on Apply Online under LL TAB";
		flog = "Unable to click on Apply Online under LL TAB";
		ClickElement(".//*[@href='newLLDet.do']");
		wait(3);
		plog = "Able to eclik on Countinue button";
		flog = "Unable to click on Countinue Button";
		ClickElement(".//*[@class='btn top-space']");
		
		plog = "Able to eclik on submit button";
		flog = "Unable to click on Submit Button";
		ClickElement(".//*[@class='btn top-space']");
/////////////State/////////////////////////////////
		plog = "Able to click on state DN";
		flog = "Unable to click on State DW";
		ClickElement(".//*[@id='licenceFromState']");
		//wait(200);
		plog = "Able to click on state DN";
		flog = "Unable to click on State DW";
		ClickElement(".//*[@value='GJ']");//(".//*[@value='GJ']");
		/////////////////////////////RTO////////////////////////////
		
		plog = "Able to click on state DN";
		flog = "Unable to click on State DW";
		ClickElement(".//*[@id='licenceFromRTO']");
		
		////////////////////////RTO vLAUE??????????????????
		
		plog = "Able to click on state DN";
		flog = "Unable to click on State DW";
		ClickElement(".//*[@value='GJ09']");	  	
		///Name///////
		plog = "Able to set Name";
		flog = "Unable to set Name";
		SetText(".//*[@id='fname']", getData("FirstName"));
		
////MIddle Name//
		plog = "Able to set mName";
		flog = "Unable to set mName";
		SetText(".//*[@id='mname']", getData("Mname"));
		
		///Lname///
		plog = "Able to set lName";
		flog = "Unable to set lName";
		SetText(".//*[@id='lname']", getData("Lname"));
		
		////////Relation Drop Down/////////////
		plog = "Able to click on Relation DN";
		flog = "Unable to click on Relation DW";
		ClickElement(".//*[@id='relationType']");
		
		/////Relation Value////
		plog = "Able to click on Relation DN";
		flog = "Unable to click on Relation DW";
		ClickElement(".//*[@value='F']");

		
		////////FFNAME?/////////////
		plog = "Able to set Name";
		flog = "Unable to set Name";
		SetText(".//*[@id='swdfName']", getData("FFName"));
		
		///////////FmName///////////////
		plog = "Able to set Name";
		flog = "Unable to set Name";
		SetText(".//*[@id='swdmName']", getData("Fmname"));
		
		/////////////flname//////////////////
		plog = "Able to set Name";
		flog = "Unable to set Name";
		SetText(".//*[@id='swdlName']", getData("FLName"));
		
		/////////////////Gender////////////
		
		plog = "Able to click on Gender";
		flog = "Unable to click on Gender";
		ClickElement(".//*[@id='gender1']");
		
		//////////////Qulification////////////
		
		plog = "Able to click on Gender";
		flog = "Unable to click on Gender";
		ClickElement(".//*[@id='eduQual']");
//////////////////////////Qulification Value/////////////////
		
		plog = "Able to click on Gender";
		flog = "Unable to click on Gender";
		ClickElement(".//*[@value='8']");

		
		////Mobilenumber//////////////
		plog = "Able to set MobileNumber";
		flog = "Unable to set Mobile Number";
		SetText(".//*[@id='mobileNumber']",getData("MobileNO"));
		
		//////////////dateOfBirth/////////////
		
		plog = "Able to set dateOfBirth";
		flog = "Unable to set dateOfBirth";
		SetText(".//*[@id='dateOfBirth']",getData("Dob"));
		Thread.sleep(4000);
		ClickElement(".//input[@name='age']");
		Thread.sleep(4000);
		String Age="16";
System.out.println("Age "+Age);
		///Get Value From Date Field
		//String value;
		String value1=driver.findElement(By.xpath(".//*[@id='age']")).getAttribute("value");
		System.out.println("Value  "+value1);
if(Age.contentEquals(value1))
{
	

		
		/////Distric///////////
		plog = "Able to set dist";
		flog = "Unable to set dist";
		ClickElement(".//*[@id='presDistrict']");
		System.out.println("Age is equal to user Required");
}
else
{
	System.out.println("age is not equal to user required");
}
	}	
	catch (Exception e) {
		// TODO Auto-generated catch block

		System.out.println("e");
	}
	
	
	
	
	
//	////// Distric value////
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value";
//	ClickElement(".//*[@value='469']");
//	
//	///////////////Sub Dist/////
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value";
//	ClickElement(".//*[@id='presSubDistrict']");
//	wait(3);
//	///////////////Sub Dist Value/////////////////
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value";
//	//SelectOPtionByValue(".//*[@Value='3737']/option[4]", "Option[4]");
//	//SetText(".//*[@id='presSubDistrict']/option[4]", "Danta");
//	//SelectOPtionByText(".//*[@id='presSubDistrict']", "/option[4]");
//	ClickElement(".//*[@id='presSubDistrict']/option[4]");
//	wait(3);
//	/////pincode////
//	plog = "Able to set dateOfBirth";
//	flog = "Unable to set dateOfBirth";
//	SetText(".//*[@id='presPinCode']",getData("pincode"));
//
//	/////perment address check box///////////////////
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value"; 
//	ClickElement(".//*[@id='presSameAsPerm']");
//	
//	////////////////cov////////////
//	
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value";
//	ClickElement(".//*[@value='Motor cycle without Gear (Non Transport) (MCWOG)']");
//	
//	/////////////Mapping/////////
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value";
//	ClickElement(".//*[@id='newLLApplForm_0']");
//	
//	///////////////Submit buttoon////////////////
//	plog = "Able to set dst value";
//	flog = "Unable to set Dist value";
//	ClickElement(".//*[@id='submitButton']");
//	
//	///////////Alert Handling//////////////////
//New_LLSubmission_slotbooking_fee_payment.SwitchTo();
//	

	}
//	else
//	{
//		System.out.println("age is not valid");     conditon purpose
//	}	


private static String getAttribute(String string) {
		// TODO Auto-generated method stub
		return null;
	}

private static void SwitchTo() {
	// TODO Auto-generated method stub
//	WebDriver driver = null;
	driver.switchTo().alert().accept();
}
///////////////////////////LL_Slot_Booking/////////////////S4RND/////////////////////////////

public static void LL_SlotBooking() {
	
	boolean status;
	enableHighlight();
	enableTakingScreenshots();
	status = Login(getData("URL"), getData("UserName"), getData("Password"));
	plog = "Application is up & Running";
	flog = "Unable to open application";
//	OpenUrl("https://s4rnd.nic.in:8443/sarathiservice/sarathiHomePublic.do");
	//OpenUrl(URL);
	
	plog = "Able to click on OnlineApply field";
	flog = "Unable to click on OnlineApply filed ";
	ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
	
	plog = "Able to click on Application Status";
	flog = "Unable to click on application status";
	//SetText("//input[@id='txtPassword']", "tmasters5150");
	ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[8]/a");
	
	plog = "able to set ll_Num_value";
	flog = "Unable to set ll_num_value";
	SetText(".//*[@id='applNum']",getData("LLNo"));//driver.findElement(By.xpath.sendKeys("75861117");
	
	plog = "able to enter dob";
	flog = "Unable to enter dob";
	SetText(".//*[@id='dateOfBirth']", getData("DOB"));
	//driver.findElement(By.xpath(".//*[@id='dateOfBirth']")).sendKeys("01-02-1994");
	
	plog = "able to click on submit button";
	flog = "unable to click on submit button";
	ClickElement(".//input[@id='submit']");
	
	plog = "able to click on LL_slotbooking radio button";
	flog = "Unable to click on LL_slotbooking radio button";
	ClickElement(".//*[@id='cr4']");
	
	plog = "able click on proceed button";
	flog = "unable to enter proceed button";
	ClickElement(".//*[@id='applViewStages_0']");
	
	plog = "able click on Slot Booking date";
	flog = "Unable to enter Slot booking date";
	ClickElement(".//*[@id='calview']/div[2]/table/tbody/tr[5]/td[4]/a");
	
	plog = "able click on Slot Time redio button";
	flog = "Unable click on Slot redio button";
	ClickElement(".//*[@id='11.00AM-12.30PM40']");
	
	plog = "able to click on slot book button";
	flog = "unable click on slot book button";
	ClickElement(".//*[@id='slotbtn']");
	
	plog = "able click on Confirm to slot booking button";
	flog = "Unbale to click on confirm to slot booking button button";
	ClickElement(".//*[@id='slotbtn']");
	
	System.out.println("Successfully slot is booked");
	
}

public static void Fee_Payment() {
	boolean status;
	
	enableHighlight();
	enableTakingScreenshots();
	
	plog = "Application is up & Running";
	flog = "Unable to open application";
	status = Login(getData("URL"), getData("UserName"), getData("Password"));

//	OpenUrl(".dohttps://s4rnd.nic.in:8443/sarathiservice/sarathiHomePublic");
	//OpenUrl(URL);
	
	plog = "Able to click on OnlineApply field";
	flog = "Unable to click on OnlineApply filed ";
	ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");
	
	plog = "Able to click on Application Status";
	flog = "Unable to click on application status";
	//SetText("//input[@id='txtPassword']", "tmasters5150");
	ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[8]/a");
	
	plog = "able to set ll_Num_value";
	flog = "Unable to set ll_num_value";
	SetText(".//*[@id='applNum']",getData("LLNo"));//driver.findElement(By.xpath.sendKeys("75861117");
	
	plog = "able to enter dob";
	flog = "Unable to enter dob";
	SetText(".//*[@id='dateOfBirth']", getData("DOB"));
	//driver.findElement(By.xpath(".//
	
	plog = "able to click on submit button";
	flog = "unable to click on submit button";
	ClickElement(".//input[@id='submit']");
	
	plog = "able to click on Fee_payment radio button";
	flog = "Unable to click on  Fee_payment radio button";
	ClickElement(".//*[@id='crd5']");
	
	plog = " able click on proceed button ";
	flog = "Unable cl;ick on proceed button ";
	ClickElement(".//*[@id='applViewStages_0']");
	
	plog = " Able to click on Bank drop down";
	flog =" Unable click on Bank Drop Down";
	ClickElement(".//*[@id='bankslist']");
	 
	plog = " Able to click on Bank name";
	flog = " Unable to click on Bank name";
	ClickElement(".//*[@id='bankslist']");
	 
	plog = " able to set value into textfield captch";
	flog =" Unable to click on text field captch";
	SetText(".//*[@id='captchatext']", getData("F99C5V"));
	
	plog = " able to click on pay now button";
	flog = " Unable to click on pay now button";
	ClickElement(".//*[@id='first']");

	
}
}
