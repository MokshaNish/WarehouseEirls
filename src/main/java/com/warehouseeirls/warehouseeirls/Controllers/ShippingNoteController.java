package com.warehouseeirls.warehouseeirls.Controllers;

import com.warehouseeirls.warehouseeirls.Models.ReturnItemNote;
import com.warehouseeirls.warehouseeirls.Models.ShippingNote;
import com.warehouseeirls.warehouseeirls.Repositories.ShippingNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shippingNote")
public class ShippingNoteController {

    @Autowired
    ShippingNoteRepository shippingNoteRepo;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Optional<ShippingNote> get(@PathVariable int id){
        getShippingNote();
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

    @GetMapping("/all")
    public List<ShippingNote> getShippingNote() {
        String theUrl = "https://api.myjson.com/bins/emud9/";
        ResponseEntity<List<ShippingNote>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<ShippingNote>>() {
        });
        List<ShippingNote> shipNote = response.getBody();
        return shippingNoteRepo.saveAll(shipNote);

    }

}
