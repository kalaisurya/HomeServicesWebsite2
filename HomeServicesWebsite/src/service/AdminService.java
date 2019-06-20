package service;

import dao.ServiceWorkerDao;

public class AdminService {
	
	
	public static String allocateWorkers(  String ServiceName ,String[] workerids  ) {
		
		
	String message	=new ServiceWorkerDao().insert(ServiceName,workerids);
		
		return message;
		
		
	}

}
