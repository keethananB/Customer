package com.customer.CustomerNew.RequestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {
    private Long id;
    private String name;
    private String email;
    private String password;
}
