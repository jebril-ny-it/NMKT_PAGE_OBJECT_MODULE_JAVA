package nmktpages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends MasterPage{
	// *** SCR : Single Change Responsibility Rules need to taken care ********* 
	//THIS IS THE ONLY PART WE CAN CHANGE
	
	//ALL LOCATORS
	String user_email_textBox = "{id:user_email";
	String user_password_textbox = "{name:user_password";
	String user_login_Button = "{name:btnSubmit";
	

	//SCR APPLIED SO DONT CHANGE BELOW PLEASE
	
	//CONSTRUCTOR
	public LoginPage(WebDriver driver) {
		super(driver);//master please use this driver
	}

	//PAGE SPECIFIC METHOD
	public HomePage doLoginWith(String userID, String password, String profileName) {
		typeText(user_email_textBox, userID);
		typeText(user_password_textbox, password);
		clickElement(user_login_Button);
		return new HomePage(driver);
	}

}
