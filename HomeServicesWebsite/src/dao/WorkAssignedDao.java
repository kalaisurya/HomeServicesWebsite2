package dao;
import java.util.List;

import model.WorkAssigned;
public interface WorkAssignedDao
{
	public void addWork(WorkAssigned work);
	public void updateAdmin(WorkAssigned work);
	public void deleteAdmin(String servicename);
}
