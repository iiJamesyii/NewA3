//Artatawe UserProfile class

public class UserProfile(){
	
	private String username;
	private String firtName;
	private String lastName;
	private String mobileNumber;
	private String address;
	private Date lastLogin;
	private Image profileImage;
	
	public UserProfile(String username, String firstName, String lastName, String mobileNumber, String address, Date lastLogin, Image profileImage){
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.lastLogin = lastLogin;
		this.profileImage = profileImage;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getFirstName(){
		return firtName;
	}
	public void setFirstName(String firtName){
		this.firtName = firtName;
	}
	
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public Date getLastLogin(){
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin){
		this.lastLogin = lastLogin;
	}
	
	public Image getProfileImage(){
		return profileImage;
	}
	public void setProfileImage(Image profileImage){
		this.profileImage = profileImage;
	}
	
	
}