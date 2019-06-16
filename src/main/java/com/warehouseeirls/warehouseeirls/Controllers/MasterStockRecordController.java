package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.ItemDetail;
import com.warehouseeirls.warehouseeirls.Models.MasterStockRecord;
import com.warehouseeirls.warehouseeirls.Repositories.ItemDetailRepository;
import com.warehouseeirls.warehouseeirls.Repositories.MasterStockRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/masterStockRecord")
public class MasterStockRecordController {

    @Autowired
    MasterStockRecordRepository masterStockRecordRepo;

    @GetMapping("/{id}")
    public Optional<MasterStockRecord> get(@PathVariable int id){
        return masterStockRecordRepo.findById(id);
    }

    @GetMapping
    public List<MasterStockRecord> getAll(){
        return masterStockRecordRepo.findAll();
    }

    @PostMapping
    public MasterStockRecord add(@RequestBody MasterStockRecord masterStockRecord){
        return masterStockRecordRepo.save(masterStockRecord);
    }

    @PostMapping("/saveAll")
    public List<MasterStockRecord> addAllGoods(@RequestBody List<MasterStockRecord> allGoods){
        return masterStockRecordRepo.saveAll(allGoods);
    }

    @PutMapping
    public MasterStockRecord update(@RequestBody MasterStockRecord masterStock){
        return masterStockRecordRepo.save(masterStock);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        masterStockRecordRepo.deleteById(id);
    }



}
