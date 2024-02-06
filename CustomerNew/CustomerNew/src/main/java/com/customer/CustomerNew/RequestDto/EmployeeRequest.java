package com.customer.CustomerNew.RequestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequest {
    private Long id;
    private  String name;
    private Long age;
    private Long marks;

    private Long addressId;
}
