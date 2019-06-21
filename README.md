Prerequisites – SYSTEM SETUP

Appium: v1.8 or above, if not installed then you can install it from below mentioned URL:https://bitbucket.org/appium/appium.app/downloads/


Java: v1.8 v)(if not installed use: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

qardio_v1.30_com.getqardio.android.apk: Copy the .apk file to your "Andriod/sdk/platform-tools/" path or drag & drop the .apk file to the emulator. I used Mac so my path was "/Users/sdwivedi/Library/Andriod/sdk/platform-tools"

Andriod Emulator: you can use any emulator of your choice, I used Andriod Virtual Device Manager. Once you launch the Emulator you should see the "qardio" app in the App section. (if you don’t have it then download the android studio from the following link : "https://developer.android.com/studio/" you can launch the emulator from "Android Studio > tools > AVD Manager")


Eclipse

Maven: Apache Maven 3.5.4 , if it’s not installed please install from "https://maven.apache.org/install.html"

How to Clone the project from GitHub:

# Clone the code by using below command at your folder destination where you want the code.

git clone https://github.com/manushray/TechnicalAssigment.git

# Open the Eclipse follow the below steps:

Click on the "File > Import "

Navigate to Maven > Existing Maven Projects & click on "Next".

Browse to the location of folder where you have clone the code & click on "Finish"

Description About Code/Framework :

I have created a partial Automation Framework comprise of (Selenium+ JAVA+ TestNG+ Appium +Extent Report(for better UI reporting purpose)+ log4j2(for logging purpose)) .

• "DriverMethod" class is Parent of Test Class "AppTest" where Driver initialisation + capabilities are defined which is present under package name "technicalassignment.challenge.drivermethod".

• All the application code is present under package: “technicalassignment.challenge.pages”.

• Reporting is done by Extent Report whose code is present under package: “technicalassignment.challenge.extentreport”.

• Test Cases are handled by TestNG and as I have build my code using MAVEN hence its present under “src/test/java”.

# As I have made my code dynamic from where you can change the parameter and data set/Test scenario by changing in the config.properties file which is present under package name "src/main/java/technicalassignment/challenge/configuration/config.properties”.


# Please change the below mentioned parameter in the config.properties file before running the script:

Appium_URL (you have to give your appium server Host:port) like http://0.0.0.0:4723/wd/hub so your URL will look like "http://Host:port/wd/hub"

App_Path (you have to give your qardio_v1.30_com.getqardio.android.apk file installed path that would be) "your file location of /Andriod/sdk/platform-tools/qardio_v1.30_com.getqardio.android.apk" mine was "/Users/sdwivedi/Library/Android/sdk/platform-tools/qardio_v1.30_com.getqardio.android.apk".

# You have to make 2 changes in the config.properties and run the code either by command line or from Eclipse itself:

# BUT MAKE SURE YOUR APPIUM & EMULATOR SHOULD BE UP & RUNNING


# Command Line Command:

• go to the project folder and run the below command: 

mvn clean install

# Eclipse:

• Click on "Project > Run As > Maven test"

The whole code will run in around 1:19min

Once Code will run , please refresh the project so that you can view the log by name "mylogger.log" & the result either on eclipse console or in FinalExtentReport.html(this you have to view in Browser)this is for better reporting purpose.



