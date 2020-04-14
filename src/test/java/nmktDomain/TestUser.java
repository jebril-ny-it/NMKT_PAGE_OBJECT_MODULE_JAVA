package nmktDomain;

public class TestUser {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	private String password;
	private String profileName;

	public TestUser(String userID, String password, String profileName) {
		this.userID = userID;
		this.password = password;
		this.profileName = profileName;

	}

}
