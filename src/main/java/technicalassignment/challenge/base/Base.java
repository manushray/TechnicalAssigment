package technicalassignment.challenge.base;

/*************************************** PURPOSE **********************************
- This class is the parent class of all the pages where all the elements are being identified by using the page factory
model
*/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Base {

	public static Logger log= LogManager.getLogger(Base.class);
	
	@AndroidFindBy(className="android.widget.TextView")
	protected
	WebElement applaunch;
	
	@AndroidFindBy(id="right_link")
	protected
	WebElement signbtn;
	
	@AndroidFindBy(id="email_edit")
	protected
	WebElement emailtextfield;
	
	@AndroidFindBy(id="password_edit")
	protected
	WebElement passwordtextfield;
	
	@AndroidFindBy(id="login_button")
	protected
	WebElement loginbtn;
	
	@AndroidFindBy(id="btnCloseOnboarding")
	protected
	WebElement pagecrossbtn;
	
	@AndroidFindBy(id="button1")
	protected
	WebElement exitbtn;
	
	@AndroidFindBy(id="weight_value")
	protected
	WebElement addwgtfield;
	
	@AndroidFindBy(id="fat_percentage")
	protected
	WebElement addfatfield;
	
	@AndroidFindBy(id="muscle_percentage")
	protected
	WebElement addmusclefield;
	
	@AndroidFindBy(id="water_percentage")
	protected
	WebElement addwaterfield;
	
	@AndroidFindBy(id="bone_percentage")
	protected
	WebElement addbonefield;
	
	@AndroidFindBy(id="note_input")
	protected
	WebElement addnotefield;
	
	@AndroidFindBy(id="action_save")
	protected
	WebElement actionsavebtn;
	
	@AndroidFindBy(id="action_add_weight_measurement")
	protected
	WebElement addweightmeasbtn;
	
	@AndroidFindBy(id="history_image")
	protected
	WebElement historybtn;
	
	@AndroidFindBy(id="weight_value")
	protected
	WebElement basemeasureweightplaceholder;
		
	@AndroidFindBy(id="fat")
	protected
	WebElement basemeasurefatplaceholder;
	
	@AndroidFindBy(id="muscle")
	protected
	WebElement basemeasuremuscleplaceholder;
	
	@AndroidFindBy(id="water")
	protected
	WebElement basemeasurewaterplaceholder;
	
	@AndroidFindBy(id="bone")
	protected
	WebElement basemeasureboneplaceholder;
	
	@AndroidFindBy(id="base_measurement_bmi")
	protected
	WebElement basemeasurebmi;
	
	
	@AndroidFindBy(xpath="//*[contains(@text,'Sticking to my diet')]")
	protected
	WebElement noteselection;
	
	@AndroidFindBy(xpath="//*[contains(@text,'QARDIOBASE')]")
	protected
	WebElement qardiobaselink;
	
	
	
	public Base(AppiumDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
}
