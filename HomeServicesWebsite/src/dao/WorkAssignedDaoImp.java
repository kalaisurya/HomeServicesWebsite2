package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.DB;
import model.WorkAssigned;

public class WorkAssignedDaoImp implements WorkAssignedDao {

	@Override
	public void addWork(WorkAssigned work) {
		// TODO Auto-generated method stub
		try {
			Connection con = DB.getConnection();
			String sql = "insert into workassigned(servicename,Location,Time,Assigned_to) values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
		    ps.setString(1,work.getServiceName());
			ps.setString(2,work.getLocation());
			ps.setString(3,work.getTime());
			ps.setString(4, work.getAssigned_to());
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error : " + e);
			 }
	}

	@Override
	public void updateAdmin(WorkAssigned work) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(String servicename) {
		// TODO Auto-generated method stub
		
	}

}
