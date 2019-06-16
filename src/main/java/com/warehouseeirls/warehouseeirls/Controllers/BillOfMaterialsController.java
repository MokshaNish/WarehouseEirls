package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.BillOfMaterials;
import com.warehouseeirls.warehouseeirls.Repositories.BillOfMaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/billOfMaterials")
public class BillOfMaterialsController {

    @Autowired
    BillOfMaterialsRepository billOfMaterialsRepo;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Optional<BillOfMaterials> get(@PathVariable int id){
        return billOfMaterialsRepo.findById(id);
    }

    @GetMapping
    public List<BillOfMaterials> getAll(){
         //getTodos();
        return billOfMaterialsRepo.findAll();
    }


    @PostMapping
    public List<BillOfMaterials> recordBOMDetails(@RequestBody List<BillOfMaterials> bom){
        return billOfMaterialsRepo.saveAll(bom);
    }

    @PutMapping
    public BillOfMaterials update(@RequestBody BillOfMaterials bom){
        return billOfMaterialsRepo.save(bom);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        billOfMaterialsRepo.deleteById(id);
    }

//    public List<BillOfMaterials> getTodos() {
//        String theUrl = "https://jsonplaceholder.typicode.com/todos";
//        ResponseEntity<List<BillOfMaterials>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<BillOfMaterials>>() {
//        });
//        List<BillOfMaterials> billOfMaterialsList = response.getBody();
//        return billOfMaterialsRepo.saveAll(billOfMaterialsList);
//
//    }

}
