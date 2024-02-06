package com.customer.CustomerNew.Service;

import com.customer.CustomerNew.RequestDto.CustomerRequest;
import com.customer.CustomerNew.RequestDto.LoginRequest;
import com.customer.CustomerNew.ResponseDto.CustomerResponse;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerRequest customerRequest);

    LoginMesage loginCustomer(LoginRequest loginRequest);

}















//    public void createCustomer(CustomerRequest customerRequest);
//
//    public  List<CustomerResponse> getAllCustomer();
//
//    public  CustomerResponse getCustomerById(Long id);
//
//    public void updateCustomer(CustomerRequest customerRequest);
//
//    public void deleteCustomer(Long id);



}
