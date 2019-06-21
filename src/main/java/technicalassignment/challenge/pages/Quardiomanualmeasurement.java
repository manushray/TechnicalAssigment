package technicalassignment.challenge.pages;

/*************************************** PURPOSE **********************************
- This class will perform the entering the measurement of weight, fat, muscle, water & bone and notes
*/

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import technicalassignment.challenge.base.Base;

public class Quardiomanualmeasurement extends Base {

	

	public Quardiomanualmeasurement(AppiumDriver<WebElement> driver) {
		super(driver);
		
	}

	
/*This method will add the weight, fat, muscle, water, bone & select the note from the option present*/
	public void manualMeasurementMethod(String weight,String fat,String muscle,String water,String bone){
		
		addweightmeasbtn.click();
		addwgtfield.sendKeys(weight);
		addfatfield.sendKeys(fat);
		addmusclefield.sendKeys(muscle);
		addwaterfield.sendKeys(water);
		addbonefield.sendKeys(bone);
		addnotefield.click();
		noteselection.click();
		actionsavebtn.click();
		log.info("Adding of measurement is done along with the notes");
		
	}
	
}
