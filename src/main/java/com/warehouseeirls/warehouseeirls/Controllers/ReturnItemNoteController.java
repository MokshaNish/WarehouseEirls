package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.ReturnItemNote;
import com.warehouseeirls.warehouseeirls.Repositories.ReturnItemNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/returnNote")
public class ReturnItemNoteController {

    @Autowired
    ReturnItemNoteRepository returnNoteRepo;

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/{id}")
    public Optional<ReturnItemNote> get(@PathVariable int id){
        return returnNoteRepo.findById(id);
    }

    @GetMapping
    public List<ReturnItemNote> getAll(){
        getReturnItems();
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

@GetMapping("/all")
    public List<ReturnItemNote> getReturnItems() {
        String theUrl = "https://api.myjson.com/bins/n3vul";
        ResponseEntity<List<ReturnItemNote>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<ReturnItemNote>>() {
        });
        List<ReturnItemNote> returnItems = response.getBody();
        return returnNoteRepo.saveAll(returnItems);

    }

    }
