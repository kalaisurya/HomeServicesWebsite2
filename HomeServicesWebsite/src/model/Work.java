package model;

public class Work {

	private String ServiceName;
	private String ServiceDetails;
	private int Price;
	private String AvailabelTimings;
	private int WorkId;
	public String getServiceName() {
		return ServiceName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getServiceDetails() {
		return ServiceDetails;
	}
	public void setServiceDetails(String serviceDetails) {
		ServiceDetails = serviceDetails;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getAvailabelTimings() {
		return AvailabelTimings;
	}
	public void setAvailabelTimings(String availabelTimings) {
		AvailabelTimings = availabelTimings;
	}
	
	
	public int getWorkId() {
		return WorkId;
	}
	public void setWorkId(int workId) {
		WorkId = workId;
	}
	public Work(String serviceName, String serviceDetails, int price, String availabelTimings, int workId) {
		super();
		ServiceName = serviceName;
		ServiceDetails = serviceDetails;
		Price = price;
		AvailabelTimings = availabelTimings;
		WorkId = workId;
	}
	public Work(String serviceName, String serviceDetails, int price, String availabelTimings) {
		super();
		ServiceName = serviceName;
		ServiceDetails = serviceDetails;
		Price = price;
		AvailabelTimings = availabelTimings;
	}
	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
