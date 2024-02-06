package com.customer.CustomerNew.Controller;


import com.customer.CustomerNew.RequestDto.EmployeeRequest;
import com.customer.CustomerNew.ResponseDto.EmployeeResponse;
import com.customer.CustomerNew.Service.EmployeeService;
import com.customer.CustomerNew.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmployeeController {
@Autowired
private EmployeeService employeeService;

   @PostMapping("/createEmployee")
    public void createEmployee(@RequestBody EmployeeRequest employeeRequest)
{
    employeeService.createEmployee(employeeRequest);
}

    @GetMapping("/getAllEmployee")
    public List<EmployeeResponse> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/getEmployeeById/{id}")
    public EmployeeResponse getCustomerById(@PathVariable Long id)
    {
        return employeeService.getEmployeesById(id);
    }

    @PutMapping("/updateEmployee")
    public void updateEmployee(@RequestBody EmployeeRequest employeeRequest)
    {
        employeeService.updateemployee(employeeRequest);
    }
    @DeleteMapping("DeleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Long id)
    {
        employeeService.deleteEmployee(id);
    }

}


