package technicalassignment.challenge.pages;

/*************************************** PURPOSE **********************************
- This class is the history tab functionality where all the previous added measurement will be shown,
the code will fetch the weight, fat, muscle, water &  bone value from the history log and will return those 
values to the test cases for assertion.
*/

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import technicalassignment.challenge.base.Base;

public class History extends Base {

	static String weight;
	static String fat;
	static String muscle;
	static String water;
	static String bone;
	
	public History(AppiumDriver<WebElement> driver) {
		super(driver);
		
	}
	
/*This method will click on the history tab and then on the bmi(3 dot) which will redirect the user to the measurement tab */	
	public void historyMeasureMethod(){ 
	
		historybtn.click();
		log.info("history tab opened successfully");
		basemeasurebmi.click();
		log.info("code is in base measurement bmi tab");
		
	}

/*This method will get the weight value*/	
	public String historyMeasureWeightMethod(){ 
		
		weight=basemeasureweightplaceholder.getText();
		log.info("weight value is:"+weight);
		return weight;
	}


/*This method will get the fat value*/	
	public String historyMeasureFatMethod(){ 
		
		fat=basemeasurefatplaceholder.getText();
		log.info("fat value is:"+fat);
		return fat;
		
	}

/*This method will get the muscle value*/	
	public String historyMeasureMuscleMethod(){ 
		
		muscle=basemeasuremuscleplaceholder.getText();
		log.info("muscle value is:"+muscle);
		return muscle;
	}

	
/*This method will get the water value*/	
	public String historyMeasureWaterMethod(){ 
		
		water=basemeasurewaterplaceholder.getText();
		log.info("water value is:"+water);
		return water;
	}

	
/*This method will get the bone value*/
	public String historyMeasureBoneMethod(){ 
		
		bone=basemeasureboneplaceholder.getText();
		log.info("bone value is:"+bone);
		return bone;
	}

}