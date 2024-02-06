package com.customer.CustomerNew.RequestDto;

import com.customer.CustomerNew.entities.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {
    private Long id;
    private String name;
    private Long address_id;

}
