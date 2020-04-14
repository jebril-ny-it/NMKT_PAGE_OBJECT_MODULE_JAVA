package nmktpages;

import org.openqa.selenium.WebDriver;

public class HomePage extends MasterPage {

	// THIS IS THE ONLY PART WE CAN CHANGE

	// ALL LOCATORS
	String profile_name_Label = "{xpath://h3[@class='profile_name']//a[contains(text(), '${RPLC}' )]";
	String post_MSG_Label = "{xpath://div[contains(text(), '${RPLC}')]";
	String write_post_textbox = "{xpath://div[@data-placeholder=\"Post your message..\"]";
	String submit_post_Button = "{xpath://input[@class='btn primary post_btn']";
	String friend_list_link = "{xpath://h3[contains(text(),'Friends')]//a[@class='pull-right'][contains(text(),'More'])";

	// --//*[@id="image_id"]
	// --//input[@class='btn primary post_btn']
	// --//div[@class='pull-right']

	// CONSTRUCTOR
	public HomePage(WebDriver driver) {
		super(driver);

	}

	// PAGE SPECIFIC METHOD
	public boolean isProfileExistfor(String profileName) {
		uglyWaitFor(3000);
		return isElementExist(reoplaceLocatorswith(profile_name_Label, profileName));
	}

	public void createPost(String postMsg) {

		// ugly wait thread
		uglyWaitFor(3000);
		typeText(write_post_textbox, postMsg);
		clickElement(submit_post_Button);

	}

	public boolean getPost(String postMsg) {
		return isElementExist(reoplaceLocatorswith(post_MSG_Label, postMsg));

	}

	// this method should return friend page
	public FriendsPage moveToFriendPage() {
		clickElement(friend_list_link);
		return new FriendsPage(driver);

	}

}
