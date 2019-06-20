package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import model.Customer;
import model.DB;

public class CustomerDaoImp implements CustomerDao{

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			Connection con = DB.getConnection();
			String sql = "insert into customerdetails(First_Name,Last_Name,Email,Contact_Number,Password) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
		    ps.setString(1,customer.getFirst_Name());
			ps.setString(2, customer.getLast_Name());
			ps.setString(3, customer.getEmail());
			ps.setString(4, customer.getContact_Number());
			ps.setString(5, customer.getPassword());
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error : " + e);
			 }
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
	}

}
