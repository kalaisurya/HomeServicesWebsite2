package model;

public class Admin 
{
	private String FirstName;
    private String LastName;
    private String Email;
    private String ContactNumber;
    private String Password;
    private int AdminId;

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
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public Admin(String firstName, String lastName, String email, String contactNumber, String password, int adminId) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		ContactNumber = contactNumber;
		Password = password;
		AdminId = adminId;
	}
	public Admin() {
		
		// TODO Auto-generated constructor stub
	}
	public Admin(String firstName, String lastName, String email, String contactNumber, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		ContactNumber = contactNumber;
		Password = password;
	}
	
   
    
}
