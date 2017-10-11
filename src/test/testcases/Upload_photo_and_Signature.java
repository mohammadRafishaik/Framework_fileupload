package test.testcases;

import org.openqa.selenium.By;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Upload_photo_and_Signature extends UserLibrary {
	public static void Upload_photo_signature() {
		
		try {
			enableHighlight();
			enableTakingScreenshots();
boolean status;
status = Login(getData("URL"), getData("UserName"), getData("Password"));
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

plog = "able to click on upload photo signature radio button";
flog = "unable to click on upload photo and signature radio buuton";
ClickElement(".//*[@id='crd3']");

plog = "able to click on proceed button ";
flog = " unable click on proceed button";
ClickElement(".//*[@id='applViewStages_0']");

plog = "able to click on browse button";
flog = " unable to click on browse button";
ClickElement(".//*[@type='button']");

plog = "able send files ";
flog = "Unable to send files";
Runtime.getRuntime().exec("D:\\AutoIt.exe");
System.out.println("Sucessfully");


plog = "able to click on signature browse button";
flog = " unable to click on signature browse button";
ClickElement(".//*[@type='button']");



plog = "able send files ";
flog = "Unable to send files";
Runtime.getRuntime().exec("D:\\signaturupload.exe");
System.out.println("Sucessfully");


////Upload file views and save uplod file actions are pending///////////////////////////////




		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("e");
		}


		
	}

}
