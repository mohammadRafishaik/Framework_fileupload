package test.testcases;

public class New_LL_Scrutinie extends UserLibrary{
	public static void Scrutinie_action() {
		
		try {
			enableHighlight();
			enableTakingScreenshots();
			boolean status;
			status = Login(getData("URL"), getData("UserName"), getData("Password"));
			
			plog = "Able to click on Login button";
			flog ="Unable to click on Login Button";
			ClickElement(".//*[@id='login']");
			
			plog = "able to set value in to username field";
			flog = "Unable to set in to username field value";
			SetText(".//*[@id='username']", getData("UserName"));
			
			plog = "able to set value in to password field";
			flog = "Unable to set in to password field value";
			SetText(".//*[@id='password']", getData("Password"));
			
			plog = "able to click on login Button";
			flog = "Unable to Click  On login Button";
			ClickElement("html/body/div[1]/div/div[3]/form/nav/div/div/ul/li[3]/a");	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("e");
		}
		
	}
	

}
