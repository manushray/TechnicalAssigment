package technicalassignment.challenge.drivermethod;

/*************************************** PURPOSE **********************************
- This class is the driver class where driver is initialized along with the configuration of reading a file within the package defined
and setting up the capabilities of Android like platform name,device name,which app to run etc
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.*;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DriverMethod 
{
    
	public static AppiumDriver<WebElement> driver;
	public static Properties prop;
	public static Logger log= LogManager.getLogger(DriverMethod.class);
	public static DesiredCapabilities cap = new DesiredCapabilities();
	
	public DriverMethod(){
		
		try {
			prop =new Properties();
			
			FileInputStream ip= new FileInputStream("./src/main/java/technicalassignment/challenge/configuration/config.properties");
			prop.load(ip);
			log.info("loading of config properties file is done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		log.info("Code is coming in constructor of initialisation method of driver method class");
	}
	

	public  void initialisation() throws Exception {
			
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Andriod Emulator");
			cap.setCapability(MobileCapabilityType.APP,prop.getProperty("App_Path"));
			cap.setCapability("autoGrantPermissions",true);
			cap.setCapability("appPackage","com.getqardio.android");
			driver= new AndroidDriver<WebElement>(new URL(prop.getProperty("Appium_URL")),cap);
			log.info("Code is coming in initialisation method of driver method class");

	}
}
