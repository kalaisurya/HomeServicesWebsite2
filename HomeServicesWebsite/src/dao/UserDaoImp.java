package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import model.DB;
import model.User;
public class UserDaoImp implements UserDao {

                @Override
                public void addUser(User user) {
                                // TODO Auto-generated method stub
                                try {
                                                Connection con = DB.getConnection();
                                                String sql = "insert into userdetails(First_Name,Last_Name,Email,Contact_Number,Password,Skill,Status) values (?,?,?,?,?,?,?)";
                                                PreparedStatement ps = con.prepareStatement(sql);
                                                int id = user.getUserId()+1;
                                    ps.setString(1,user.getFirstName());
                                                ps.setString(2,user.getLastName());
                                                ps.setString(3,user.getEmail());
                                                ps.setString(4,user.getContactNumber());
                                                ps.setString(5,user.getPassword());
                                                ps.setString(6,user.getSkill());
                                                ps.setString(7,user.getStatus());
                                                int rowaffected =             ps.executeUpdate();
                                                System.out.println(rowaffected + " rows inserted");                         
                                                con.close();
                                                }catch(Exception e){
                                                                System.out.println("Error : " + e);
                                                }
                                                
                                }

                @Override
                public User getUserById(int userId) {
                                // TODO Auto-generated method stub
                                return null;
                }

                @Override
                public List<User> getAllUser() {
                                // TODO Auto-generated method stub
                                List<User> UserList = new ArrayList<User>();
                                try {
                                                
                                                Connection con = DB.getConnection();
                                                String sql ="select * from userdetails";
                                                Statement st = con.createStatement();
                                                ResultSet rs= st.executeQuery(sql);
                                                while(rs.next()) {
                                                                User f = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                                                                                                rs.getInt(7),rs.getString(8));
                                                                UserList.add(f);
                                                }
                                                
                                }catch(Exception e) {
                                                System.out.println("Error UserDao getallusers() : "+ e);
                                }
                                return UserList;
                }
                @Override
                public List<User> getUser(String serviceName){
                                List<User> UserList = new ArrayList<>();
                                try {
                                                
                                                Connection con = DB.getConnection();
                                                String sql ="select * from userdetails where skill = '"+serviceName+"'" ;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                                                Statement st = con.createStatement();
                                                ResultSet rs= st.executeQuery(sql);
                                                System.out.println("------------------------"+serviceName);
                                                while(rs.next()) {
                                                                System.out.println("LOOP");
                                                                User f = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(6),
                                                                                                rs.getInt(7),rs.getString(8));
                                                                System.out.println(rs.getString(2));
                                                                UserList.add(f);
                                                }
                                                
                                                for (User user : UserList) {
                                                                System.out.println(user.getFirstName());
                                                                System.out.println(user.getLastName());
                                                }
                                                
                                }catch(Exception e) {
                                                System.out.println("Error UserDao getallusers() : "+ e);
                                }
                                return UserList;
                }
                
                
                
                @Override
                public void updateUser(User user) {
                                // TODO Auto-generated method stub
                                try {
                                                                Connection con = DB.getConnection();
                                                                String sql = "update userdetails set Status=? where FirstName=?";
                                                                PreparedStatement ps = con.prepareStatement(sql);
                                                                ps.setString(1, user.getStatus());
                                                                ps.setString(2, user.getFirstName());
                                                                int rowaffected =             ps.executeUpdate();
                                                                System.out.println(rowaffected + " rows updated ");
                                                                con.close();
                                                                }catch(Exception e){
                                                                                System.out.println("Error : " + e);
                                                                }
                }

                @Override
                public void deleteUser(int userId) {
                                // TODO Auto-generated method stub
                                
                }

}
