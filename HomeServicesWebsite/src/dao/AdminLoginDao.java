package dao;

import model.Admin;


public interface AdminLoginDao {

       public void newregistration(Admin admin);
       public String getpasswordbyloginId(String loginid);
       
}


