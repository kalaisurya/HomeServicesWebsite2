package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.DB;

public class ServiceWorkerDao {
	
	
	public String insert(String ServiceName ,String[] workerids) {
		
	     String message =null;
        try {
                        Connection con = DB.getConnection();
                        
                        
                        String sql = "insert into service_worker(service_name,worker_id) values (?,?)";
                        PreparedStatement ps = con.prepareStatement(sql);
                        int rowaffected = 0;
                        ps.setString(1,ServiceName);
                        for (String worker : workerids) {
                        	 ps.setInt(2,Integer.parseInt(worker));
                        	  rowaffected  =             ps.executeUpdate();
   	
							
						}
                        
                    
                      
                        System.out.println(rowaffected + " rows inserted");                         
                        con.close();
                        }catch(Exception e){
                        	message ="worker allocated already";
                                        System.out.println("Error : " + e);
                        }
        
        		return message;
		
	}

}
