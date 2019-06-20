package dao;

import model.Customer;


public interface CustomerLoginDao {

       public void newregistration(Customer customer);
       public String getpasswordbyloginId(String loginid);
       
}


