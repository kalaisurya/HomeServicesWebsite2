package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.Driver;


import model.Admin;
import model.DB;

public class AdminDaoImp implements AdminDao
{

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		try {
			Connection con = DB.getConnection();
			String sql = "insert into admindetails(First_Name,Last_Name,Email,Contact_Number,Password) values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
		    ps.setString(1,admin.getFirstName());
			ps.setString(2, admin.getLastName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getContactNumber());
			ps.setString(5, admin.getPassword());
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error : " + e);
			 }
			
		}
		
	

	@Override
	public Admin getAdminById(int adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		
	}
 
}
