package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.Employee;
import com.warehouseeirls.warehouseeirls.Models.TransactionDetail;
import com.warehouseeirls.warehouseeirls.Repositories.EmployeeRepository;
import com.warehouseeirls.warehouseeirls.Repositories.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/{id}")
    public Optional<Employee> get(@PathVariable int id){
        return employeeRepo.findById(id);
    }

    @GetMapping
    public List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        employeeRepo.deleteById(id);
    }
}

