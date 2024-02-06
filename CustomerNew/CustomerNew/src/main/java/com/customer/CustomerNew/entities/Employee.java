package com.customer.CustomerNew.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private Long age;
    private Long marks;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;


}
