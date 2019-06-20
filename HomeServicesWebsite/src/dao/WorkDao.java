package dao;
import java.util.List;

import model.Work;
public interface WorkDao
{
	public void addWork(Work work);
	public Work getWorkById(int workId);
	public List<Work> getAllWork();
	public void updateWork(Work work);
	public void deleteWork(int workId);
}

