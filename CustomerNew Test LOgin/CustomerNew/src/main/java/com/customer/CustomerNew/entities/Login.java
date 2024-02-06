package com.customer.CustomerNew.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Login {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String LoginName;
    public Long LoginPassword;

}
