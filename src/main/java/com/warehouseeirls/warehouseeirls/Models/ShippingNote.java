package com.warehouseeirls.warehouseeirls.Models;

import com.fasterxml.jackson.annotation.JsonAlias;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShippingNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonAlias("ord_id")
    private int orderItemId;
//    private int itemId;
//    private int quantity;
    @JsonAlias("address")
    private String shippingAddress;
    //private String shippingMode;
    //private String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
