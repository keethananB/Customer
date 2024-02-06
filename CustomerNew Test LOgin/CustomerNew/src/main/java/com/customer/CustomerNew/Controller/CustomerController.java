package com.customer.CustomerNew.Controller;

import com.customer.CustomerNew.Service.CustomerService;
import com.customer.CustomerNew.entities.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1/customer")
public class CustomerController{

    @Autowired
    private CustomerService customerService;
    @PostMapping (path = "/save")
    public String save String Customer(RequestBody CustomerRequest customerRequest){
        String id=customerService.addCustomer(customerRequest);
        return id;

    }
    @PostMapping
    public RequestEntity<?>LoginCustomer(RequestBody LoginRequest loginRequest)
    {
        LoginMessage loginMessage=customerService.loginCustomer(loginRequest);
        return ResponseEntity.ok(loginMessage);



    }

}

//    @Autowired
//    private CustomerService customerService;
//    @PostMapping("/createCustomer")
//    public void createCustomer(@RequestBody CustomerRequest customerRequest)
//    {
//        customerService.createCustomer(customerRequest);
//    }
//    @GetMapping("/getAllCustomer")
//    public List<CustomerResponse> getAllCustomer()
//    {
//        return customerService.getAllCustomer();
//    }
//    @GetMapping("/getCustomerById/{id}")
//    public CustomerResponse getCustomerById(@PathVariable Long id)
//    {
//        return customerService.getCustomerById(id);
//    }
//    @PutMapping("/updateCustomer")
//    public void updateCustomer(@RequestBody CustomerRequest customerRequest)
//    {
//        customerService.updateCustomer(customerRequest);
//    }
//    @DeleteMapping("DeleteCustomer/{id}")
//    public void deleteCustomer(@PathVariable Long id)
//    {
//        customerService.deleteCustomer(id);
//    }
//
//}



