package com.warehouseeirls.warehouseeirls.Repositories;

import com.warehouseeirls.warehouseeirls.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);
}
