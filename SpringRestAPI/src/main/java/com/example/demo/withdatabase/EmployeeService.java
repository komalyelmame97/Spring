package com.example.demo.withdatabase;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

		@Autowired
		private EmployeeRepository eRepository;  //object created
		
		public List<Employee> getEmployees()
		{
			return eRepository.findAll();
		}
		
		public Employee addEmployee(Employee employee)
		{
			return eRepository.save(employee);
		}
		
		public Employee getEmployeeDetailById(int id)
		{
			return eRepository.findById(id).get();
		}
		
		public List<Employee> searchByName(String name){
		return this.eRepository.findByEmpName(name);//coursedap u provide repository obj name
			}

		
//		public Employee getEmployee(String name) 
//		{
//			return eRepository.findByName(name).getName();
//		}
		
		
		public void deleteEmployee(int empId)
		{
			 eRepository.deleteById(empId);
			 
		}
		
		public Employee updateEmployee(int empId,Employee employee)
		{
			employee.setId(empId);
			return eRepository.save(employee);
		}
		
		
}
