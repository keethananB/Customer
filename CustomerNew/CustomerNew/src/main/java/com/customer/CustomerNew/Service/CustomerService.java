package com.customer.CustomerNew.Service;

import com.customer.CustomerNew.RequestDto.CustomerRequest;
import com.customer.CustomerNew.RequestDto.EmployeeRequest;
import com.customer.CustomerNew.ResponseDto.CustomerResponse;
import com.customer.CustomerNew.ResponseDto.EmployeeResponse;

import java.util.List;

public interface CustomerService {
    public void createCustomer(CustomerRequest customerRequest);

    public  List<CustomerResponse> getAllCustomer();

    public  CustomerResponse getCustomerById(Long id);

    public void updateCustomer(CustomerRequest customerRequest);

    public void deleteCustomer(Long id);



}
