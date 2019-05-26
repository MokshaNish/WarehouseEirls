package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.ItemDetail;
import com.warehouseeirls.warehouseeirls.Models.TransactionDetail;
import com.warehouseeirls.warehouseeirls.Repositories.ItemDetailRepository;
import com.warehouseeirls.warehouseeirls.Repositories.TransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TransactionDetail")
public class TransactionDetailController {

    @Autowired
    TransactionDetailRepository transactionDetailRepo;

    @GetMapping("/{id}")
    public Optional<TransactionDetail> get(@PathVariable int id){
        return transactionDetailRepo.findById(id);
    }

    @GetMapping
    public List<TransactionDetail> getAll(){
        return transactionDetailRepo.findAll();
    }

    @PostMapping
    public TransactionDetail add(@RequestBody TransactionDetail transactionDetail){
        return transactionDetailRepo.save(transactionDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        transactionDetailRepo.deleteById(id);
    }
}

