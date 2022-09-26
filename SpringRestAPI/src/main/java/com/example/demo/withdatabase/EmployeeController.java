package com.example.demo.withdatabase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService eService;
	
	@GetMapping("/employee")
	public List<Employee> getEmployee()
	{
		return this.eService.getEmployees();
	}
	
//	@PostMapping("/addemployee")   //same but message not diplay
//	public Employee addEmployee(@RequestBody Employee employee)
//	{
//		return this.eService.addEmployee(employee);
//	}
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		this.eService.addEmployee(employee);
		return "Employee added Sucessfully";
	}
	
	@GetMapping("/employeedetailbyid")
	public Employee getProductById(@RequestParam("eid") int id)
	{
		return this.eService.getEmployeeDetailById(id);
	}
	
	@GetMapping("/search/{name}")
	public List<Employee> findByEmpname(@PathVariable String name){
		return this.eService.searchByName(name);
	}

	
//	@GetMapping("/employeebyname/{name}")
//	public String getEmployee(@PathVariable String name)
//	{
//		 this.eService.getEmployees();
//		 return "Employee search by name";
//	}
	
	
      //DElete Record
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		this.eService.deleteEmployee(id);
		return "Employee has been deleted";
	}
	
	
	//Update
	@PutMapping("/updateemp/{id}")
	public Employee updateEmployee(@PathVariable("id") int empId,@RequestBody Employee employee)
	{
		return eService.updateEmployee(empId, employee);
	}
	
}