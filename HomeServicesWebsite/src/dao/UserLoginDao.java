package dao;

import model.User;


public interface UserLoginDao {

       public void newregistration(User user);
       public String getpasswordbyloginId(String loginid);
       
}


