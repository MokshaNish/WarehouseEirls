package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.ShippingNote;
import com.warehouseeirls.warehouseeirls.Repositories.ShippingNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shippingNote")
public class ShippingNoteController {

    @Autowired
    ShippingNoteRepository shippingNoteRepo;

    @GetMapping("/{id}")
    public Optional<ShippingNote> get(@PathVariable int id){
        return shippingNoteRepo.findById(id);
    }

    @GetMapping
    public List<ShippingNote> getAll(){
        return shippingNoteRepo.findAll();
    }

    @PostMapping
    public ShippingNote add(@RequestBody ShippingNote shippingNote){
        return shippingNoteRepo.save(shippingNote);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        shippingNoteRepo.deleteById(id);
    }

    @PutMapping
    public ShippingNote update(@RequestBody ShippingNote item){
        return shippingNoteRepo.save(item);
    }

}
