package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


import model.DB;
import model.User;


public class UserLoginDaoImp implements UserLoginDao{

                @Override
                public void newregistration(User user) {
                                
                	try {
            			Connection con = DB.getConnection();
            			String sql = "insert into userdetails(First_Name,Last_Name,Email,Contact_Number,Password,Skill,Status) values (?,?,?,?,?,?,?)";
            			PreparedStatement ps = con.prepareStatement(sql);
            		    ps.setString(1,user.getFirstName());
            			ps.setString(2,user.getLastName());
            			ps.setString(3,user.getEmail());
            			ps.setString(4,user.getContactNumber());
            			ps.setString(5,user.getPassword());
            			ps.setString(6, user.getSkill());
            			ps.setString(7, user.getStatus());
            			int rowaffected = 	ps.executeUpdate();
            			System.out.println(rowaffected + " rows inserted");		
            			con.close();
            			 }catch(Exception e){
            				 System.out.println("Error : " + e);
            			 }
            			
                                
                                
                }

                @Override
                public String getpasswordbyloginId(String loginid) {
                                String cpwd =null;
                                try{
                                     System.out.println("entered impl");
	                                 Connection con =DB.getConnection();
	                                
	                                 String sql = "Select Password from userdetails where Email ='"+loginid+"'";
	                                 System.out.println("qry executed"); 
	                                 Statement stmt=con.createStatement();
	                                    ResultSet rs=stmt.executeQuery(sql);
	                                    rs.next();
	                                    cpwd=rs.getString(1);
	                                    System.out.println(cpwd);
	                                    if(cpwd!=null)
	                                    {
	                                                return cpwd;
	                                    }
	                                    else
	                                                return null;
	}catch(Exception ex){
	                System.out.println("Error in getting password :"+ex);
	}
	                                return cpwd;
	                }

				
				
}

