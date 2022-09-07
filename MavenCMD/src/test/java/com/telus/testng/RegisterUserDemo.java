package com.telus.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegisterUserDemo {

	WebDriver driver;

	String enterFirstName = "Charan";
	String enterLastName = "Singh";
	String enterAddress = "Palwal Haryana";
	String streetAddress = "A23";
	String city = "Palwal";
	String stateName= "Haryana";
	String zipCode = "121102";
	String country = "India";
	String email = "akash123@gmail.com";
	String date = "27/07/2022";
	String hours = "12";
	String minutes = "30";
	String mobile = "9034171706";
	String query = "Registration for nextgen";


	@Test(priority=1)
	public void launchApplication() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/";

		//launch the url
		driver.get(url);

		//maximizie the application
		driver.manage().window().maximize();

	}



	@Test(priority=2)
	public void registrarionForm() {

		Actions action = new Actions(driver);

		// perform mouse hover above the qa automation
		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();

		// perform mouse hover above the practice automation
		WebElement practiceAutomation = driver.findElement(By.xpath("//span[normalize-space()='Practice Automation']"));
		action.moveToElement(practiceAutomation).perform();

		// click on registration form
		WebElement registrationForm = driver.findElement(By.xpath("//span[contains(text(),'Demo Site – Registration Form')]"));
		registrationForm.click();
		System.out.println("Registraion From is open");

		// Validate Title 
		// Declare the webelement object 
		WebElement titleText = driver.findElement(By.cssSelector("#item-vfb-1 > div > h3"));
		// Varify the Title is displayed or not 
		if (titleText.isDisplayed())
		{
			System.out.println("Title is Displayed");
			String regTitle = titleText.getText();
			System.out.println(regTitle);
		}
		else 
		{
			System.out.println("Title is not Displayed");
		}
		// varify the Title is enable or not 
		if (titleText.isEnabled())
		{
			System.out.println("Title is Enabled");
		}
		else 
		{
			System.out.println("Title is not Enabled");
		}
		System.out.println("---------------------------------------------------------");
	}

	@Test(priority=3)
	public void userRegistrarion() {


		// First Name 
		WebElement firstName = driver.findElement(By.id("vfb-5"));
		// Varify the firstname is displayed or not
		if (firstName.isDisplayed())
		{
			System.out.println("First Name is Displayed");
			firstName.sendKeys(enterFirstName);
			System.out.println("First Name is " +enterFirstName);
		}
		else 
		{
			System.out.println("First Name is not Displayed");
		}


		// varify the FirstName is enable or not 
		if (firstName.isEnabled())
		{
			System.out.println("First name is Enabled");
		}
		else 
		{
			System.out.println("First name is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Last Name 
		WebElement lastName = driver.findElement(By.id("vfb-7"));
		// Varify the Lastname is displayed or not
		if (lastName.isDisplayed())
		{
			System.out.println("Last Name is Displayed");
			lastName.sendKeys(enterLastName);
			System.out.println("Last Name is " +enterLastName);
		}
		else 
		{
			System.out.println("Last Name is not Displayed");
		}
		// varify the LastName is enable or not 
		if (lastName.isEnabled())
		{
			System.out.println("Last name is Enabled");
		}
		else 
		{
			System.out.println("Last name is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Gender 
		WebElement maleRadioBtn = driver.findElement(By.id("vfb-8-1"));
		// Varify the Gender is displayed or not
		if (maleRadioBtn.isDisplayed())
		{
			System.out.println("Gender is Displayed");
			maleRadioBtn.click();
		}
		else 
		{
			System.out.println("Gender  is not Displayed");
		}
		// varify the Gender is enable or not 
		if (maleRadioBtn.isEnabled())
		{
			System.out.println("Gender is Enabled");
		}
		else 
		{
			System.out.println("Gender is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Address 

		WebElement address = driver.findElement(By.id("vfb-13-address"));
		// Varify the Address is displayed or not
		if (address.isDisplayed())
		{
			System.out.println("Address is Displayed");
			address.sendKeys(enterAddress);
			System.out.println("Address is " +enterAddress);
		}
		else 
		{
			System.out.println("Address is not Displayed");
		}

		// varify the Address is enable or not 
		if (address.isEnabled())
		{
			System.out.println("Address is Enabled");
		}
		else 
		{
			System.out.println("address is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//StreetAddress 

		WebElement addressStreet = driver.findElement(By.id("vfb-13-address-2"));
		// Varify the Street Address is displayed or not
		if (addressStreet.isDisplayed())
		{
			System.out.println("Street Address is Displayed");
			addressStreet.sendKeys(streetAddress);
			System.out.println("Street Address is " +streetAddress);
		}
		else 
		{
			System.out.println("Street Address is not Displayed");
		}
		// varify the Street Address is enable or not 
		if (addressStreet.isEnabled())
		{
			System.out.println("Street Address is Enabled");
		}
		else 
		{
			System.out.println(" Street address is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//City

		WebElement cityAddress = driver.findElement(By.id("vfb-13-city"));
		// Varify the City Address is displayed or not
		if (cityAddress.isDisplayed())
		{
			System.out.println("City Address is Displayed");
			cityAddress.sendKeys(city);
			System.out.println("City Address is " +city);
		}
		else 
		{
			System.out.println("City Address is not Displayed");
		}
		// varify the City Address is enable or not 
		if (cityAddress.isEnabled())
		{
			System.out.println("City Address is Enabled");
		}
		else 
		{
			System.out.println(" City address is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// State
		WebElement state=driver.findElement(By.id("vfb-13-state"));
		// Verify the state is displayed or not
		if(state.isDisplayed()) {
			System.out.println("State is displayed");
			state.sendKeys(stateName);
			System.out.println("State is "+stateName);
		}
		else
		{
			System.out.println("State is not displayed");
		}

		// Verify the State is enabled or not
		if(state.isEnabled()) {
			System.out.println("State is enabled");


		}

		else
		{
			System.out.println("State is not enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Zip code 	

		WebElement postelCode = driver.findElement(By.id("vfb-13-zip"));
		// Varify the Zip Code is displayed or not
		if (postelCode.isDisplayed())
		{
			System.out.println("Zip Code is Displayed");
			postelCode.sendKeys(zipCode);
			System.out.println("Zip Code is " +zipCode);
		}
		else 
		{
			System.out.println("Zip code is not Displayed");
		}
		// varify the Zip Code is enable or not 
		if (postelCode.isEnabled())
		{
			System.out.println("Zip Code is Enabled");
		}
		else 
		{
			System.out.println("Zip code is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Country 

		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		// Varify the Country is displayed or not
		if (countryDropDown.isDisplayed())
		{
			System.out.println("Country is Displayed");
			Select dropDown = new Select(countryDropDown);
			dropDown.selectByVisibleText(country);
			System.out.println("Country is " +country);
		}
		else 
		{
			System.out.println("Country is not Displayed");
		}
		// varify the Country is enable or not 
		if (countryDropDown.isEnabled())
		{
			System.out.println("Country is Enabled");
		}
		else 
		{
			System.out.println("Country is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Email

		WebElement mail = driver.findElement(By.id("vfb-14"));
		// Varify the Email is displayed or not
		if (mail.isDisplayed())
		{
			System.out.println("Email is Displayed");
			mail.sendKeys(email);
			System.out.println("Email is " +email);
		}
		else 
		{
			System.out.println("Email is not Displayed");
		}
		// varify the Email is enable or not 
		if (mail.isEnabled())
		{
			System.out.println("Email is Enabled");
		}
		else 
		{
			System.out.println("Email is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Date of Demo

		WebElement dateOfDemo = driver.findElement(By.id("vfb-18"));
		// Varify the Date of Demo is displayed or not
		if (dateOfDemo.isDisplayed())
		{
			System.out.println("Date of Demo is Displayed");
			dateOfDemo.sendKeys(date);
			System.out.println("Date of Demo is " +date);
		}
		else 
		{
			System.out.println("Date of Demo is not Displayed");
		}
		// varify the Date of Demo is enable or not 
		if (dateOfDemo.isEnabled())
		{
			System.out.println("Date of Demo is Enabled");
		}
		else 
		{
			System.out.println("Date of Demo is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Convenient Time

		WebElement hoursTime = driver.findElement(By.id("vfb-16-hour"));
		// Varify the Time in Hours is displayed or not
		if (hoursTime.isDisplayed())
		{
			System.out.println("Time in Hours is Displayed");
			Select dropDown1 = new Select(hoursTime);
			dropDown1.selectByVisibleText(hours);
			System.out.println("Time in Hours is " +hours);
		}
		else 
		{
			System.out.println("Time in Hours is not Displayed");
		}
		// varify the Time in Hours is enable or not 
		if (hoursTime.isEnabled())
		{
			System.out.println("Time in Hours is Enabled");
		}
		else 
		{
			System.out.println("Time in Hours is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Varify the Time in minutes is displayed or not
		WebElement minutesTime = driver.findElement(By.id("vfb-16-min"));
		if (minutesTime.isDisplayed())
		{
			System.out.println("Time in minutes is Displayed");
			Select dropDown2 = new Select(minutesTime);
			dropDown2.selectByVisibleText(minutes);

			System.out.println("Time in minutes is " +minutes);
		}
		else 
		{
			System.out.println("Time in minutes is not Displayed");
		}
		// varify the Time in minutes is enable or not 
		if (minutesTime.isEnabled())
		{
			System.out.println("Time in minutes is Enabled");
		}
		else 
		{
			System.out.println("Time in minutes is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Mobile Number
		WebElement mobileNumber = driver.findElement(By.id("vfb-19"));
		// Varify the Mobile Number is displayed or not
		if (mobileNumber.isDisplayed())
		{
			System.out.println("Mobile number is Displayed");
			mobileNumber.sendKeys(mobile);
			System.out.println("Mobile number is " +mobile);
		}
		else 
		{
			System.out.println("Mobile Number is not Displayed");
		}
		// varify the Mobile is enable or not 
		if (mobileNumber.isEnabled())
		{
			System.out.println("Mobile number is Enabled");
		}
		else 
		{
			System.out.println("Mobile number is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Course 
		WebElement seleniumWebDriverCheckBox = driver.findElement(By.id("vfb-20-0"));
		// Varify the Selenium WebDriver is displayed or not
		if (seleniumWebDriverCheckBox.isDisplayed())
		{
			System.out.println("Selenium WebDriver is Displayed");
			seleniumWebDriverCheckBox.click();

		}
		else 
		{
			System.out.println("Selenium WebDriver is not Displayed");
		}

		// varify the Selenium WebDriver is enable or not 
		if (seleniumWebDriverCheckBox.isEnabled())
		{
			System.out.println("Selenium WebDriver is Enabled");
		}
		else 
		{
			System.out.println("Selenium WebDriver is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Varify the TestNG is displayed or not
		WebElement testNGCheckBox = driver.findElement(By.id("vfb-20-2"));

		if (testNGCheckBox.isDisplayed())
		{
			System.out.println("TestNG is Displayed");
			testNGCheckBox.click();

		}
		else 
		{
			System.out.println("TestNG is not Displayed");
		}
		// varify the TestNG is enable or not 
		if (testNGCheckBox.isEnabled())
		{
			System.out.println("TestNG is Enabled");
		}
		else 
		{
			System.out.println("TestNG is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Varify the Core Java is displayed or not
		WebElement coreJavaCheckBox = driver.findElement(By.id("vfb-20-3"));
		if (coreJavaCheckBox.isDisplayed())
		{
			System.out.println("Core Java is Displayed");
			coreJavaCheckBox.click();

		}
		else 
		{
			System.out.println("Core Java is not Displayed");
		}
		// varify the Core Java is enable or not 
		if (coreJavaCheckBox.isEnabled())
		{
			System.out.println("Core Java is Enabled");
		}
		else 
		{
			System.out.println("Core Java is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Enter your query

		WebElement enterQuery = driver.findElement(By.id("vfb-23"));
		// Varify the Query is displayed or not
		if (enterQuery.isDisplayed())
		{
			System.out.println("Query is Displayed");
			enterQuery.sendKeys(query);
			System.out.println("Query is " +query);
		}
		else 
		{
			System.out.println("Query is not Displayed");
		}
		// varify the Query is enable or not 
		if (enterQuery.isEnabled())
		{
			System.out.println("Query is Enabled");
		}
		else 
		{
			System.out.println("Query is not Enabled");
		}

		System.out.println("---------------------------------------------------------");

		// Verification Code 
		WebElement digitMsg = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label"));

		String exampleMsg1 = digitMsg.getText();
		String arrExample [] = exampleMsg1.split(":");

		for(String arrAfterSplit : arrExample) {
			System.out.println(arrAfterSplit);
		}
		String textCode = arrExample[1].trim();
		System.out.println(textCode);

		WebElement verificationTextCode = driver.findElement(By.id("vfb-3"));

		//Verify the Verification Code is display or not
		if(verificationTextCode.isDisplayed()) {
			System.out.println("Verification code is displayed");
			verificationTextCode.sendKeys(textCode);
		}

		else
		{
			System.out.println("Verification Code is not displayed");	
		}

		//Verify the Verification Code is enabled or not
		if(verificationTextCode.isEnabled())
		{
			System.out.println("Verification Code is enabled");

		}
		else 
		{
			System.out.println("Verification Code is not enabled");
		}

		System.out.println("---------------------------------------------------------");

		//Submit Button
		WebElement submitButton=driver.findElement(By.id("vfb-4"));

		//Verify the Submit Button is displayed or not
		if(submitButton.isDisplayed()) {
			System.out.println("Submit  Button is displayed");
		}

		else
		{
			System.out.println("Submit  Button is not displayed");	
		}

		//Verify the Submit Button is enabled or not
		if(submitButton.isEnabled()) {
			System.out.println("Submit Button is enabled");

			submitButton.click();
			System.out.println("Submit Button is clicked");

		}

	}


	@Test(priority=4)
	public void successfulMessage() {

		//Form Successfully Submitted Text
		WebElement successfulMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/div"));
		String message = successfulMessage.getText();
		String expMessage [] = message.split(":");
		String transectionId = expMessage[1].trim();

		if(message.contains( message)) {
			System.out.println("Registration From Successful");
			System.out.println("Successful Message Display ");
			System.out.println(("The Actual Successful Message is "+message));
			System.out.println("Trasenction Id : "+transectionId);

		}
		else 
		{
			System.out.println("Actual and the expected Successful Message are not same");
			System.out.println(("The Actual Successful Message is "+successfulMessage));
			System.out.println(("The expected Successful message is "+expMessage));
		}
	}


	@Test(priority=5)
	public void applicationClose() {

		driver.close();
		System.out.println("Application is successful closed");	
	}


}
