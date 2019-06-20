package dao;
import java.util.List;

import model.Customer;
public interface CustomerDao
{
	public void addCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public List<Customer> getAllCustomer();
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int customerId);
}

