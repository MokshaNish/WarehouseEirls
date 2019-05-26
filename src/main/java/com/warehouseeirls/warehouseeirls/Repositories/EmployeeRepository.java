package com.warehouseeirls.warehouseeirls.Repositories;

import com.warehouseeirls.warehouseeirls.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
}
