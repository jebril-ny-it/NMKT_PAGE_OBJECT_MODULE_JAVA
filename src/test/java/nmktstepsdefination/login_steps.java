package nmktstepsdefination;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Scenario;
import nmktDomain.TestUser;
import nmktpages.FriendsPage;
import nmktpages.HomePage;
import nmktpages.LoginPage;

public class login_steps {

	WebDriver driver;
	TestUser user;
	LoginPage loginPage;
	HomePage homepage;
	FriendsPage friendsPage;

	// HOOKS
	@Before
	public void beforeeachscenario() {
		System.out.println("before each scenario");
	}

	// CODE TO RUN AGAINST GHERKIN LANGUAGE
	@Given("^I open browser chrome$")
	public void I_open_browser_chrome() {
		driver = new ChromeDriver();
	}

	@And("^I navigate to socialware\\.com$")
	public void I_navigate_to_socialware_com() {
		driver.get("https://www.demo.iscripts.com/socialware/demo/");
	}

	@When("^I complete login with valid credentials$")
	public void i_complete_login_with_valid_credentials() throws Throwable {
		user = new TestUser("user@iscripts.com", "User1234", "James Mathew");
		// who is responsible to log in
		loginPage = new LoginPage(driver);
		homepage = loginPage.doLoginWith(user.getUserID(), user.getPassword(), user.getProfileName());
	}

	@Then("^I expect profile name as James Mathew$")
	public void i_expect_profile_name_as_James_Mathew() throws Throwable {
		Assert.assertEquals("Failed to Find Exp Profile Name ", true, homepage.isProfileExistfor("James Mathew"));
		// Assert.assertTrue("Failed to Find Exp Profile Name ",
		// homepage.isProfileExistfor("James Mathew"));

	}

	@And("^I can create & submit a post$")
	public void i_can_create_submit_a_post() throws Throwable {
		homepage.createPost("Sample post by James new...");
		boolean isPostCreated = homepage.getPost("Sample post by James new...");
		Assert.assertEquals("Failed to Create post ", true, isPostCreated);
		// Assert.assertTrue("Failed to Create post ", isPostCreated);
	}

	@Then("^I expects atleast one friend available$")
	public void i_expects_atleast_one_friend_available() throws Throwable {
		friendsPage = homepage.moveToFriendPage();
		boolean isOneFriendExist = friendsPage.isOneFriendExist();
		Assert.assertEquals("no friends available!! ", true, isOneFriendExist);
		// Assert.assertTrue("no friends available!! ", isOneFriendExist);
	}

	// HOOKS
	@After
	public void aftereachScenario(cucumber.api.Scenario scenario) {
		System.out.println("after each scenario");
		if(scenario.isFailed()) {
			try {
				// Casting
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		driver.close();
	}
}
