package com.customer.CustomerNew.Service.Impl;


import com.customer.CustomerNew.Repository.EmployeeRepository;
import com.customer.CustomerNew.RequestDto.EmployeeRequest;
import com.customer.CustomerNew.ResponseDto.EmployeeResponse;
import com.customer.CustomerNew.Service.EmployeeService;
import com.customer.CustomerNew.entities.Address;
import com.customer.CustomerNew.entities.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void createEmployee(EmployeeRequest employeeRequest)
    {
        Employee employee=new Employee();
        Address address=new Address();
        address.setId(employeeRequest.getAddressId());
        employee.setAddress(address);
        BeanUtils.copyProperties(employeeRequest,employee);
        employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeResponse> getAllEmployee() {
        List<EmployeeResponse> employeeResponseList = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();
        for (Employee employee : employeeList) {
            EmployeeResponse employeeResponse = new EmployeeResponse();
            employeeResponse.setAddress_city(employee.getAddress().getCity());
            BeanUtils.copyProperties(employee,employeeResponse);
            employeeResponseList.add(employeeResponse);
        }
        return employeeResponseList;

    }

    @Override
    public EmployeeResponse getEmployeesById(Long id) {
        EmployeeResponse employeeResponse=new EmployeeResponse();
        Employee employee=employeeRepository.findById(id).get();
       employeeResponse.setAddress_city(employee.getAddress().getCity());
        BeanUtils.copyProperties(employee,employeeResponse);

        return employeeResponse;
    }

    @Override
    public void updateemployee(EmployeeRequest employeeRequest)
    {

        Employee employee=employeeRepository.findById((employeeRequest.getId())).get();
        Address address=new Address();
        address.setId(employeeRequest.getAddressId());
        employee.setAddress(address);
        BeanUtils.copyProperties(employeeRequest,employee);
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }

}