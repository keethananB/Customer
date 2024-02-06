package com.customer.CustomerNew.RequestDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    public String LoginName;
    public Long LoginPassword;
}
