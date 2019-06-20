package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.DB;
import model.User;
import model.Work;

public class WorkDaoImp implements WorkDao{

	@Override
	public void addWork(Work work) {
		// TODO Auto-generated method stub
		try {
			Connection con = DB.getConnection();
			String sql = "insert into workdetails(Service_Name,Service_Details,Price,Available_timings) values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
		    ps.setString(1,work.getServiceName());
			ps.setString(2,work.getServiceDetails());
			ps.setLong(3,work.getPrice());
			ps.setString(4,work.getAvailabelTimings());
			int rowaffected = ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error : " + e);
			 }
			
		}
		

	@Override
	public Work getWorkById(int workId) {
		// TODO Auto-generated method stub
		Work work = new Work();
		try {
					
					Connection con = DB.getConnection();
					String sql ="select * from workdetails where Work_Id=?";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setInt(1, workId);
					ResultSet rs= ps.executeQuery();
					while(rs.next()) {
						work= new Work( rs.getString(1), rs.getString(2),rs.getInt(3), rs.getString(4), rs.getInt(5) );
						
					}
					
				}catch(Exception e) {
					System.out.println("Error : "+ e);
				}
				return work;
			}
	

	@Override
	public List<Work> getAllWork() {
		// TODO Auto-generated method stub
		List<Work> WorkList = new ArrayList<>();
		try {
			
			Connection con = DB.getConnection();
			String sql ="select * from workdetails";
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				Work f = new Work(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
				WorkList.add(f);
			}
			
		}catch(Exception e) {
			System.out.println("Error UserDao getallusers() : "+ e);
		}
		return WorkList;
	}

	@Override
	public void updateWork(Work work) {
		// TODO Auto-generated method stub
		try {
			Connection con = DB.getConnection();
			String sql = "update workdetails set Service_Name=? , Service_Details =? ,Price=? ,Available_timings=? where Work_Id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, work.getServiceName());
			ps.setString(2, work.getServiceDetails());
			ps.setInt(3,work.getPrice() );
			ps.setString(4,work.getAvailabelTimings() );
			ps.setInt(5,work.getWorkId() );
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows updated ");
			con.close();
			 }catch(Exception e){
				 System.out.println("Error Flower Dao Addflower method : " + e);
			 }
	}

	@Override
	public void deleteWork(int workId) {
		// TODO Auto-generated method stub
		try {
			Connection con = DB.getConnection();
			String sql = "delete from workdetails where Work_Id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, workId);
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows Deleted ");
			con.close();
			 }catch(Exception e){
				 System.out.println("Error Flower Dao Addflower method : " + e);
			 }
	}

}
