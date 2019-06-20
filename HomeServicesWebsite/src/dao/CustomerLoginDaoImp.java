package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


import model.DB;
import model.Customer;


public class CustomerLoginDaoImp implements CustomerLoginDao{

                @Override
                public void newregistration(Customer customer) {
                                
                	try {
            			Connection con = DB.getConnection();
            			String sql = "insert into customerdetails(First_Name,Last_Name,Email,Contact_Number,Password) values (?,?,?,?,?)";
            			PreparedStatement ps = con.prepareStatement(sql);
            		    ps.setString(1,customer.getFirst_Name());
            			ps.setString(2,customer.getLast_Name());
            			ps.setString(3,customer.getEmail());
            			ps.setString(4,customer.getContact_Number());
            			ps.setString(5,customer.getPassword());
            			
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
	                                
	                                 String sql = "Select Password from customerdetails where Email ='"+loginid+"'";
	                                 System.out.println("qry executed"); 
	                                 Statement stmt=con.createStatement();
	                                    ResultSet rs=stmt.executeQuery(sql);
	                                    rs.next();
	                                    cpwd=rs.getString(1);
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

