package technicalassignment.challenge.pages;

/*************************************** PURPOSE **********************************
- This class is the code for the sign up page where data will be received from the test class and email,
password & login button functionalities will be performed over here and once user is through it then it will 
choose the qardio base as the option 
*/


import org.openqa.selenium.WebElement;


import io.appium.java_client.AppiumDriver;

import technicalassignment.challenge.base.Base;



public class Apppagelogin extends Base{

	
public Apppagelogin(AppiumDriver<WebElement> driver){

	super(driver);

}

/* This method will perform the signing functionality by passing the email id, password & submit button */
	public void accntSignInMethod(String email,String password) {
	
		signbtn.click();
		emailtextfield.sendKeys(email);
		passwordtextfield.sendKeys(password);
		loginbtn.click();
		log.info("logging is done successfully");
	
	}

/* This method will choose the qardio base as the option and cancel the pop-up page of bluetooth option */	
	public void qardioBaseChooseMethod(){
		qardiobaselink.click();
		pagecrossbtn.click();
		exitbtn.click();
		log.info("Qardio Base Choose is done");
	}

}
