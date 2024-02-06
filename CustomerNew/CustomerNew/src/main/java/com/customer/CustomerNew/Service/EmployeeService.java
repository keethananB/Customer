package com.customer.CustomerNew.Service;

import com.customer.CustomerNew.RequestDto.EmployeeRequest;
import com.customer.CustomerNew.ResponseDto.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    public void createEmployee(EmployeeRequest employeeRequest);

    public  List<EmployeeResponse> getAllEmployee();

    public  EmployeeResponse getEmployeesById(Long id);

    public void updateemployee(EmployeeRequest employeeRequest);

    public void deleteEmployee(Long id);


    }
