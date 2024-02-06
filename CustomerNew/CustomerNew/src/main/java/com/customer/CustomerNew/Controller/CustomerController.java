package com.customer.CustomerNew.Controller;

import com.customer.CustomerNew.RequestDto.CustomerRequest;
import com.customer.CustomerNew.RequestDto.EmployeeRequest;
import com.customer.CustomerNew.ResponseDto.CustomerResponse;
import com.customer.CustomerNew.ResponseDto.EmployeeResponse;
import com.customer.CustomerNew.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/createCustomer")
    public void createCustomer(@RequestBody CustomerRequest customerRequest)
    {
        customerService.createCustomer(customerRequest);
    }
    @GetMapping("/getAllCustomer")
    public List<CustomerResponse> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }
    @GetMapping("/getCustomerById/{id}")
    public CustomerResponse getCustomerById(@PathVariable Long id)
    {
        return customerService.getCustomerById(id);
    }
    @PutMapping("/updateCustomer")
    public void updateCustomer(@RequestBody CustomerRequest customerRequest)
    {
        customerService.updateCustomer(customerRequest);
    }
    @DeleteMapping("DeleteCustomer/{id}")
    public void deleteCustomer(@PathVariable Long id)
    {
        customerService.deleteCustomer(id);
    }

}



