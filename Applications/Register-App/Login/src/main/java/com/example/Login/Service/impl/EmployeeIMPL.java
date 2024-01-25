package com.example.Login.Service.impl;

import com.example.Login.Dto.EmployeeDTO;
import com.example.Login.Entity.Employee;
import com.example.Login.Repo.EmployeeRepo;
import com.example.Login.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public String addEmployee(EmployeeDTO employeeDTO){

        Employee employee =  new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getAddress()
        );

        employeeRepo.save(employee);
        return employee.getEmployeename();

    }
}
