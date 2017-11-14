package test.testcases;

public class DL_Back_Logs extends UserLibrary {
	
	public static void DL_Services() {
		
		try {
			boolean status;
enableHighlight();
enableTakingScreenshots();
SetImplicitWait(5);
status=Login(getData("URL"),getData("UserName"),getData("Password"));


plog = "Able to clik on Apply Online";
flog = "Unable to click on Apply Online";
ClickElement(".//*[@id='cssmenu']/ul/li[1]/a/span[1]");

plog = "able to get the all links home page";
flog = "unable to get the all links home page";
System.out.println("size  "+getSize("a"));

plog = " able to click on Services on Dl field";
flog = " unable to click on Services on Dl Field";
ClickElement(".//*[@id='cssmenu']/ul/li[1]/ul/li[5]/a");

plog = " able to click on Continue button";
flog = "Unable to click on Countinue Button";
ClickElement(".//input[@value='Continue']");

plog = "able to set value in to dlNo field";
flog = "Unable to set value in to dlNo field";
SetText(".//input[@id='dlno']", getData("dlno"));


plog = "able to set data in to date field";
flog = "  unable to set data in to date field";
SetText(".//input[@id='dob']", getData("dob"));

plog = "able to click on proceed button ";
flog = " unable to click on proceed button";
ClickElement(".//*[@type='button']");


		} catch (Exception e) {
System.out.println("Error Message "+e);
		}
	
	}

}
