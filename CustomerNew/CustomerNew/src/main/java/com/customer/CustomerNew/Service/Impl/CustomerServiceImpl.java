package com.customer.CustomerNew.Service.Impl;

import com.customer.CustomerNew.Repository.CustomerRepository;
import com.customer.CustomerNew.RequestDto.CustomerRequest;
import com.customer.CustomerNew.ResponseDto.CustomerResponse;
import com.customer.CustomerNew.ResponseDto.EmployeeResponse;
import com.customer.CustomerNew.Service.CustomerService;
import com.customer.CustomerNew.entities.Address;
import com.customer.CustomerNew.entities.Customer;
import com.customer.CustomerNew.entities.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void createCustomer(CustomerRequest customerRequest) {
        Customer customer=new Customer();
        Address address=new Address();
        address.setId(customerRequest.getAddress_id());
        customer.setAddress(address);
//        customer.setId(customerRequest.getId());
//        customer.setName(customerRequest.getName());
        BeanUtils.copyProperties(customerRequest,customer);
        customerRepository.save(customer);

    }

    @Override
    public List<CustomerResponse> getAllCustomer() {
        List<Customer> customerList=customerRepository.findAll();
        List<CustomerResponse> customerResponseList=new ArrayList<>();
        for (Customer customer:customerList) {
            CustomerResponse customerResponse=new CustomerResponse();
            customerResponse.setAddressCity(customer.getAddress().getCity());
            BeanUtils.copyProperties(customer,customerResponse);
            customerResponseList.add(customerResponse);
        }
        return customerResponseList;
    }

    @Override
    public CustomerResponse getCustomerById(Long id) {

        CustomerResponse customerResponse=new CustomerResponse();
        Customer customer=customerRepository.findById(id).get();
        BeanUtils.copyProperties(customer,customerResponse);

        return customerResponse;
    }

    @Override
    public void updateCustomer(CustomerRequest customerRequest) {
        Customer customer=customerRepository.findById((customerRequest.getId())).get();
        BeanUtils.copyProperties(customerRequest,customer);
        customerRepository.save(customer);

    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);

    }
}
