package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int price;
    int sortOrder;
    boolean active;

    public Product() {

    }

    public int getId () {
        return  id;
    }
    public String getName () {
        return  name;
    }
    public int getPrice () {
        return  price;
    }
    public boolean getActive () {
        return  active;
    }
    public int getSortOrder () {
        return  sortOrder;
    }
}
