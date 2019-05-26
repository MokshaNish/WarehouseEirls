package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.SupplierGood;
import com.warehouseeirls.warehouseeirls.Repositories.SupplierGoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/supplierGood")
public class SupplierGoodController {

    @Autowired
    SupplierGoodRepository supplierGoodRepo;

    @GetMapping("/{id}")
    public Optional<SupplierGood> get(@PathVariable int id){
        return supplierGoodRepo.findById(id);
    }

    @GetMapping
    public List<SupplierGood> getAll(){
        return supplierGoodRepo.findAll();
    }

    @PostMapping
    public SupplierGood add(@RequestBody SupplierGood supplierGood){
        return supplierGoodRepo.save(supplierGood);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        supplierGoodRepo.deleteById(id);
    }

}
