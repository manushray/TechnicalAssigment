package technicalassignment.challenge;

/*************************************** PURPOSE **********************************
- This class is the TestNG class where all the test cases are being written by using priority , passing all 
data from the test cases itself by reading the values from the config properties which makes the code dynamic
logging the test case scenario so that user can check the values from the log too apart from the assertion
*/
import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import technicalassignment.challenge.drivermethod.DriverMethod;
import technicalassignment.challenge.pages.Apppagelogin;
import technicalassignment.challenge.pages.History;
import technicalassignment.challenge.pages.Quardiomanualmeasurement;


@Listeners(technicalassignment.challenge.extentreport.ExtentReportNG.class)
public class AppTest extends DriverMethod
    
{
    
	 static DriverMethod drivermethod;
	 static Apppagelogin apppage;
	 static Quardiomanualmeasurement quardiomanmeasure;
	 static History history;
	 static String weight;
	 static String fat;
	 static String muscle;
	 static String water;
	 static String bone;
	
	
	
	public AppTest() {
		super();
        
	}
	
	@BeforeClass
	public void applaunchMethod() throws Exception {
		initialisation();
		apppage=new Apppagelogin(driver);
		quardiomanmeasure=new Quardiomanualmeasurement(driver);
		history=new History(driver);
		log.info("Code is coming in Before Class Method of AppTest Class");
        
	}
	
/*This test case will pass the already registered user's email & password and once user is through then 
 * it will select the qardio base as the option*/	
	@Test(priority = 1)
    public static void appDashBoardMethodTest() {
		
		apppage.accntSignInMethod(prop.getProperty("email"),prop.getProperty("pwd"));
		apppage.qardioBaseChooseMethod();
		log.info("Code is signing page & choosing of QardioBase");
		
    }

/*This test case will add the measurement of weight, fat, muscle, water & bone along with the notes , all the values
 * are being dynamic as these data are getting fetched from the config.properties file, user can pass them according to the requirement*/
	@Test(priority = 2)
    public static void qardioMeasureMethodTest() {
		
		quardiomanmeasure.manualMeasurementMethod(prop.getProperty("weight"),prop.getProperty("fat"),prop.getProperty("muscle"),prop.getProperty("water"),prop.getProperty("bone"));
		log.info("Code is in Qardio Measurement Method & Adding of measurement is done");
    }

/*This test case will navigate the user to history page and pull all the value like weight, fat, muscle, water & bone  present
 *  in the tab and validate it with the value which the user has entered earlier to make sure the flow is working correctly */
	@Test(priority = 3)
    public static void historyMethodTest() {
		
		history.historyMeasureMethod();
		log.info("Code is in History tab");
		weight=history.historyMeasureWeightMethod();
		Assert.assertEquals(weight, prop.getProperty("weight"));
		log.info("Validation of weight is done successfully");
		fat=history.historyMeasureFatMethod();
		Assert.assertEquals(fat, prop.getProperty("fat"));
		log.info("Validation of fat is done successfully");
		muscle=history.historyMeasureMuscleMethod();
		Assert.assertEquals(muscle, prop.getProperty("muscle"));
		log.info("Validation of muscle is done successfully");
		water=history.historyMeasureWaterMethod();
		Assert.assertEquals(water, prop.getProperty("water"));
		log.info("Validation of water is done successfully");
		bone=history.historyMeasureBoneMethod();
		Assert.assertEquals(bone, prop.getProperty("bone"));
		log.info("Validation of bone is done successfully");
    }
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
