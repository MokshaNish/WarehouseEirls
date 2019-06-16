package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.OrderItem;
import com.warehouseeirls.warehouseeirls.Models.ReturnItemNote;
import com.warehouseeirls.warehouseeirls.Repositories.OrderItemRepository;
import com.warehouseeirls.warehouseeirls.Repositories.ReturnItemNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderItemController {

    @Autowired
    OrderItemRepository orderItemRepo;


    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/{id}")
    public Optional<OrderItem> get(@PathVariable int id){
        return orderItemRepo.findById(id);
    }

    @GetMapping
    public List<OrderItem> getAll(){
        return orderItemRepo.findAll();
    }

//    @GetMapping("/all")
//    public List<OrderItem> getAllCompletedOrders() {
//        String theUrl = "https://api.myjson.com/bins/1akk11";
//        ResponseEntity<List<OrderItem>> response = restTemplate.exchange(theUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<OrderItem>>() {
//        });
//        List<OrderItem> completedOrderItems = response.getBody();
//        return orderItemRepo.saveAll(completedOrderItems);
//
//    }
}
