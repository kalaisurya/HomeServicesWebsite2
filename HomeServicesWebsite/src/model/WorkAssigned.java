package model;

public class WorkAssigned {

	private String ServiceName;
	private String Location;
	private String Time;
	private String Assigned_to;
	public String getServiceName() {
		return ServiceName;
	}
	
	
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
	public String getAssigned_to() {
		return Assigned_to;
	}


	public void setAssigned_to(String assigned_to) {
		Assigned_to = assigned_to;
	}


	public WorkAssigned() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkAssigned(String serviceName, String location, String time,String assigned_to) {
		super();
		ServiceName = serviceName;
		Location = location;
		Time = time;
		Assigned_to = assigned_to;
	}
	
	
}
