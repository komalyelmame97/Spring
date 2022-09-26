package com.example.demo.withdatabase;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByEmpName(String name);

//	public Employee findByName(String name);
}
