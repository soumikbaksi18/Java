package com.developer.employee_management.repository;

import com.developer.employee_management.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class EmployeeRepository implements JpaRepository<EmployeeEntity, Long> {
}
