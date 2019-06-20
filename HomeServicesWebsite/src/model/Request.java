package model;

public class Request {
   
       
       public Request(int customer_Id) {
            super();
            Customer_Id = customer_Id;
      }
      private String Worker_Alloted;
      private String Address;
      private int Request_Id;
      private int Customer_Id;
      private int Service_Id;
      private String status;
      private String worker_time;
      
	public String getWorker_Alloted() {
		return Worker_Alloted;
	}
	public void setWorker_Allocated(String worker_Alloted) {
		Worker_Alloted = worker_Alloted;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getRequest_Id() {
		return Request_Id;
	}
	public void setRequest_Id(int request_Id) {
		Request_Id = request_Id;
	}
	public int getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}
	public int getService_Id() {
		return Service_Id;
	}
	public void setService_Id(int service_Id) {
		Service_Id = service_Id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getWorker_time() {
		return worker_time;
	}
	public void setWorker_time(String worker_time) {
		this.worker_time = worker_time;
	}
	public Request(String worker_Alloted, String address, int request_Id,
			int customer_Id, int service_Id,  String status,
			String worker_time) {
		super();
		Worker_Alloted = worker_Alloted;
		Address = address;
		Request_Id = request_Id;
		Customer_Id = customer_Id;
		Service_Id = service_Id;
	
		this.status = status;
		this.worker_time = worker_time;
	}
	

	public Request(String worker_Alloted, String address, int customer_Id,
			int service_Id,String status, String worker_time) {
		super();
		Worker_Alloted = worker_Alloted;
		Address = address;
		Customer_Id = customer_Id;
		Service_Id = service_Id;
		this.status = status;
		this.worker_time = worker_time;
	}
	public Request() {
		// TODO Auto-generated constructor stub
	}
	
}

