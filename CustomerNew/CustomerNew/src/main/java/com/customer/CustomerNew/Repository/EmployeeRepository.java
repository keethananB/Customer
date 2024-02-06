package com.customer.CustomerNew.Repository;

import com.customer.CustomerNew.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
