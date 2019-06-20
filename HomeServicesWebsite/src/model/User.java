package model;

public class User {

	private String FirstName;
    private String LastName;
    private String Email;
    private String ContactNumber;
    private String Password;
    private String Skill;
    private int UserId;
    private String Status;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public User(String firstName, String lastName, String email, String contactNumber, String password, String skill,
			int userId, String status) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		ContactNumber = contactNumber;
		Password = password;
		Skill = skill;
		UserId = userId;
		Status = status;
	}
	public User(String firstName, String lastName, String email, String contactNumber, String password, String skill,String status) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		ContactNumber = contactNumber;
		Password = password;
		Skill = skill;
		Status = status;
	}
	public User() {
		
		// TODO Auto-generated constructor stub
	}
	
	public User(String firstName, String lastName, String email,
			String contactNumber, String password, int userId, String status) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		ContactNumber = contactNumber;
		Password = password;
		UserId = userId;
		Status = status;
	}
    
    
}
