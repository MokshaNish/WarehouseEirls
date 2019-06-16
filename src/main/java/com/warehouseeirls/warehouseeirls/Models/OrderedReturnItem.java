package com.warehouseeirls.warehouseeirls.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.*;

@Entity
public class OrderedReturnItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String prd_id;
    private double qty;

//   @JsonIgnore
    @ManyToOne
    @JoinColumn
    @JsonIgnoreProperties("ordered_id")
     private ReturnItemNote returnItemNote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrd_id() {
        return prd_id;
    }

    public void setPrd_id(String prd_id) {
        this.prd_id = prd_id;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public ReturnItemNote getReturnItemNote() {
        return returnItemNote;
    }

    public void setReturnItemNote(ReturnItemNote returnItemNote) {
        this.returnItemNote = returnItemNote;
    }
}
