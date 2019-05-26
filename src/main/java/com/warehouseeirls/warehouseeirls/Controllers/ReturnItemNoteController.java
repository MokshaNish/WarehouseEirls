package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.ReturnItemNote;
import com.warehouseeirls.warehouseeirls.Repositories.ReturnItemNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/returnNote")
public class ReturnItemNoteController {

    @Autowired
    ReturnItemNoteRepository returnNoteRepo;

    @GetMapping("/{id}")
    public Optional<ReturnItemNote> get(@PathVariable int id){
        return returnNoteRepo.findById(id);
    }

    @GetMapping
    public List<ReturnItemNote> getAll(){
        return returnNoteRepo.findAll();
    }

    @PostMapping
    public ReturnItemNote add(@RequestBody ReturnItemNote returnNote){
        return returnNoteRepo.save(returnNote);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        returnNoteRepo.deleteById(id);
    }
}
