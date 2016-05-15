package com.jhome.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhome.dao.IAdminDao;
import com.jhome.pojo.Employee;
import com.jhome.pojo.User;

@Controller
public class AdminController {
	@Autowired
	private IAdminDao adminDao;
	void arunasMethod(){
		// Aruna;s logic
	}
	void hiMethod(){
		//some changes
	}
	void twoMethod(){
		//added changes
	}
	
	void helloWorldmethod(){
		//helloWorld java
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public void addUserForm(@ModelAttribute("user") User user) {
		System.out.println("this is add user method in Employee Controller");
		System.out.println("Aruna Sysout");
		System.out.println("some add the functionality");
		System.out.println("hello world java!!!!!!!!!!!!!!!!!!!");
		System.out.println("this is amrutha");
		System.out.println("added new sysout by Siva");
		
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("user") User user,
			BindingResult results) {

		System.out.println("this is adduser post method");

		if (results.hasErrors()) {
			return "addUser";
		}
		System.out.println(".............add user method........."
				+ user.getUserName() + "pass" + user.getPassword());
		System.out.println("..." + adminDao);
		adminDao.addUser(user);
		System.out.println("user add.........");
		// map.put("sucess", "user has created");
		return "addUser";
	}
	
	public void test(){
		System.out.println("Added by Aruna");
		System.out.println(" Added Test Method !!!!!!!!!!!!!");

		System.out.println("some add changes by ammu");
		System.out.println("added new sysout by Siva");
		
	}

	/*
	 * when admin menu is clicked control comes here,this method will executed
	 * and admin.jsp will be open
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public void admin() {

		System.out.println("this is Admin controller");
	}

	/*
	 * when in admin page clicks on add new employee hyperlink comes here, and
	 * execute this method and display addemployee.jsp
	 */
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public void employeeForm(@ModelAttribute("emp") Employee employee,
			ModelMap map) {
		map.put("operation", "save");
		System.out
				.println("this is the addEmployee() method in Admin controller ");

	}

	/* This method is used to store the employee data into data base */

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(
			@Valid @ModelAttribute("emp") Employee employeepojo,
			BindingResult result, ModelMap map) {
		map.put("operation", "save");
		if (result.hasErrors())

			return "addEmployee";

		adminDao.addEmployee(employeepojo);
		System.out
				.println("this is the addEmployee() method in Admin controller ");
		return "admin";
	}

	/*
	 * This method is executed when user clicked delete/view/update hyperlink in
	 * Admin page.
	 */
	@RequestMapping(value = "/viewEmp", method = RequestMethod.GET)
	public String viewEmp(@ModelAttribute("emp") Employee employeePojo,
			ModelMap map) {

		map.put("employeeList", adminDao.viewEmp());

		System.out.println("this is viewEmp() method in EmployeeController");
		return "viewEmp";
	}

	/* this method is executed when user clicked delete hyper link in Admin page */
	@RequestMapping(value = "/deleteEmp", method = RequestMethod.GET)
	public String deleteEmp(@RequestParam("empId") Integer id) {

		adminDao.deleteEmp(id);
		System.out
				.println("this is deleteEmp() method in emp controller after deleteteEmp() executed");
		return "viewEmp";
	}

	/* this method is executed when user clicked update hyper link in Admin page */
	@RequestMapping(value = "/updateEmp", method = RequestMethod.GET)
	public String updateEmps(@RequestParam("empId") Integer id,
			@ModelAttribute("emp") Employee employeePojo, ModelMap map) {
		System.out.println("update employee............");
		map.put("emp", adminDao.getEmp(id));
		map.put("operation", "update");

		System.out
				.println("this is UpdateEmp() get method in EmployeeController");
		return "addEmployee";
	}

	/*
	 * this method is used to update the employee details it will return
	 * addEmployee.jsp along with details of a employee.
	 */
	@RequestMapping(value = "/updateEmp", method = RequestMethod.POST)
	public String updateEmp(
			@Valid @ModelAttribute("emp") Employee employeePojo,
			BindingResult result, ModelMap map) {
		map.put("operation", "update");
		if (result.hasErrors())
			return "addEmployee";

		System.out.println("update employee post............"
				+ employeePojo.getEmpid() + "requstid");
		adminDao.updateEmp(employeePojo);

		System.out
				.println("this is UpdateEmp() post method in EmployeeController");
		return "admin";

	}

	/*
	 * exception handling for this controller
	 * 
	 * @ExceptionHandler(Exception.class) public String exception(Exception e) {
	 * // TODO Auto-generated method stub
	 * 
	 * System.out
	 * .println("this is from exception method in Employee controller ");
	 * 
	 * return "admin"; }
	 */
}
