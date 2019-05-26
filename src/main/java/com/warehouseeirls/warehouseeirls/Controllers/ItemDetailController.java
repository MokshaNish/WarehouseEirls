package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.ItemDetail;
import com.warehouseeirls.warehouseeirls.Repositories.ItemDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itemDetail")
public class ItemDetailController {

    @Autowired
    ItemDetailRepository itemDetailRepo;

    @GetMapping("/{id}")
    public Optional<ItemDetail> get(@PathVariable int id){
        return itemDetailRepo.findById(id);
    }

    @GetMapping
    public List<ItemDetail> getAll(){
        return itemDetailRepo.findAll();
    }

    @PostMapping
    public ItemDetail add(@RequestBody ItemDetail itemDetail){
        return itemDetailRepo.save(itemDetail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        itemDetailRepo.deleteById(id);
    }
}
