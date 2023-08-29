package com.example.registation.Service.impl;

import com.example.registation.Dto.EmployeeDTO;
import com.example.registation.Entity.Employee;
import com.example.registation.Repo.EmployeeRepo;
import com.example.registation.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee(

                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getAddress(),
                employeeDTO.getMobile()

        );
        employeeRepo.save(employee);

        return employee.getEmployeename();
    }
}
