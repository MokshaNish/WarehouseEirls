package com.warehouseeirls.warehouseeirls.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class ReturnItemNote {



   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private int rid;
   @Id
   @JsonAlias("ord_id")
    private String orderItemId;

   @JsonAlias("return_type")
    private String status;

//   @JsonIgnoreProperties("returnItemNote")
//   private String returnItemNote;
//    @JsonIgnore
    @OneToMany(mappedBy = "returnItemNote", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<OrderedReturnItem> ordered_id;



//    public int getRid() {
//        return rid;
//    }
//
//    public void setRid(int rid) {
//        this.rid = rid;
//    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderedReturnItem> getOrdered_id() {
        return ordered_id;
    }

    public void setOrdered_id(List<OrderedReturnItem> ordered_id) {
        this.ordered_id = ordered_id;
    }

//    public String getReturnItemNote() {
//        return returnItemNote;
//    }
//
//    public void setReturnItemNote(String returnItemNote) {
//        this.returnItemNote = returnItemNote;
//    }

    //    public List<OrderedReturnItem> getOrderedReturnItems() {
//        return orderedReturnItems;
//    }
//
//    public void setOrderedReturnItems(List<OrderedReturnItem> orderedReturnItems) {
//        this.orderedReturnItems = orderedReturnItems;
//    }
}
