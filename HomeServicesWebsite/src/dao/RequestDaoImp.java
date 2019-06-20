
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
import model.Request;
import model.Request;
import model.User;
import model.Work;

public class RequestDaoImp implements RequestDao
{

                @Override
                public void addRequest(Request request) {
                                // TODO Auto-generated method stub
                                try {
                                                Connection con = DB.getConnection();
                                                String sql = "insert into requests(Worker_Alloted,Address,customer_id,service_id,status,worker_time) values (?,?,?,?,?,?)";
                                                PreparedStatement ps = con.prepareStatement(sql);
                                                ps.setString(1,request.getWorker_Alloted());
                                                ps.setString(2,request.getAddress());
                                                ps.setInt(3,request.getCustomer_Id());
                                                ps.setInt(4,request.getService_Id());
                                                ps.setString(5,request.getStatus());
                                                ps.setString(6,request.getWorker_time());
                                                int rowaffected =ps.executeUpdate();
                                                System.out.println(rowaffected + " rows inserted");                         
                                                con.close();
                                                }catch(Exception e){
                                                                System.out.println("Error : " + e);
                                                }
                                                
                }

                @Override
                public Request getRequestById(int requestId) {
                                // TODO Auto-generated method stub
                                return null;
                }

                @Override
                public List<Request> getAllRequest() {
                                // TODO Auto-generated method stub
                                List<Request> RequestList = new ArrayList<Request>();
                                try {
                                                
                                                Connection con = DB.getConnection();
                                                String sql ="select * from requests";
                                                Statement st = con.createStatement();
                                                ResultSet rs= st.executeQuery(sql);
                                                while(rs.next()) {
                                                                Request f = new Request(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(5),rs.getInt(6),rs.getString(4),rs.getString(7));
                                                                RequestList.add(f);
                                                }
                                                
                                }catch(Exception e) {
                                                System.out.println("Error UserDao getallusers() : "+ e);
                                }
                                return RequestList;
                }

                

                @Override
                public void DeleteRequest(int requestId) {
                                // TODO Auto-generated method stub
                                
                }

                @Override
     public int getcustromerId(String cus_Email){
               int customer_id = 0;
               try{
                               Connection con =DB.getConnection();
                               String sql = "Select customer_id from customerdetails where Email ='"+cus_Email+"'";
             System.out.println("qry executed"); 
             Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(sql);
                rs.next();
                customer_id=rs.getInt(1);
                System.out.println("Customer ID"+customer_id);
                
         
                                                con.close();
               
               }catch(Exception ex){
             System.out.println("Error in getting Id:"+ex);
               }
               return customer_id;
                }
               
               
                
                @Override
                public Request getcustId(int id){
                                Request req = new Request();
                                try {
                                                                
                                                                Connection con = DB.getConnection();
                                                                String sql ="select customer_id from customerdetails where customer_Id=?";
                                                                PreparedStatement ps = con.prepareStatement(sql);
                                                                ps.setInt(1,id);
                                                                ResultSet rs= ps.executeQuery();
                                                                
                                                                while(rs.next()) {
                                                                                
                                                                                req = new Request(rs.getInt(1));
                                                                }
                                                                
                                                                
                                                                
                                                }catch(Exception e) {
                                                                System.out.println("Error : "+ e);
                                                }
                                return req;
                }
                @Override
                public List<Request> viewRequest(String id1) {
                      // TODO Auto-generated method stub
                      List<Request> reqList = new ArrayList<Request>();
                      int id = Integer.parseInt(id1);
                      try {
                            Connection con = DB.getConnection();
                            String sql = "select * from requests where customer_id='"+id+"'";
                            Statement st = con.createStatement();
                            ResultSet rs= st.executeQuery(sql);
                            while(rs.next()) {
                                  Request req = new Request(rs.getString(1),rs.getString(2),rs.getInt(5),rs.getInt(6),rs.getString(4),rs.getString(7));
                                  reqList.add(req);
                            }
                            con.close();
                            }catch(Exception e){
                                  System.out.println("Error : " + e);
                            }
                            return reqList;
                }



                @Override
                public void updateRequest(Request request) {
                	try {
            			Connection con = DB.getConnection();
            			String sql = "update requestdetails set Worker_Allocated=? where request_id=?";
            			PreparedStatement ps = con.prepareStatement(sql);
            			ps.setString(1,request.getWorker_Alloted());
            			ps.setInt(2,request.getRequest_Id());
            			int rowaffected = 	ps.executeUpdate();
            			System.out.println(rowaffected + " rows updated ");
            			con.close();
            			 }catch(Exception e){
            				 System.out.println("Error Flower Dao Addflower method : " + e);
            			 }
                                
                }

                
               
                 
 
}
