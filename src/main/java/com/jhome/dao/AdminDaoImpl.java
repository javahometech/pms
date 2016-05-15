package com.jhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jhome.pojo.Employee;
import com.jhome.pojo.User;

@Repository
public class AdminDaoImpl implements IAdminDao {
	@Autowired
	HibernateTemplate template;

	@Transactional
	public void addEmployee(Employee emp) {
		template.save(emp);

	}

	@SuppressWarnings("unchecked")
	public List<Employee> viewEmp() {

		return (List<Employee>) template.find("from Employee");
	}

	@Transactional
	public void deleteEmp(Integer id) {

		template.delete(template.get(Employee.class, id));
		System.out.println("deleteEmp() method in Dao layer");
	}

	public Employee getEmp(Integer id) {
		System.out.println("getEmp" + id);
		return template.get(Employee.class, id);

	}

	@Transactional
	public void updateEmp(Employee emp) {
		// Employee updateEmp = new Employee();
		System.out.println("updateEmp");
		template.saveOrUpdate(emp);
	}

	@Transactional
	public void addUser(User user) {
		System.out.println(" add user in dao");
		template.saveOrUpdate(user);
	}

}
