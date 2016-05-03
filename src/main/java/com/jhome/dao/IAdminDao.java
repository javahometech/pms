package com.jhome.dao;

import java.util.List;

import com.jhome.pojo.Employee;
import com.jhome.pojo.User;

public interface IAdminDao {

	public void addEmployee(Employee emp);

	public List<Employee> viewEmp();

	public void deleteEmp(Integer id);

	public Employee getEmp(Integer id);
	public void updateEmp(Employee emp);
	public void addUser(User user);
}
