package com.customer.CustomerNew.Repository;

import com.customer.CustomerNew.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
