package model;

public class Customer {
	
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Contact_Number;
	private String Password;
	private int Customer_Id;
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String first_Name, String last_Name, String email, String contact_Number, String password,
			int customer_Id) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
		Contact_Number = contact_Number;
		Password = password;
		Customer_Id = customer_Id;
	}
	public Customer(String first_Name, String last_Name, String email, String contact_Number, String password) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
		Contact_Number = contact_Number;
		Password = password;
	} 
	
	

}
