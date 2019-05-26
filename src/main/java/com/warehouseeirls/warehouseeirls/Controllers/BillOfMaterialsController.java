package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.BillOfMaterials;

import com.warehouseeirls.warehouseeirls.Repositories.BillOfMaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/billOfMaterials")
public class BillOfMaterialsController {

    @Autowired
    BillOfMaterialsRepository billOfMaterialsRepo;

    @GetMapping("/{id}")
    public Optional<BillOfMaterials> get(@PathVariable int id){
        return billOfMaterialsRepo.findById(id);
    }

    @GetMapping
    public List<BillOfMaterials> getAll(){
        return billOfMaterialsRepo.findAll();
    }

    @PostMapping
    public BillOfMaterials add(@RequestBody BillOfMaterials masterStockRecord){
        return billOfMaterialsRepo.save(masterStockRecord);
    }

    @PutMapping
    public BillOfMaterials update(@RequestBody BillOfMaterials bom){
        return billOfMaterialsRepo.save(bom);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billOfMaterialsRepo.deleteById(id);
    }



}
