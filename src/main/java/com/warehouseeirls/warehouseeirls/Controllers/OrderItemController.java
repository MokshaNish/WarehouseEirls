package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.OrderItem;
import com.warehouseeirls.warehouseeirls.Models.ReturnItemNote;
import com.warehouseeirls.warehouseeirls.Repositories.OrderItemRepository;
import com.warehouseeirls.warehouseeirls.Repositories.ReturnItemNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderItemController {

    @Autowired
    OrderItemRepository orderItemRepo;

    @GetMapping("/{id}")
    public Optional<OrderItem> get(@PathVariable int id){
        return orderItemRepo.findById(id);
    }

    @GetMapping
    public List<OrderItem> getAll(){
        return orderItemRepo.findAll();
    }
}
