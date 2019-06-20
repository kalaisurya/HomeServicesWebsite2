package dao;
import java.util.List;

import model.Admin;
public interface AdminDao
{
	public void addAdmin(Admin admin);
	public Admin getAdminById(int adminId);
	public List<Admin> getAllAdmin();
	public void updateAdmin(Admin admin);
	public void deleteAdmin(int adminId);
}
