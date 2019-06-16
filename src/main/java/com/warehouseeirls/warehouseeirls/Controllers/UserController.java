package com.warehouseeirls.warehouseeirls.Controllers;


import com.warehouseeirls.warehouseeirls.Models.ItemDetail;
import com.warehouseeirls.warehouseeirls.Models.User;
import com.warehouseeirls.warehouseeirls.Repositories.ItemDetailRepository;
import com.warehouseeirls.warehouseeirls.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> get(@PathVariable int id){
        return userRepository.findById(id);
    }

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping("/auth")
    public User add(@RequestBody User user){
        return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userRepository.deleteById(id);
    }
}
