package nmktpages;

import org.openqa.selenium.WebDriver;

public class FriendsPage extends MasterPage {

	String all_Friend_Components = "{xpath://div[@class=\"mediapost display_table wid100per\"]";

	// CONSTRUCTOR
	public FriendsPage(WebDriver driver) {
		super(driver);
	}

	// PAGE SPECIFIC METHOD
	public boolean isOneFriendExist() {
		// ugly wait thread
		uglyWaitFor(3000);
		return getElementsCount(all_Friend_Components);
	}

}
