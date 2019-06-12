package com.warehouseeirls.warehouseeirls.Repositories;

import com.warehouseeirls.warehouseeirls.Models.OrderItem;
import com.warehouseeirls.warehouseeirls.Models.ReturnItemNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {
}
