package com.customer.CustomerNew.ResponseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {
    private Long id;
    private  String name;
    private Long age;
    private Long marks;


    private String address_city;
    private String addressId;

}
